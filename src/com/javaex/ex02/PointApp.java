package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(5,5);
		/*p1.setX(5);
		p1.setY(5);*/
		p1.draw();
		
		Point p2 = new Point(10,23);
		/*p2.setX(10);
		p2.setY(23);*/
		p2.draw();
		
		Point p3 = new Point(55, 65);
		p3.draw(true);
		p3.draw(false);
		p3.draw();
		
		p1.draw(false);

	}

}
