package com.javaex.ex15;

public class Rectangle extends Shape {
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
	public void draw() {
		System.out.println("선색:" + super.linecolor + " 면색:" + super.fillcolor + " 가로:" + width + " 세로:" + height + " 사각형을 그렸습니다.");
	}

	//부모쪽에도 같은 메소드가 있다
	@Override
	public String toString() {
		return "Rectangle [linecolor=" + linecolor + ", fillcolor=" + fillcolor + " width=" + width + ", height=" + height + "]";
	}

}
