package com.z.dao;

public interface BaseDao<T> {
	Object findByPropertyName(String hql,Object...objects);
}
