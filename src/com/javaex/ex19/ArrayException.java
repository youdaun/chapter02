package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {3, 6, 9};

		try {
			System.out.println(intArray[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally { //써도되고 안써도됨
			System.out.println("finally 영역");
		}
		
	}

}
