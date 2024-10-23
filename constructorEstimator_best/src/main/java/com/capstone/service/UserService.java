package com.capstone.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.User;
import com.capstone.repo.EstimateRepo;
import com.capstone.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	EstimateRepo estimateRepo;
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
	public Optional<User> findByEmail(String email) {
		return userRepo.findById(email);
	}
	
	public void deleteUser(User user) {
		userRepo.delete(user);
	
	}
	

}
