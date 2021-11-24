package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song("아이유", "좋은날", "Real", 2010, 3);
		//System.out.println(s1.toString());
		s1.showInfo();
		
		//마지막은 정해지지 않아서 다섯개만 넣고 마지막 트랙은 추가사항처럼 기입
		Song s2 = new Song("BIGBANG", "거짓말", "Always", 2007);
		s2.setTrack(2);
		
		s2.showInfo();

	}

}
