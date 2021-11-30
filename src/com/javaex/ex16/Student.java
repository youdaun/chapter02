package com.javaex.ex16;

public class Student extends Person {

	private String school;

	public Student() {
		super();
	}

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [school=" + school + "]";
	}
	
	public void showInfo() {
		System.out.println("***********************************");
		System.out.println("이름: " + name + ", 나이: " + age + ", 학교:" + school);
	}

}
