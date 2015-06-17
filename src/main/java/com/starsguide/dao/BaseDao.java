package com.starsguide.dao;

import java.util.List;


public interface BaseDao<T>{
	
	public void save(final T t);
	
	public T find(Object id);
	
	public void update(final T t);
	
	public List<T> getAll();
	
	public void saveBatch(final List<T> entities);
}
