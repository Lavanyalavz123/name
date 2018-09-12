package com.cg.dao;

import java.util.ArrayList;

import com.cg.bean.Customer;

public class CustomerDao implements ICustomerDao {
	ArrayList<Customer> custList=null;
	
	public CustomerDao() {
		custList=new ArrayList<Customer>();
	}
	
	public ArrayList<Customer> viewAllCustomer(){
		System.out.println(custList);
		return custList;
	}
	
	@Override
	public boolean addCustomer(Customer cust) {
		// collection and store
		
		custList.add(cust);
		System.out.println("in add dao "+custList);
		return true;
	}

}
