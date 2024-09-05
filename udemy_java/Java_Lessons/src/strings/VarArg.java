package strings;

public class VarArg {
	
	static void check(int...x) {
		System.out.println(x.length);
	}

	public static void main(String[] args) {
		
		check();
		check(1,2,3,4);
		check(new int[] {5,6,7,8,9,0});
	}

}
