package com.capgemini.loginapp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
       RequestDispatcher rd=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name =request.getParameter("username");
		String password =request.getParameter("userpassword");
		if("admin".equals(name) && "admin".equals(password))
		{
			
			LocalDate date=LocalDate.now();
			String datestring=date.toString();
			HttpSession session=request.getSession(true);
			
			session.setAttribute("name",name);
			session.setAttribute("date",datestring);
			rd=request.getRequestDispatcher("Success.jsp");
			rd.forward(request, response);
		
		}
		else
		{
			String msg="Please enter Correct Credentials";
			request.setAttribute("errormsg", msg);
			rd=request.getRequestDispatcher("Login.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
