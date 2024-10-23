package com.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.FlooringProduct;
import com.capstone.entity.FlooringRoom;
import com.capstone.repo.FlooringProductRepo;
import com.capstone.repo.FlooringRoomRepo;

@Service
public class FlooringService {
	
	@Autowired
	FlooringRoomRepo flooringRoomRepo;
	
	@Autowired
	FlooringProductRepo flooringProductRepo;
	
	// @Autowired 
	// FlooringProduct flooringProduct;
	
	// @Autowired
	// FlooringRoom flooringRoom;
	
	// public FlooringRoom saveFlooringRoom(FlooringProduct flooringProduct) {
		 //Create this method below
		//addFlooringProduct(flooringProduct);
		// return flooringRoomRepo.save(flooringProduct);
		
		//public void addFlooringProduct(FlooringProduct flooringProduct) { }
		
	// }
	
	public void saveProductDetail(FlooringProduct flooringProduct) {
		flooringProductRepo.save(flooringProduct);
		
	}
	
	public void saveRoomDetail(FlooringRoom flooringRoom) {
		flooringRoomRepo.save(flooringRoom);
		
	}
	
	public FlooringRoom getFlooringProduct(Integer id) {
		
		if(flooringRoomRepo.findById(id).isPresent()) {
			return flooringRoomRepo.findById(id).get();
		}
			return null;
	}
	
	// Convert the area units to match
	
	

}
