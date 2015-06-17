package com.starsguide.dao;

import com.starsguide.pojo.User;
import com.taobao.api.ApiException;

public interface UserDao extends BaseDao<User> {
	public String getSessionKeyByNick(String nick) throws ApiException;
}
