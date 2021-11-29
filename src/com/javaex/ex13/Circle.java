package com.javaex.ex13;

public class Circle {

	private String linecolor;
	private String fillcolor;
	private int radius;

	public Circle() {

	}

	public Circle(String linecolor, String fillcolor, int radius) {
		super();
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
		this.radius = radius;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [linecolor=" + linecolor + ", fillcolor=" + fillcolor + ", radius=" + radius + "]";
	}

	public void draw() {
		System.out.println("선색:" + linecolor + " 면색:" + fillcolor + " 반지름:" + radius);
	}
	
}
