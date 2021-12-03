package com.javaex.ex19;

import java.util.Scanner;

public class ArithExcrption {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		result = 100/num; //0으로 나눌떄 오류
		System.out.println(result);
		
		
		
		
		sc.close();

	}

}
