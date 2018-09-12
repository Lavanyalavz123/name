package com.cg.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.bean.Customer;
import com.cg.service.CustomerService;
import com.cg.service.ICustomerService;

/**
 * Servlet implementation class ViewAllController
 */
@WebServlet("/viewall.do")
public class ViewAllController extends HttpServlet {
	
	ICustomerService serv=null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		serv=new CustomerService();
		System.out.println("in post - view");
		ArrayList<Customer> custList=serv.viewAllCustomer();
		System.out.println("in ctlr "+custList);
		request.setAttribute("cList",custList);
		request.getRequestDispatcher("Success.jsp").forward(request, response);
	}

}
