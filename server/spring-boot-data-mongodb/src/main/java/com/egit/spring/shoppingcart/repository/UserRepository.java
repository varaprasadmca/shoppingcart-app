package com.egit.spring.shoppingcart.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.egit.spring.shoppingcart.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}
