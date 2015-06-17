package com.starsguide.dao;

import java.util.List;

import com.starsguide.pojo.Menu;

public interface MenuDao extends BaseDao<Menu> {
	
	public List<Menu> getAllBaseMenu();

}
