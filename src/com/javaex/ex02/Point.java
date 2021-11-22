package com.javaex.ex02;

public class Point {

	int x;
	int y;
	
	
	public void setter(int a) {
		x = a;
	}
	
	public void getter(int b) {
		y = b;
	}
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
}
