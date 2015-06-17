package com.starsguide.common.util;

import com.google.gson.Gson;
import com.starsguide.pojo.Product;
import com.starsguide.pojo.User;
import com.taobao.api.domain.Item;

/**
 * json converter
 * @author Administrator
 *
 */
public class JsonConverter {
	
	public static User convertUser(String userAuthInfoStr){
//		JSONObject jsonObj = net.sf.json.JSONObject.fromObject(userInformation);
//		UserInfoSG userInfo = (UserInfoSG)jsonObj.toBean(jsonObj, UserInfoSG.class);
		
		Gson gson = new Gson();
		User userInfo = gson.fromJson(userAuthInfoStr, User.class);
		return userInfo;
	}
	
	public static User mergeUser(User mergeFromUser,User mergeToUser){
		mergeToUser.setAccess_token(mergeFromUser.getAccess_token());
		mergeToUser.setRefresh_token(mergeFromUser.getRefresh_token());
		mergeToUser.setTaobao_user_id(mergeFromUser.getTaobao_user_id());
		mergeToUser.setTaobao_user_nick(mergeFromUser.getTaobao_user_nick());
		return mergeToUser;
	}
	
	public static Product mergeItem(Item itme){
		
		Product product = new Product();
		
		product.setCid(itme.getCid());
		product.setApprove_status(itme.getApproveStatus());
		product.setHas_discount(itme.getHasDiscount());
		product.setHas_invoice(itme.getHasInvoice());
		product.setHas_showcase(itme.getHasShowcase());
		product.setHas_warranty(itme.getHasWarranty());
		
		product.setNick(itme.getNick());
		product.setNum(itme.getNum());
		product.setNum_iid(itme.getNumIid());
		product.setPic_url(itme.getPicUrl());
		product.setPrice(itme.getPrice());
		product.setTitle(itme.getTitle());
		product.setType(itme.getType());
		
		product.setModified(itme.getModified());
		product.setList_time(itme.getListTime());
		product.setDelist_time(itme.getDelistTime());
		
		return product;
		
	}

}
