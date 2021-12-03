package com.javaex.ex20;

import java.io.IOException;

public class FileApp {

	public static void main(String[] args) {
		
		FileManager fr = new FileManager();
		//fr.readFile();
		
		try {
			fr.readFile();
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}

	}

}
