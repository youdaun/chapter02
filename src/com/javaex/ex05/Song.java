package com.javaex.ex05;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 생성자
	/*
	public Song(String artist, String title, String album, int year, int track, String composer) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	*/
	
	public Song(String artist, String title, String album, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.year = year;
		this.track = track;
	}
	
	public Song(String artist, String title, String album, int year) {
		//맨 마지막 track 자리에 공백을 주는 경우
		this(artist, title, album, year, 0);
	}

	public Song() {

	}

	// 메소드 -g/s
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 메소드 -일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	public void showInfo() {
		System.out.println(title + ", " + artist + " ( " + album + ", " + year + ", " + track + " )");
	}
}
