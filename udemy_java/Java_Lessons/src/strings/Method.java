package strings;

public class Method {

	// have to define this as static otherwise error.
	static int max(int x, int y) {
		if(x > y) return x;
		return y;
	}
//  Throws error and does not constitute to method overloading.
//	static float max(int x, int y) {
//		if(x > y) return x;
//		return y;
//	}
	
	public static void main(String[] args) {
		
		System.out.println(max(8, 7));

	}

}
