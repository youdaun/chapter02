package com.javaex.ex06;

public class Math {

	//필드
	//생략
	
	//생성자
	//디폴트 생성자 사용
	
	//메소드 -g/s
	//생략
	
	//메소드 -일반
	
	/* 케이스1
	public int plusInt(int num01, int num02) {
		int sum = num01 + num02;
		return sum;
	}
	
	public double plusDouble(double num01, double num02) {
		double sum = num01 + num02;
		return sum; 
	}
	*/
	
	//메소드 오버로딩(이름이 같아도 매게변수가 다르면 생성가능)
	public int plus(int num01, int num02) {
		int sum = num01 + num02;
		return sum;
	}
	
	public double plus(double num01, double num02) {
		double sum = num01 + num02;
		return sum; 
	}
	
	public double plus(int num01, double num02) {
		double sum = num01 + num02;
		return sum;
	}
	
	public double plus(double num01, int num02) {
		double sum = num01 + num02;
		return sum;
	}
}
