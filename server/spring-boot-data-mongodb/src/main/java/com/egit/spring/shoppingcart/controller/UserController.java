package com.egit.spring.shoppingcart.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.egit.spring.shoppingcart.model.Product;
import com.egit.spring.shoppingcart.model.User;
import com.egit.spring.shoppingcart.service.ProductService;
import com.egit.spring.shoppingcart.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public List<User> getAll(){
        return userService.findAll();
    }
    
   // @CrossOrigin(origins = "http://localhost:8081")
    @RequestMapping(value = "/saveUser",method = RequestMethod.POST, produces = "application/json")
    public void saveUser(@RequestBody User user){
       userService.saveUser(user);
    }
    
}
