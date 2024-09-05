package oops;

class StaticBlockExample{
	
	static int s;
	
	static {
		System.out.println("output 3");
	}
	
	static {
		System.out.println("output 4");
	}
	
}

public class StaticPractise {

	public static void main(String[] args) {
		StaticBlockExample sb = new StaticBlockExample();
		System.out.println("Main");
		System.out.println(sb.s);

	}
	
	static {
		System.out.println("output 1");
	}
	
	static {
		System.out.println("output 2");
	}

}
