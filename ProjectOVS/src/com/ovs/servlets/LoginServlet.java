package com.ovs.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ovs.dao.OperationHandler;
import com.ovs.dao.OperationHandlerInterface;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	OperationHandlerInterface handlerInterface=new OperationHandler();
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		PrintWriter printWriter=response.getWriter();
		printWriter.println(handlerInterface.loginHandler(email, password));
	}

}
