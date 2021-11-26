package com.javaex.ex11;

public class Student extends Person {

	private String schoolName;

	public Student() {
		System.out.println("Student()");
	}

	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	public Student(String name, int age, String schoolName) {
		// 오류남 super.name = name;
		super(name, age);
	
		super.setName(name);
		super.setAge(age);
		
		this.schoolName = schoolName;
		System.out.println("Student(2)");
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo2() {
		System.out.println("==============================");
		System.out.println("이름: " + super.getName());
		System.out.println("나이: " + super.getAge());
		System.out.println("학교: " + this.getSchoolName());
		System.out.println("==============================");
		System.out.println("");
	}
	
	

}
