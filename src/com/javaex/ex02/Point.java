package com.javaex.ex02;

public class Point {
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point() {
		//해당클래스를 메모리에 올리는 일
		//디폴트로 생성되지만 새로운 생성자를 만들어 주면 없어지기 때문에 임의로 만들어 준다
	}
	
	public Point(int x, int y) {
		//해당클래스를 메모리에 올리는 일
		this.x = x;
		this.y = y;
	}
	
	//메소드
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		if(x<0) {
			return 0;
		}
		else {
			return x;
		}	
	}
	
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	
	public void draw() {
		System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
	}
	
	//action >> true면 그리는기능 , false면 지우는 기능
	public void draw(boolean action) {
		if(action == true) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 그렸습니다.");
		}
		else if(action == false) {
			System.out.println("점[x=" + x + ", y=" + y + "]을 지웠습니다.");
		}
		else {
			System.out.println("잘못된 입력");
		}
	}
}
