package com.capstone.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.capstone.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{
	@Query(value="select * from user where email = ?1 and password = ?2", nativeQuery=true)
	public User findByTheEmailPassword(String email, String password);
	
	@Query(value="select * from user where email = ?1", nativeQuery=true)
	List<User> findByEmail(String email);
	
	@Query(value="select * from user where name = ?1", nativeQuery=true)
	List<User> findByName(String name);

}
