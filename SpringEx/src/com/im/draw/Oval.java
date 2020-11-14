package com.im.draw;

public class Oval implements Shape{

	private double radius;
	
	@Override
	public double getArea() {
		return  (Math.PI * radius * radius);
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return this.radius;
	}

}
