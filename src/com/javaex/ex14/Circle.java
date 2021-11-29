package com.javaex.ex14;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(String linecolor, String fillcolor, int radius) {
		super.linecolor = linecolor;
		super.fillcolor = fillcolor;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}


	public void draw() {
		System.out.println("선색:" + super.linecolor + " 면색:" + super.fillcolor + " 반지름:" + radius);
	}
}
