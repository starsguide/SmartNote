package com.starsguide.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.starsguide.dao.UserDao;
import com.starsguide.pojo.User;
import com.taobao.api.ApiException;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	public String getSessionKeyByNick(String nick) throws ApiException {
		Query query = em.createQuery("from Product where taobao_user_nick = ?");
		
		query.setParameter(0, nick);
		User user = (User)query.getSingleResult();
		
		return user.getAccess_token();
	}

}
