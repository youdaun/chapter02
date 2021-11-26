package com.javaex.ex11;

public class Person {

	protected String name; //상속받은애들도 쓸수있게해줌
	private int age;
	
	public Person() {
		System.out.println("Person()");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(1)");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		if (age < 1) {
			return 1;
		} else {
			return age;
		}

	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() {
		System.out.println("==============================");
		System.out.println("이름: " + this.getName());
		System.out.println("나이: " + this.getAge());
		System.out.println("==============================");
		System.out.println("");
	}

}
