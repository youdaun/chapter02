package com.javaex.ex12;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
		System.out.println("c3");
	}
	
	public ColorPoint(String color) {
		this.color = color;
		System.out.println("c1");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showInfo() {
		System.out.println("좌표는: " + super.x + ", " + super.y + ", " + color);
	}

}
