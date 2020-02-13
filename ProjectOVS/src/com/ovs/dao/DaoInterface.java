package com.ovs.dao;

import com.ovs.bean.Person;

public interface DaoInterface {

	public String loginHandler(String email,String password);
	
	public String registrationHandler(Person person);
	
}
