package arithmetic;

public class IncDec {
	
	public static void main(String args[]) {
		
		int a = 7;
		a = a++;  // a wont be updated remains 7
		System.out.println(a);
		
		int b;
		b = 2 * a++ + 3 * ++a; // 2 * 7 + 3 * 9
		System.out.println(b);
		
		float c = 6.4f;
		System.out.println(++c);
		
		char ch = 'A';
		System.out.println(++ch);
	}
}
