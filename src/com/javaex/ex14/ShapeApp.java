package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "파랑", 4, 3);
		Rectangle r02 = new Rectangle("노랑", "검정", 7, 7);
		Rectangle r03 = new Rectangle("빨강", "초록", 2, 5);
		
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03; 
		
		System.out.println("#) 사각형");
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		System.out.println("--------------------------------");
		
		Circle[] cArray = new Circle[3];
		
		Circle c01 = new Circle("노랑", "파랑", 5);
		Circle c02 = new Circle("검정", "분홍", 2);
		Circle c03 = new Circle("초록", "파랑", 8);
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		System.out.println("#) 원형");
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		System.out.println("--------------------------------");
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("파랑", "감장", 3, 3);
		Triangle t02 = new Triangle("보라", "초록", 8, 2);
		Triangle t03 = new Triangle("검정", "분호", 6, 4);
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		System.out.println("#) 삼각형");
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
		

	}

}
