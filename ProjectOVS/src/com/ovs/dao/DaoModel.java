package com.ovs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ovs.utility.ConnectionProvider;

public class DaoModel {
	public String doLogin(String email,String password){
		Connection connection=ConnectionProvider.getConnection();
		String message="Email or Password is not correct";
		String loginQuery="Select * from login where email=? and password=?";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(loginQuery);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			int result=preparedStatement.executeUpdate();
			if(result>0)
				message="Successfully logged In";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			message="Error Occurred";
		}
		ConnectionProvider.closeConnection();
		return message;
	}
}
