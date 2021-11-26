package com.javaex.ex12;

public class Point {

	protected int x, y;
	
	public Point() {
		System.out.println("p0");
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("p2");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void showInfo() {
		System.out.println("좌표는: " + x + ", " + y);
	}

}
