package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(40000);
		
		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		
		/*System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		System.out.println(cup.getName());
		System.out.println(cup.getPrice());
		*/
		
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();

	}
}
