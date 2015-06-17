package com.starsguide.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.starsguide.dao.MenuDao;
import com.starsguide.pojo.Menu;

@Repository
public class MenuDaoImpl extends BaseDaoImpl<Menu> implements MenuDao {

	public List<Menu> getAllBaseMenu() {
		Query query = em.createQuery("from Menu where parentMenu is null");
		List<Menu> list = query.getResultList();
		return list;
	}

}
