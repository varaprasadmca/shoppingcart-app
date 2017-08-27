package com.cts.codechallenge.restful.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cts.codechallenge.springboot.restfulapi.model.Customer;
import com.cts.codechallenge.springboot.restfulapi.service.CustomerService;

import junit.framework.Assert;

public class CustomerTest extends SpringAbstactTests{
	
  @Autowired
  private  CustomerService  customerService;
  
  @Before
  public void setUp(){
	 
  }
  
  @After
  public void tearDown(){
	 
  }

  @Test
  public void findCustomerByEmail(){
	  
	  List<Customer>  customerList = customerService.findByEmail("MARY.SMITH@sakilacustomer.org.");
	  
	 
  }
}
