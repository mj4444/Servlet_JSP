package com.ovs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ovs.bean.Person;
import com.ovs.utility.ConnectionProvider;

public class DaoModel implements DaoInterface{

	@Override
	public String loginHandler(String email, String password) {
		Connection connection=ConnectionProvider.getConnection();
		String message="Email or Password is not correct";
		String loginQuery="SELECT * FROM personLogin WHERE emailId=? AND password=?";
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

	@Override
	public String registrationHandler(Person person) {
		int count=0;
		String message="User already exists";
		Connection connection=ConnectionProvider.getConnection();
		String regQuery="INSERT INTO PersonDetails VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
		String regQuery1="INSERT INTO PersonLogin VALUES(?,?)";
		PreparedStatement preparedStatement=null;
		try {
			preparedStatement=connection.prepareStatement(regQuery);
			preparedStatement.setString(1,person.getId());
			preparedStatement.setString(2, person.getName());
			preparedStatement.setDate(3, person.getDob());
			preparedStatement.setString(4, person.getContactNo());
			preparedStatement.setString(5, person.getEmailId());
			preparedStatement.setString(6, person.getAddress().getHouseNo());
			preparedStatement.setString(7, person.getAddress().getStreet());
			preparedStatement.setString(8, person.getAddress().getBlock());
			preparedStatement.setString(9, person.getAddress().getDistrict());
			preparedStatement.setString(10, person.getAddress().getCity());
			preparedStatement.setString(11, person.getAddress().getState());
			preparedStatement.setString(12, person.getAddress().getCountry());
			int result=preparedStatement.executeUpdate();
			System.out.println("PersonDetails Table Result:"+result);
			if(result>0)
				count++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			preparedStatement=connection.prepareStatement(regQuery1);
			preparedStatement.setString(1,person.getEmailId());
			preparedStatement.setString(2, person.getPassword());
			int result=preparedStatement.executeUpdate();
			System.out.println("PersonLogin Table Result:"+result);
			if(result>0)
				count++;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count==2)
			message="Successfully registered!";
		
		return message;
	}
	
}
