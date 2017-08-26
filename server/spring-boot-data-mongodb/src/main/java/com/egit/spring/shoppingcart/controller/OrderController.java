package com.egit.spring.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 

import com.egit.spring.shoppingcart.model.OrderDetails;
import com.egit.spring.shoppingcart.service.OrderService;

@RestController
@RequestMapping("/shopping")
public class OrderController {
	
	@Autowired
	private OrderService  orderService;
	
	 @RequestMapping(value = "/processPayment", method = RequestMethod.POST, produces = "application/json")
	    public void saveUser(@RequestBody OrderDetails orderDetails){
		 orderService.saveOrder(orderDetails);
	    }
	   

}
