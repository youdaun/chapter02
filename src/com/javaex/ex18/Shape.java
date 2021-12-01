package com.javaex.ex18;

public abstract class Shape { //추상메소드를 가지고 있어서 클래스와 미완성인 부분이 있음
								//Shape 단독으로 인스턴스화 하면 안됨

	protected String linecolor;
	protected String fillcolor;

	public Shape() {

	}

	public Shape(String linecolor, String fillcolor) {
		this.linecolor = linecolor;
		this.fillcolor = fillcolor;
	}

	public String getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(String linecolor) {
		this.linecolor = linecolor;
	}

	public String getFillcolor() {
		return fillcolor;
	}

	public void setFillcolor(String fillcolor) {
		this.fillcolor = fillcolor;
	}

	@Override
	public String toString() {
		return "Shape [linecolor=" + linecolor + ", fillcolor=" + fillcolor + "]";
	}
	
	/*
	//자식 클래스가 draw() 반드시 만들지 않아도 됨 <--> 비교해볼것
	public void draw() {
		System.out.println("선색: " + linecolor + " 면색:" + fillcolor + " 도형을 그렸습니다.");
	}
	*/
	
	//area() 만들지 못함
	public abstract double area();  //추상메소드  
		                            //내부코드를 작성할 수없는상황
		                            //자식클래스에서는 꼭 내부코드를 구현해야함  

}
