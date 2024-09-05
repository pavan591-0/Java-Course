package oops;

// Define an interface named Shape
interface Shape {
    
    // An abstract method to calculate the area of the shape.
    double calculateArea();
    
    // An abstract method to calculate the perimeter of the shape.
    double calculatePerimeter();
    
    // A default method to display the shape's information.
    default void displayInfo() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
    
    // A static method to describe the purpose of the interface.
    static void describeInterface() {
        System.out.println("This interface defines basic behaviors for a shape.");
    }
}

// Implementing the Shape interface in a Circle class
class Circle1 implements Shape {
    
    // Instance variables for the radius of the circle
    private double radius;
    
    // Constructor to initialize the radius
    public Circle1(double radius) {
        this.radius = radius;
    }
    
    // Provide implementation for the calculateArea() method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Provide implementation for the calculatePerimeter() method
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Implementing the Shape interface in a Rectangle class
class Rectangle implements Shape {
    
    // Instance variables for the length and width of the rectangle
    private double length;
    private double width;
    
    // Constructor to initialize the length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Provide implementation for the calculateArea() method
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // Provide implementation for the calculatePerimeter() method
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class to test the interface and its implementations
public class Interfaces {
    public static void main(String[] args) {
        
        // Creating instances of Circle and Rectangle
        Shape circle = new Circle1(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        
        // Displaying information for each shape
        circle.displayInfo();
        rectangle.displayInfo();
        
        // Calling the static method from the Shape interface
        Shape.describeInterface();
    }
}
