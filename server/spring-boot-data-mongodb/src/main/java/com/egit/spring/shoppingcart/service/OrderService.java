package com.egit.spring.shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egit.spring.shoppingcart.model.OrderDetails;
import com.egit.spring.shoppingcart.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	public OrderRepository orderRepository;
	
	 public void saveOrder(OrderDetails orderDetails){
		/* if(orderDetails!= null && orderDetails.get_id()== null){
			 orderDetails.set_id("11");
		 }
*/		 orderRepository.save(orderDetails);
    }



}
