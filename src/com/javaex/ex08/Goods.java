package com.javaex.ex08;

public class Goods {

	// 필드
	private String name;
	private int price;
	private static int totalCount;

	// 생성자
	public Goods() {
		this.totalCount ++;
	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		this.totalCount ++;
	}
	// 메소드(g/s)

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static int getTotalCount() {
		return totalCount;
	}

	public static void setTotalCount(int totalCount) {
		Goods.totalCount = totalCount;
	}

	// 메소드(일반)
	public void showInfo() {
		System.out.println("이름: " + name + ", 가격: " +price + ", 카운트: " + totalCount);
	}
}
