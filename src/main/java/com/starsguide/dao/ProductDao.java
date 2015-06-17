package com.starsguide.dao;

import java.util.List;

import com.starsguide.pojo.Product;

public interface ProductDao extends BaseDao<Product> {
	
	public List<Product> getAllProductByNick(String nick);
	
}
