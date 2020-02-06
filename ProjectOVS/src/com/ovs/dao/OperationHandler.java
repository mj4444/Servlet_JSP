package com.ovs.dao;

public class OperationHandler implements OperationHandlerInterface {
	DaoModel daoModel=new DaoModel();
	public String loginHandler(String email, String password) {
		// TODO Auto-generated method stub
		return daoModel.doLogin(email,password);
	}
}
