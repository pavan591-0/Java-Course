package arithmetic;

public class Bitwise {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z = -11;
		
		// And
		System.out.println("And operation of 10 and 10: "+ (x & y)); // 10
		
		// Or
		System.out.println("OR operation of 10 and 10: "+ (x | y)); // 10
		
		// Negation
		System.out.println("Negation of 10: "+ ~x); // -11
		
		// Negation
		System.out.println("Negation of -11: "+ ~z); // 10
				
		// left shift
		System.out.println("Left Shift by 3 of 10: "+ (x << 3)); // 80
		
		// right shift
		System.out.println("Right shift by 2 of 10: "+ (x >> 3)); // 1
		
		// signed right shift
		System.out.println("Signed right shift of -11 by 1: "+ (z >>> 1)); // 2147483642

	}

}
