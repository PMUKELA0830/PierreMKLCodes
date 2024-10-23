package com.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	@Column(name = "name")
	private String name;

	@Id
	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@OneToOne
	@JoinColumn(name = "estimate_id")
	Estimate estimate;

	public User() {
	}

	public User(String name, String email, String password, Estimate estimate) {

		this.name = name;
		this.email = email;
		this.password = password;
		this.estimate = estimate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Estimate getEstimate() {
		return estimate;
	}

	public void setEstimate(Estimate estimate) {
		this.estimate = estimate;
	}

}
