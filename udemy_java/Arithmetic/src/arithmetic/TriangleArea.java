package arithmetic;

import java.util.Scanner; 

public class TriangleArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of the triangle: ");
		float base = sc.nextFloat();
		System.out.print("Enter the height of the triangle: ");
		float height = sc.nextFloat();
		
		double area = (base * height) * 0.5;
		
		System.out.print("Area of the triangle is: " + area);
		
		

	}

}
