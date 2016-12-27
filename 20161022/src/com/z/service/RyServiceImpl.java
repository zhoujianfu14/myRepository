package com.z.service;

import java.util.List;

import com.z.dao.BaseDaoImpl;
import com.z.domain.TRyb;

public class RyServiceImpl implements RyService{
	
	BaseDaoImpl<TRyb> ryDao;
	
	public void setRyDao(BaseDaoImpl<TRyb> ryDao) {
		this.ryDao = ryDao;
	}

	@Override
	public String auth(String username, String password) {
		List list = (List) ryDao.findByPropertyName("from TRyb where rybh=? and mm=?",username,password);
		if(list.size()>0){
			return "1";
		}else{
			return "0";
		}
	}

}
