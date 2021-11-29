package com.javaex.ex14;

public class Triangle extends Shape {

	private int width;
	private int height;

	public Triangle() {
		super();
	}

	public Triangle(String linecolor, String fillcolor, int width, int height) {
		super.linecolor = linecolor;
		super.fillcolor = fillcolor;
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw() {
		System.out.println("선색:" + super.linecolor + " 면색:" + super.fillcolor + " 가로:" + width + " 세로:" + height);
	}
}
