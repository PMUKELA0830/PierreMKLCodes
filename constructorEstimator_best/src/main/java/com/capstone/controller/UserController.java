package com.capstone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Estimate;
import com.capstone.entity.User;
import com.capstone.repo.UserRepo;
import com.capstone.service.UserService;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	UserService userService;

	@Autowired
	UserRepo userRepo;

	@RequestMapping(value = "/signUp", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public void submitUserDetail(@RequestBody User user) {
		userService.saveUser(user);
	}

	@RequestMapping(value = "/findByEmail", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<User>> findEmail(@RequestParam("email")String email) {
		List<User> findUser = userRepo.findByEmail(email);
		try {
		
				return new ResponseEntity<List<User>>(findUser, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
	}

	@RequestMapping(value = "/findAllUsers", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	
	public ResponseEntity<List<User>> findAll() {
		List<User> allUsers = userRepo.findAll();
		return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/findByName", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<User>> getUser(@RequestParam("name") String name) {
	List<User> showUser = userRepo.findByName(name);
	
	try {
	return new ResponseEntity<List<User>>(showUser, HttpStatus.OK);
	
	} catch (Exception e) {
		return new ResponseEntity<List<User>>(showUser, HttpStatus.NOT_FOUND);
		
	}
	}
	
	
	

}
