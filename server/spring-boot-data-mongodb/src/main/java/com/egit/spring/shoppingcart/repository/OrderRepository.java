package com.egit.spring.shoppingcart.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.egit.spring.shoppingcart.model.OrderDetails;

@Repository
public interface OrderRepository extends MongoRepository<OrderDetails, Long> {

}
