package com.javaex.ex07;

public class TVApp {

	// 필드

	// 생성자

	// 메소드 -g/s

	// 메소드 -일반

	public static void main(String[] args) {

		TV tv = new TV( 7, 20, false);  
		
		tv.status();

		tv.power(true);
		tv.volume(120); // 100으로 유지
		tv.status();

		tv.volume(false);
		tv.status();

		tv.channel(0);
		tv.status();

		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status();

		tv.power(false);
		tv.status();

		System.out.println(tv.getVolume());

	}

}
