package com.capstone.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capstone.entity.FlooringProduct;

public interface FlooringProductRepo extends JpaRepository<FlooringProduct, Integer>{
	
	@Query(value="select * from Flooring_Product where areaOfPiece = ?", nativeQuery=true)
	public FlooringProduct findByTheAreaOfPiece(String areaOfPiece);

}
