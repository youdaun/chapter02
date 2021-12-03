package com.javaex.ex19;

import java.util.Scanner;

public class ArithExcrption2 {

	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			result = 100/num;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finally영역");
		}
		
		
		
		sc.close();

	}

}
