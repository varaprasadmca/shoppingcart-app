package com.egit.spring.shoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.egit.spring.shoppingcart.model.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, Long>{

}
