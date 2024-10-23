package com.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.entity.Estimate;

public interface EstimateRepo extends JpaRepository<Estimate, Integer>{

}
