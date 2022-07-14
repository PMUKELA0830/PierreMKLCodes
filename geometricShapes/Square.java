package geometricShapes;

public class Square extends GeometricShapes {
	
	public double area(double side) {
		
		double area = 1.00;
		this.setSide1(side);
		area = this.area(this.getSide1());
		this.setArea(area);
		
		
		return this.getArea();
		
	}
	
	public double perimeter(double side) {
		
		this.setSide1(side);
		double perimeter = this.perimeter(this.getSide1());
		this.setPerimeter(perimeter);
		
		return this.getPerimeter();		
	}

}
