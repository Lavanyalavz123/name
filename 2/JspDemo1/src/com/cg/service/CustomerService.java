package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Customer;
import com.cg.dao.CustomerDao;
import com.cg.dao.ICustomerDao;

public class CustomerService implements ICustomerService{

	ICustomerDao dao=null;
	public CustomerService() {
		dao=new CustomerDao();
	}
	public ArrayList<Customer> viewAllCustomer(){
		
		return dao.viewAllCustomer();
	}
	
	@Override
	public boolean addCustomer(Customer cust) {
		// call to dao
		dao=new CustomerDao();
		
		return dao.addCustomer(cust);
	}

}
