package oops;

class Circle{
	public double radius;
	
	public double area() {
		return Math.PI * radius * radius;
	}
	
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double circumference() {
		return perimeter();
	}
}

class Cylinder extends Circle{
	
	double height;
	
	public double volume() {
		return area() * height;
	}
	
	
}

public class InheritanceCircle {

	public static void main(String[] args) {
		
		Cylinder c = new Cylinder();
		c.height = 10;
		c.radius = 7;
		
		System.out.println("Volume of cylinder is: "+ c.volume());
		

	}

}
