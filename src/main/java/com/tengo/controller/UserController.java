package com.tengo.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tengo.bean.User;
import com.tengo.repository.UserRepository;

@RestController
public class UserController {

	@Autowired // 自动从spring容器中加载userRepository
	private UserRepository userRepository;

	@RequestMapping(value = "/api/user/list")
	public String index() {
		List<User> users = (List<User>) userRepository.findAll();

		StringBuilder sBuilder = new StringBuilder("the persons:");
		for (User user : users) {
			sBuilder.append(user.toString());
		}
		return sBuilder.toString();
	}

	@RequestMapping(value = "/api/user/add")
	public String add(User user) {
		userRepository.save(user);
		return "the new user is :" + user.toString();
	}

	@RequestMapping(value = "/api/user/name/{name}")
	public String findByName(@PathVariable("name") String name) {
		try{
			User user = userRepository.findByName(name);
			return "the user is :" + user != null ? user.toString() : "empty!";
		}
		catch(Exception exception){
			return exception.toString();
		}
	}

	@RequestMapping(value = "/api/user/id/{id}")
	public String findById(@PathVariable("id") Long id) {
		User user = userRepository.findById(id).orElse(null);

		return "the user is :" + user != null ? user.toString() : "empty!";
	}
}
