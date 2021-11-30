package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
	
		Person p01 = new Person("유재석", 50);
		p01.showInfo();
		
		Student s01 = new Student("강호동", 30, "강남고등학교");
		s01.showInfo();
		
		Person ps01 = new Student("이정재", 46, "서울고등학교");
		ps01.showInfo();
		

	}

}
