package com.javaex.ex20;

import java.io.IOException;

public class FileManager {

	public void readFile() throws IOException{ // c://config.txt 을 읽어오는 메소드

		/*
		try {
			System.out.println("강제예외상황발생");
			throw new IOException(); // 파일을 못읽었을때 예외 발생 
									//상황을 강제로 만들어 준것(문법아님)
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
		*/
		
		System.out.println("강제예외상황발생");
		throw new IOException();

	}

}
