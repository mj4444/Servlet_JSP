package com.ovs.servlets;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ovs.bean.Address;
import com.ovs.bean.Person;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		Date dob=Date.valueOf(request.getParameter("dob"));
		String contactNo=request.getParameter("contactNo");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		Address address=new Address(request.getParameter("houseNo"), request.getParameter("street"), request.getParameter("block"), request.getParameter("district"), request.getParameter("city"), request.getParameter("state"), request.getParameter("country"));
		Person person=new Person(id, name, dob, contactNo, emailId, password, address);
		System.out.println(person);
	}

}
