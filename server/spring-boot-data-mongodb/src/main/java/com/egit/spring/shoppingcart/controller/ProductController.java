package com.egit.spring.shoppingcart.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.egit.spring.shoppingcart.model.Product;
import com.egit.spring.shoppingcart.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<Product> getAll(){
        return productService.findAll();
    }
    
    
    @RequestMapping("{/productCode}")
    public Product findByProductCode(@PathParam("productCode")  String productCode){
        return productService.findByProductCode(productCode);
    }
}
