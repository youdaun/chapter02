package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		//메모리가 움직이는 스토리
		
		//사각형3개만듦
		Rectangle r01 = new Rectangle("빨강", "노랑", 5, 5);
		Rectangle r02 = new Rectangle("파랑", "노랑", 4, 2);
		Rectangle r03 = new Rectangle("빨강", "빨강", 2, 7);

		//사각형 관리를 위해서 배열을 만든다
		Rectangle[] rArray = new Rectangle[3];
		
		//배열에 주소를 넣는다
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		//모두 draw() 하기
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
		}
		
		//모든 사각형에 선색만 출력
		for(int i=0; i<rArray.length; i++) {
			System.out.println("선색: " + rArray[i].getLinecolor());
		}
		
		Circle c01 = new Circle("보라", "빨강", 15);
		Circle c02 = new Circle("검정", "노랑", 5);
		Circle c03 = new Circle("파랑", "초록", 9);
		
		Circle[] cArray = new Circle[3];
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i].draw();
		}
		
		Triangle t01 = new Triangle("노랑", "초록", 10, 5);
		Triangle t02 = new Triangle("노랑", "검정", 4, 4);
		Triangle t03 = new Triangle("파랑", "초록", 8, 3);
		
		Triangle[] tArray = new Triangle[3];
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for(int i=0; i<tArray.length; i++) {
			tArray[i].draw();
		}
		
		
		
	}

}
