package arithmetic;

import java.util.Scanner;

public class Roots {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Coeff 1: ");
		int a = sc.nextInt();
		System.out.print("Enter Coeff 2: ");
		int b = sc.nextInt();
		System.out.print("Enter Coeff 3: ");
		int c = sc.nextInt();
		
		double r1 = (-b + Math.sqrt(Math.pow(b, 2)- 4 * a * c))/ (2  * a);
		double r2 = (-b - Math.sqrt(Math.pow(b, 2)- 4 * a * c))/ (2  * a);
		
		System.out.println("The first root is "+r1);
		System.out.println("The second root is "+r2);
		
		
				
	}

}
