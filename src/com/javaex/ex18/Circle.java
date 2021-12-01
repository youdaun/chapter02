package com.javaex.ex18;

public class Circle extends Shape implements Drawable {

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

	//메소드 일반
	//부모쪽의 메소드 사용 못하게 할려고 같은 이름으로 제정의
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", lineColor=" + linecolor + ", fillColor=" + fillcolor + "]";
	}

	public void draw() { //인터페이스 메소드 구현
		System.out.println("선색:" + super.linecolor + " 면색:" + super.fillcolor + " 반지름:" + radius + " 원을 그렸습니다.");
	}
	
	public double area() {
		double result = radius * 2 * 3.14;
		return result;
	}
}
