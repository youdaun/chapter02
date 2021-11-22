package com.javaex.ex03;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;
	
	public void setTitle(String tit) {
		title = tit;
	}
	public String getTitle() {
		return title;
	}
	
	
	public void setArtist(String art) {
		artist = art;
	}
	public String getArtist() {
		return artist;
	}
	
	
	public void setAlbum(String alb) {
		album = alb;
	}
	public String getAlbum() {
		return album;
	}
	
	
	public void setComposer(String com) {
		composer = com;
	}
	public String getComposer() {
		return composer;
	}
	
	
	public void setYear(int ye) {
		year = ye;
	}
	public int getYear() {
		return year;
	}
	
	
	public void setTrack(String tra) {
		track = tra;
	}
	public String getTrack() {
		return track;
	}
	
	
	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + ", " + track + ", " + composer + " )");
	}
}
