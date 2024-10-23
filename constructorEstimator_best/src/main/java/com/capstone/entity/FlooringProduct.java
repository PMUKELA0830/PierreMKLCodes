package com.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Flooring_Product")
public class FlooringProduct {
	
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer product_id;
	
	@Column(name = "type")// E.g. tiles, laminates, carpet, etc.
	private String type;
	
	@Column(name = "material")// E.g. clay, stone, metal, wood, vinyl, woven nylon, wool fiber, etc.
	private String material;
	
	@Column(name = "areaOfPiece")
	private Double areaOfPiece;
	
	@Column(name = "areaUnit") // E.g. sqft, inch square, etc.
	private String areaUnit;
	
	
	public FlooringProduct() {
		
	}

	public FlooringProduct(Integer product_id, 
						   String type, 
						   String material, 
						   Double areaOfPiece, 
						   String areaUnit) {
		this.product_id = product_id;
		this.type = type;
		this.material = material;
		this.areaOfPiece = areaOfPiece;
		this.areaUnit = areaUnit;
	}
	

	public Integer getId() {
		return product_id;
	}

	public void setId(Integer id) {
		this.product_id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public Double getAreaOfPiece() {
		return areaOfPiece;
	}

	public void setAreaOfPiece(Double areaOfPiece) {
		this.areaOfPiece = areaOfPiece;
	}

	public String getAreaUnit() {
		return areaUnit;
	}

	public void setAreaUnit(String areaUnit) {
		this.areaUnit = areaUnit;
	}
	
	public void convertAreaOfPieceUnit() {
		if(this.getAreaUnit().equalsIgnoreCase("square foot") ||
				this.getAreaUnit().equalsIgnoreCase("square feet") ||
				this.getAreaUnit().equalsIgnoreCase("squarefoot") ||
				this.getAreaUnit().equalsIgnoreCase("squarefeet")) {
			
			this.areaOfPiece = this.getAreaOfPiece() * 144;
			this.areaUnit = "square inch";
			
			}
			
		}
	
	
	
	
	

}
