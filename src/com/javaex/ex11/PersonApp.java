package com.javaex.ex11;

public class PersonApp {

	public static void main(String[] args) {
	
		Person p01 = new Person("정우성", 45);
		
		Person p02 = new Person("이정재", 45);
		
//		p01.showInfo();
//		p01.setAge(-42);
//		p01.showInfo();
		
		Student s01 = new Student();
		s01.setName("유재석");
		s01.setAge(30);
		s01.setSchoolName("서울고등학교");
		
//		System.out.println(s01.getName());
//		System.out.println(s01.getAge());
//		System.out.println(s01.getSchoolName());
		
		Student s02 = new Student();
		System.out.println("======================");
		Student s03 = new Student("유다운", 26, "가산초");
		s03.showInfo2();
		
		
	}

}
