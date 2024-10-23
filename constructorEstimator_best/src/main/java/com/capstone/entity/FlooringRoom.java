package com.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flooring_Room")
public class FlooringRoom {
	
	@Id
	@Column(name = "room_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer room_id;
	
//	@Column(name = "FlooringProduct_ID")
//	private Integer FlooringProduct_ID;
	
	@Column(name = "unit_of_measurement")
	private String unit_of_measurement;
	
	@Column(name = "floorSideA")
	private double floorSideA;
	
	@Column(name = "floorSideB")
	private double floorSideB;
	
	private String floorSurfaceShape;
	
	private double floorCircumference;
	
	//private double floorSurfaceArea;
	
//	@OneToMany
//	@JoinColumn(name="FlooringProduct_ID")
//	FlooringProduct flooringProduct;
	
	
	
	//@Autowired
	//FlooringProduct flooringProduct;
	
								   // This is the actual material to be used as floor
								   // such as tiles, laminates, carpet, etc.
								   // Obtain this information from the customer's choice
	public FlooringRoom() {
		
	}
	public FlooringRoom(String floorSurfaceShape,
						double floorSideA, 
						double floorSideB) {
		
		this.floorSurfaceShape = floorSurfaceShape;
		this.floorSideA = floorSideA;
		this.floorSideB = floorSideB;
		//this.floorSurfaceArea = floorSurfaceArea;
	}
	
	
	public Integer getId() {
		return room_id;
	}

	public void setId(Integer id) {
		this.room_id = id;
	}

	public double getFloorCircumference() {
		return floorCircumference;
	}

	public void setFloorCircumference(double floorCircumference) {
		this.floorCircumference = floorCircumference;
	}

	public String getFloorSurfaceShape() {
		return floorSurfaceShape;
	}

	public void setFloorSurfaceShape(String floorSurfaceShape) {
		this.floorSurfaceShape = floorSurfaceShape;
	}


	public double getFloorSideA() {
		return floorSideA;
	}
	public void setFloorSideA(double floorSideA) {
		this.floorSideA = floorSideA;
	}
	public double getFloorSideB() {
		return floorSideB;
	}
	public void setFloorSideB(double floorSideB) {
		this.floorSideB = floorSideB;
	}
	
	
	//This is only for 4 side shapes
	public double getFloorSurfaceArea(double floorSideA, double floorSideB, String floorSurfaceShape) {
		// For shape of floor surface being rectangle or square
		double floorSurfaceArea = 1.00;
		
		floorSideA = this.floorSideA;
		floorSideB = this.floorSideB;
		floorSurfaceShape = this.floorSurfaceShape;
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
		} // And the list of floor shapes goes on
		
		return floorSurfaceArea;
	}
	
//	public double setFloorSurfaceArea(double floorSurfaceArea) {
//		return this.floorSurfaceArea;
//		
//	}
	
	
	
	
//	@Override
//	public String toString() {
//		return "Flooring [floorSideA=" + floorSideA + ", floorSideB=" + floorSideB + ", floorSurfaceArea="
//				+ floorSurfaceArea + "]";
//	}
	
	

}
