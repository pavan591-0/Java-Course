package oops;

class Parent{
	
	public int num1 = 100;
	
	Parent(){
		System.out.println("Hello from Parent.");
	}
	
	public void display() {
		System.out.println("Hello welcome to the Parent class.");
	}
	
}

class Child extends Parent{
	
	Child(){
		System.out.println("Hello from child.");
	}
	
	public void display() {
		System.out.println("Hello welcome to the child class.");
	}
	
	public void add(String S1, String s2) {
		System.out.println(S1 + s2);
	}
}

public class OverRiding {
	
	public static void main(String[] args) {
		
		Child c = new Child(); // Hello from Parent. Hello from child.
		System.out.println("======================================");
		c.display(); // Hello welcome to the child class.
		System.out.println("======================================");
		Parent p = new Child(); // Hello from Parent. Hello from child.
		p.display(); // Hello welcome to the child class.
		//p.add("Sai", "Pavan") // generates error can access only overrided methods
		System.out.println("======================================");
		// Child c1 = new Parent(); // error
		//Child c1 = (Child) new Parent(); // Class Cast Exception.
		//c1.display(); 
		
	}

}
