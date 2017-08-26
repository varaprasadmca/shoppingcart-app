package com.egit.spring.shoppingcart.service;
import com.egit.spring.shoppingcart.model.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egit.spring.shoppingcart.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	public ProductRepository productRepository;
	
	 public List<Product> findAll(){
	        return productRepository.findAll();
	    }

	 public Product findByProductCode(String productCode){
		 return productRepository.findByProductCode( productCode);
	 }
}
