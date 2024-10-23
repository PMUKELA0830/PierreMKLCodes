package com.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estimate")
public class Estimate {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;		
	private int quantity;
	private double floorPieceArea;
	private double convertedArea; // This is the area of piece/set 
	// Example of set is a box of 6 pieces) of the flooring product
	
	private double floorSideA; 
	private double floorSideB;
	
	private String floorSurfaceShape;
	private double floorSurfaceArea; // This is the area of room floor
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getConvertedArea() {
		return convertedArea;
	}

	public void setConvertedArea(double convertedArea) {
		this.convertedArea = convertedArea;
	}

	public double getFloorSurfaceArea() {
		return floorSurfaceArea;
	}

	public void setFloorSurfaceArea(double floorSurfaceArea) {
		this.floorSurfaceArea = floorSurfaceArea;
	}

	public double getFloorPieceArea() {
		return floorPieceArea;
	}

	public void setFloorPieceArea(double floorPieceArea) {
		this.floorPieceArea = floorPieceArea;
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

	public String getFloorSurfaceShape() {
		return floorSurfaceShape;
	}

	public void setFloorSurfaceShape(String floorSurfaceShape) {
		this.floorSurfaceShape = floorSurfaceShape;
	}
	
	
	
	

}
