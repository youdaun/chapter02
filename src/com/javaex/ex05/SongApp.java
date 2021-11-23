package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s1 = new Song("아이유", "좋은날", "Real", 2010, 3, "이민수");
		//System.out.println(s1.toString());
		s1.showInfo();
		
		Song s2 = new Song();
		s2.setArtist("BIGBANG");
		s2.setTitle("거짓말");
		s2.setAlbum("Always");
		s2.setYear(2007);
		s2.setTrack(2);
		s2.setComposer("G-DRAGON");
		//System.out.println(s2.getArtist());
		//System.out.println(s2.toString());
		s2.showInfo();

	}

}
