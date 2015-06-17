package com.starsguide.dao.impl;

import java.util.List;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.starsguide.dao.BaseDao;

public class BaseDaoImpl<T> implements BaseDao<T>{
 
	@PersistenceContext
    protected EntityManager em;
	
	private Class<T> clazz;
	
	
	protected BaseDaoImpl(){
		clazz = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	
    public void save(final T t) {
    	em.persist(t);
    }
    
    public void update(final T t) {
    	em.merge(t);
    }
    
    public T find(Object id) {
    	return em.find(clazz, id);
    }

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		Query query = em.createQuery("from " + clazz.getName());
		List<T> list = query.getResultList();
		return list;
	}

	public void saveBatch(List<T> entities) {
		for(T entity : entities){
			em.persist(entity);
		}
	}
}
