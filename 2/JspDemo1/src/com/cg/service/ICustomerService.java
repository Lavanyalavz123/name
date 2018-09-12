package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.Customer;

public interface ICustomerService {

	boolean addCustomer(Customer cust);
	ArrayList<Customer> viewAllCustomer();
}
