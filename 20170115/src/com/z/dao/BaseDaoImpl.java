package com.z.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoImpl<T> implements BaseDao<T>{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Object findByPropertyName(String hql, Object... objects) {
		Query query = getSession().createQuery(hql);
		if(objects!=null&&objects.length>0){
			for(int index=0;index<objects.length;index++){
				query.setParameter(index,objects[index]);
			} 
		}
		return query.list();
	}

}
