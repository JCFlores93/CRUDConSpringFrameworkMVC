package com.hogar.system_comedor.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractCrudDao{
	
	@Autowired
	protected SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public Long save(Object entity) {
		return (Long)getSession().save(entity);		
	}

	public void update(Object entity) {
		getSession().update(entity);
	}
	
	public void delete(Object entity) {
		getSession().delete(entity);
	}

}
