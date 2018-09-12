package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.Customer;

public interface ICustomerDao {
	boolean addCustomer(Customer cust);
	ArrayList<Customer> viewAllCustomer();
}
