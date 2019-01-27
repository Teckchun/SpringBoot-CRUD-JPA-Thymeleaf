package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

/*
 * By just extending the CrudRepository interface, 
 * Spring Data JPA will provide implementations 
 * for the repository’s CRUD methods for us.
 * */	
}
