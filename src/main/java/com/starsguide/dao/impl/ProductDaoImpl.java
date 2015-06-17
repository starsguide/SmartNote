package com.starsguide.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.starsguide.dao.ProductDao;
import com.starsguide.pojo.Product;

@Repository
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao {
	
	public List<Product> getAllProductByNick(String nick) {
		Query query = em.createQuery("from Product where nick = ?");
		
		query.setParameter(0, nick);
		
		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList();
		return list;
	}
	
}
