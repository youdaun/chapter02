package com.javaex.ex13;

public class Rectangle {

	// 필드
	private String linecolor;
	private String fillcolor;
	private int width;
	private int height;

	// 생성자
	public Rectangle() {

	}

	public Rectangle(String linecolor, String fillcolor, int width, int height) {
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
		this.width = width;
		this.height = height;
	}

	// 메소드(g/s)
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

	
	// 메소드(일반)
	@Override
	public String toString() {
		return "Rectangle [linecolor=" + linecolor + ", fillcolor=" + fillcolor + ", width=" + width + ", height="
				+ height + "]";
	}
	
	public void draw() {
		System.out.println("선색:" + linecolor + " 면색:" + fillcolor + " 가로:" + width + " 세로:" + height);
	}

}
