package com.javaex.ex18;

public class Rectangle extends Shape implements Drawable {
	// 필드
	// private String linecolor;
	// private String fillcolor;
	private int width;
	private int height;

	// 생성자
	public Rectangle() {
		super();
	}

	public Rectangle(String linecolor, String fillcolor, int width, int height) {
		super(linecolor, fillcolor);
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
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", lineColor=" + linecolor + ", fillColor="
				+ fillcolor + "]";
	}
	
	public void draw() {
		System.out.println("선색:" + super.linecolor + " 면색:" + super.fillcolor + " 가로:" + width + " 세로:" + height + " 사각형을 그렸습니다.");
	}
	
	public double area() { //Shape 추상클래스(미완성 클래스)를 상속받았음
							//Shape를 상속 받을려면 미완성인 부분을 구현해줘야함 ----> area() 작성해야함
		double result = (width + height) * 2;
		return result;
	}

}
