package com.capstone.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capstone.entity.Estimate;
import com.capstone.entity.FlooringProduct;
import com.capstone.entity.FlooringRoom;
import com.capstone.entity.User;
import com.capstone.repo.EstimateRepo;
import com.capstone.repo.FlooringProductRepo;
import com.capstone.repo.FlooringRoomRepo;
import com.capstone.service.EstimateService;
import com.capstone.service.FlooringService;

@RestController
@CrossOrigin
@RequestMapping("/flooring")
public class FlooringController {

	@Autowired
	EstimateRepo estimateRepo;

	@Autowired
	EstimateService estimateService;

	@Autowired
	FlooringService flooringService;

	@Autowired
	FlooringRoomRepo flooringRoomRepo;

	@Autowired
	FlooringProductRepo flooringProductRepo;

	// User enters the detail of the flooring product to be used for the flooring
	// job

	// I first tried with @RequestParam but it the values of the parameters could
	// not be saved for some reason

//	@RequestMapping(value = "/getProductDetail", consumes = MediaType.APPLICATION_JSON_VALUE, 
//			produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
//	public void submitProductDetail( @RequestParam("type") String type, 
//			@RequestParam("material") String material, @RequestParam("areaOfPiece") String areaOfPiece, @RequestParam("areaUnit") String areaUnit) {
//		FlooringProduct flooringProduct = new FlooringProduct();
//		flooringService.saveProductDetail(flooringProduct);
//	}
	
	
	
	
	// This method is to allow a subscribe user to enter product data and save it in the system

	@RequestMapping(value = "/getProductDetail", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public void submitProductDetail(@RequestBody FlooringProduct flooringProduct) {
		// FlooringProduct flooringProduct = new FlooringProduct();
		flooringService.saveProductDetail(flooringProduct);
	}
	
	
	
	// This method is to allow a subscribe user to enter room data and save it in the system 

	@RequestMapping(value = "/getRoomDetail", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public void submitRoomDetail(@RequestBody FlooringRoom flooringRoom) {
		// FlooringProduct flooringProduct = new FlooringProduct();
		flooringService.saveRoomDetail(flooringRoom);
	}
	
	
	
	
	// This method is meant for a random user to enter the necessary detail and generate an estimate from that
	
	@RequestMapping(value = "/getEstimateDetail", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<Estimate> submitEstimateDetail(@RequestParam ("floorSideA") double floorSideA, @RequestParam ("floorSideB") double floorSideB, 
			@RequestParam ("floorPieceArea") double floorPieceArea, @RequestParam ("floorSurfaceShape") String floorSurfaceShape) {
		// FlooringProduct flooringProduct = new FlooringProduct();
		Estimate estimate = new Estimate();
		int quantity = 0;
		estimate.setQuantity(quantity);
		
		try {
		Estimate est1 = estimateService.estimateQuantity(floorSideA, floorSideB, floorPieceArea, floorSurfaceShape);
		
		return new ResponseEntity<Estimate>(est1, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Estimate>(HttpStatus.BAD_REQUEST);
		}
	}
	

	// Add a method that adds flooringRoom and flooringProduct detail

//	@RequestMapping(value = "/addRoomProductDetail", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
//	public void addRoomProdDetail(@RequestBody FlooringRoom flooringRoom, @RequestBody FlooringProduct flooringProduct) {
//
//		// findById (jpaRepository)
//		try {
//			if(flooringRoom != null && flooringProduct != null) {
//				flooringRoomRepo.save(flooringRoom);
//				flooringProductRepo.save(flooringProduct);
//			}
//			
//		} catch (Exception e) {
//			System.out.println("Invalid!");
//
//		}
//		
//	}
	
	
	
	
	// 
	
	@RequestMapping(value = "/convertAreaOfProduct", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public String getProductAreaConverted(@RequestParam ("areaOfPiece") double areaOfPiece, 
			@RequestParam ("areaUnit") String areaUnit) {
		
		String convertedArea = "";
		// FlooringRoom flooringRoom = new FlooringRoom();
		// FlooringProduct flooringProduct = new FlooringProduct();
		// Optional<FlooringRoom>  = flooringRoomRepo.findById(room_id);
		// Optional<FlooringProduct> areaOfPieceProduct = flooringProductRepo.findById(product_id);
		
		try {
		convertedArea = estimateService.convertAreaOfPieceUnit(areaOfPiece, areaUnit);
			
			return convertedArea;
		} catch (Exception e) {
			String response = "Error! Please check your data and re-enter correctly";
			return response;
			
		}
	}
	
	

	// Find the estimate of material quantity needed to do the flooring job

	
	// This method is meant for a subscribed user to utilize data stored in his account and generate an estimate from that
	
	
	@RequestMapping(value = "/estimateProcess", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
	public ResponseEntity<Estimate> getEstimation(@RequestParam ("room_id") int room_id, @RequestParam ("product_id") int product_id) {

		// FlooringRoom flooringRoom = new FlooringRoom();
		// FlooringProduct flooringProduct = new FlooringProduct();
		Optional<FlooringRoom> fr = flooringRoomRepo.findById(room_id);
		Optional<FlooringProduct> fp = flooringProductRepo.findById(product_id);
			try {
				Estimate est1 = estimateService.estimateQuantity(fr.get().getFloorSideA(), fr.get().getFloorSideB(), 
						fp.get().getAreaOfPiece(), fr.get().getFloorSurfaceShape());
			
			return new ResponseEntity<Estimate>(est1, HttpStatus.OK);
			} catch (Exception e) {
				return new ResponseEntity<Estimate>(HttpStatus.BAD_REQUEST);
			}
	}

	// Maps the request to make an estimate
	@RequestMapping(value = "/estimate", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<Optional<Estimate>> getEstimateById(@RequestBody User user) {

		// findById (jpaRepository)
		try {
			Optional<Estimate> estimateFound = estimateRepo.findById(user.getEstimate().getId());
			return new ResponseEntity<Optional<Estimate>>(estimateFound, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Optional<Estimate>>(HttpStatus.NOT_FOUND);

		}

	}

}
