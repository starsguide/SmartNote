package com.starsguide.service.impl;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starsguide.common.AppEnum;
import com.starsguide.common.AppProp;
import com.starsguide.common.util.JsonConverter;
import com.starsguide.dao.MenuDao;
import com.starsguide.dao.ProductDao;
import com.starsguide.dao.UserDao;
import com.starsguide.pojo.Menu;
import com.starsguide.pojo.Product;
import com.starsguide.pojo.User;
import com.starsguide.rao.ItemRao;
import com.starsguide.rao.TmcRao;
import com.starsguide.service.UserService;
import com.taobao.api.ApiException;
import com.taobao.api.domain.Item;
import com.taobao.api.internal.util.WebUtils;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userConfigDao;
	@Autowired
	private MenuDao menuDao;
	
	@Autowired
	private TmcRao tmcRao;
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private ItemRao itemRao;
	
	public void firstLogin(User user) {
		// save user info into db
		saveUserInfo(user);
		List<Item> itmes = null;
		try {
			SENDREQUEST : itmes = itemRao.getItemsOnSale(user.getAccess_token());
			
			if(itmes != null){
				for(Item itme : itmes){
					Product product = JsonConverter.mergeItem(itme);
					productDao.save(product);
				}
			}
		} catch (ApiException e1) {
//			if(e1 instanceof SocketTimeoutException){
//				continue SENDREQUEST;
//			}
			e1.printStackTrace();
			
		}
		
		try {
			tmcRao.permitUserTmc(user.getAccess_token(), AppEnum.TmcTopic.ITEMDOWNSHELF);
			tmcRao.permitUserTmc(user.getAccess_token(), AppEnum.TmcTopic.TRADECREATE);
//			tmcRao.addUserTmcGroup(user.getTaobao_user_nick(), AppEnum.TmcGroup.ITEM.name());
		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void saveUserInfo(User userSG){
		userConfigDao.save(userSG);
	}
	
	
	public List<Menu> getAllBaseMenu(){
		return menuDao.getAllBaseMenu();
	}


	public Menu getMenu(Long id) {
		return menuDao.find(id);
	}


	public boolean refreshToken(String userId) {
		User user = userConfigDao.find(userId);
		System.out.println(" token :" + user.getAccess_token());
		
		Map<String, String> param = new HashMap<String, String>();
		param.put("grant_type", "refresh_token");
		param.put("refresh_token",user.getRefresh_token());
		param.put("client_id", AppProp.APP_KEY);
		param.put("client_secret", AppProp.APP_SECRET);
		param.put("view", "web");
		
		User userNew = null;
		try {
			userNew = JsonConverter.convertUser(WebUtils.doPost(AppProp.AUTH_URL, param, 3000, 3000));
			user = JsonConverter.mergeUser(userNew, user);
			
			userConfigDao.update(user);
			System.out.println("user " + user.getTaobao_user_id() + " updated ");
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
}
