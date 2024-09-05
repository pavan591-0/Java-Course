package com.javaclass.exceptions;

@SuppressWarnings("serial")
class NegativeException extends Exception {

	public String toString() {
		return "Values cannot be a negative number";
	}
}

public class ThrowThrows {

	static int area(int a, int b) throws NegativeException {
		if(a < 0 || b < 0) {
			throw new NegativeException();
		}
		
		return a * b;
	}
	
	static void print_area() {
		try {
			System.out.println("Area of rectangle of length 12 and 13 is: "+area(12,13));
			System.out.println("Area of rectangle of length -12 and 13 is: "+area(-12,13));
		}
		catch(NegativeException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		print_area();
	}

}
