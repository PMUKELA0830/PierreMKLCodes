package com.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.entity.Estimate;
import com.capstone.entity.FlooringProduct;
import com.capstone.entity.FlooringRoom;
import com.capstone.repo.EstimateRepo;

@Service
public class EstimateService {
	
Estimate estimate;
double floorSurfaceArea;


@Autowired
EstimateRepo estimateRepo;
	
//	public void getFloorSurfaceAre(double floorSideA, double floorSideB, String floorSurfaceShape) {
//		FlooringRoom flooringRoom = new FlooringRoom();
//		flooringRoom.setFloorSideA(floorSideA);
//		flooringRoom.setFloorSideB(floorSideB);
//		flooringRoom.setFloorSurfaceShape(floorSurfaceShape);
//		floorSideA = flooringRoom.getFloorSideA();
//		floorSideB = flooringRoom.getFloorSideB();
//		floorSurfaceShape = flooringRoom.getFloorSurfaceShape();
//		
//		double floorSurfaceArea = flooringRoom.getFloorSurfaceArea(floorSideA, floorSideB, floorSurfaceShape);
//		
//		this.floorSurfaceArea = floorSurfaceArea;
//	}

	
	// Convert the unit of floor piece area here


	public String convertAreaOfPieceUnit(double areaOfPiece, String areaUnit) {
		
		double convertedArea = 1.00;
		FlooringProduct flooringProduct= new FlooringProduct();
		flooringProduct.setAreaOfPiece(areaOfPiece);
		flooringProduct.setAreaUnit(areaUnit);
		String response = "";
		
		
		if(flooringProduct.getAreaUnit().equalsIgnoreCase("square foot") ||
			flooringProduct.getAreaUnit().equalsIgnoreCase("square feet") ||
			flooringProduct.getAreaUnit().equalsIgnoreCase("squarefoot") ||
			flooringProduct.getAreaUnit().equalsIgnoreCase("squarefeet")) {
		
			convertedArea = flooringProduct.getAreaOfPiece() * 144;
			areaUnit = "square inch";
			
			response = areaOfPiece + " sqft equals " + convertedArea + "sq.in(or in2)";
			
			Estimate estimate = new Estimate();
			estimate.setConvertedArea(convertedArea);
			
			saveEstimateDetail(estimate);
		
		}
		
		return response;
		
	}
	
	
	
	// This method describe the process of calculating the quantity of material needed to 
	// accomplish a given construction 

	public Estimate estimateQuantity(double floorSideA, double floorSideB, 
			double floorPieceArea, String floorSurfaceShape) {
		
		//Find Area of the room here
		FlooringRoom flooringRoom = new FlooringRoom();
		flooringRoom.setFloorSideA(floorSideA);
		flooringRoom.setFloorSideB(floorSideB);
		flooringRoom.setFloorSurfaceShape(floorSurfaceShape);
		floorSideA = flooringRoom.getFloorSideA();
		floorSideB = flooringRoom.getFloorSideB();
		floorSurfaceShape = flooringRoom.getFloorSurfaceShape();
		
		
		if(floorSurfaceShape.equalsIgnoreCase("rectangle") ||
				   floorSurfaceShape.equalsIgnoreCase("square")) {
					//Surface area of the floor
				floorSurfaceArea = floorSideA * floorSideB;
				 
				//}
				//else if(floorSurfaceShape.equalsIgnoreCase("circle")) {
					//Surface area of the floor
					//floorSurfaceArea = ((getFloorCircumference() / 2) * (getFloorCircumference() / 2)) / Math.PI;
				
				} else if(floorSurfaceShape.equalsIgnoreCase("triangle")) {
					//Surface area of the floor
					//Get the 2 longest sides of the triangle and use these to calculate the area
				 floorSurfaceArea = (1/2) * floorSideA * floorSideB;
				} 
		
		FlooringProduct flooringProduct = new FlooringProduct();
		
		flooringProduct.setAreaOfPiece(floorPieceArea);
		floorPieceArea = flooringProduct.getAreaOfPiece();
		
		int quantity = 1;
		quantity = (int)(floorSurfaceArea/floorPieceArea);
		
		Estimate estimate = new Estimate();
		estimate.setQuantity(quantity);
		estimate.setFloorPieceArea(floorPieceArea);
		estimate.setFloorSideA(floorSideA);
		estimate.setFloorSideB(floorSideB);
		estimate.setFloorSurfaceShape(floorSurfaceShape);
		estimate.setFloorSurfaceArea(floorSurfaceArea);
		
		
		// This is how we save the estimate 
		// We call a method designed to save to the Estimate entity
		saveEstimateDetail(estimate);
		return estimate;
	 }
	
	
	
	// This method is designed to save data to the Estimate entity
	
	public void saveEstimateDetail(Estimate estimate) {
		estimateRepo.save(estimate);
	}



}
