package com.egit.spring.shoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.egit.spring.shoppingcart.model.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product, Long>{
	
	Product findByProductCode( String productCode);
	
	


}
