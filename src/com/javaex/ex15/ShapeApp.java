package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {

		Shape r01 = new Rectangle("빨강", "빨강", 5, 5); 
		//r01.draw();
		
		Shape c01 = new Circle("노랑", "파랑", 3);
		//c01.draw();
		
		Shape t01 = new Triangle("파랑", "파랑", 20, 20);
		//t01.draw();
		
		//도형(shape, 모든 도형)을 관리하는 배열을 만든다
		Shape[] sArray = new Shape[] {r01, c01, t01};

		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
		
		//형변환과 동일한 원리로 자식클랙스의 메소드를 불러올수있다
		System.out.println(((Circle)c01).getRadius());
		
	}

}
