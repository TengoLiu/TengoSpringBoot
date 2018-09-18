package com.tengo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.tengo.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByName(String name);
	
}
