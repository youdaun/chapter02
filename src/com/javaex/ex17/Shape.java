package com.javaex.ex17;

public class Shape {

	protected String linecolor;
	protected String fillcolor;

	public Shape() {

	}

	public Shape(String linecolor, String fillcolor) {
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
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

	@Override
	public String toString() {
		return "Shape [linecolor=" + linecolor + ", fillcolor=" + fillcolor + "]";
	}
	
	public void draw() {
		System.out.println("선색:" + linecolor + " 면색:" + fillcolor + " 도형을 그렸습니다.");
	}
	
	public double area() {
		return 0.0;
	}

}
