package com.javaex.ex09;

public class MyMath {
	//필드  -- 필요x
	private static double PI = 3.14159; //대문자로 써준다

	//생성자  -- 디폴트 사용

	//메소드(g/s)  -- 필요x

	//메소드(일반)
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		return a+b;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}
	
	public static double CircleArea(int radius) {
		return radius * radius * PI;
	}
	
	public static double CircleRound(int radius) {
		return (radius * radius) * PI;
	}
}
