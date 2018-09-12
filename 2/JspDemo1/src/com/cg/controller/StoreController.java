package com.cg.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Customer;
import com.cg.service.CustomerService;
import com.cg.service.ICustomerService;

/**
 * Servlet implementation class StoreController
 */
@WebServlet("/store.do")
public class StoreController extends HttpServlet {
	
	ICustomerService serv=null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name =request.getParameter("cName");
		String city =request.getParameter("cCity");
		String mobile =request.getParameter("cMobile");
		String email =request.getParameter("cEmail");
		String address =request.getParameter("cAddress");
		Customer customer=new Customer(name, city, mobile, email, address);
		serv=new CustomerService();		
		boolean stat=serv.addCustomer(customer);
		RequestDispatcher rd=null;
		String target="";
		String msg="";
		if(stat==true){
			msg="data added successfully!!!";
			target="Success.jsp";
		}
		else
		{
			msg="data not added";	
			target="Home.jsp";
		}
		request.setAttribute("msg", msg);
		rd=request.getRequestDispatcher(target);
		rd.forward(request, response);
	}

}
