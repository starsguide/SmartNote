package com.starsguide.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.starsguide.common.AppProp;
import com.starsguide.common.util.JsonConverter;
import com.starsguide.pojo.Menu;
import com.starsguide.pojo.User;
import com.starsguide.service.UserService;
import com.taobao.api.internal.util.WebUtils;

@Controller
public class AuthenticationController extends BaseController{
	
	public static final Log LOG = LogFactory.getLog(AuthenticationController.class);
	
	/**
	 * user name and code
	 * 
	 * */
	static final Map<String, User> userCode = new HashMap<String, User>();

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "authentication")
	public String authentication(String code, String state, Map<String, Object> map) {
		Map<String,String> props=new HashMap<String,String>();
		props.put("grant_type","authorization_code");
	    props.put("code",code);
	    props.put("client_id",AppProp.APP_KEY);
	    props.put("client_secret",AppProp.APP_SECRET);
	    props.put("redirect_uri","http://127.0.0.1:8080/PerfectManager/authentication");
	    props.put("view","web");

    	User userSG = null;
		try {
			userSG = JsonConverter.convertUser(WebUtils.doPost(AppProp.AUTH_URL, props, 30000, 30000));
			map.put("sessionKey", userSG.getAccess_token());
			map.put("nick", userSG.getTaobao_user_nick());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userService.firstLogin(userSG);
		
		List<Menu> menus = userService.getAllBaseMenu();
		
//		Menu menus = userService.getMenu(new Long(14));
		
		map.put("menus", menus);
    	
		return "main";
	}
}
