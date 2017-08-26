package com.egit.spring.shoppingcart.service;
import com.egit.spring.shoppingcart.model.Product;
import com.egit.spring.shoppingcart.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.egit.spring.shoppingcart.repository.UserRepository;

@Service
@Transactional
public class UserService {
	
	@Autowired
	public UserRepository userRepository;
	
	 public List<User> findAll(){
	        return userRepository.findAll();
	    }
	 
	 public void saveUser(User user){
	         userRepository.save(user);
	    }


	}
