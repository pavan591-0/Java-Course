package strings;

public class RegEx {

	public static void main(String[] args) {
		
		String s1 = "c";
		System.out.println(s1.matches("[abc]")); // true
		
		String s2 = "p";
		System.out.println(s2.matches("[abc]")); // false
		
		String s3 = "p";
		System.out.println(s3.matches("[^abc]")); // true
		
		String s4 = "9";
		System.out.println(s4.matches("[a-z0-9]")); // true
		
		String s5 = "p5";
		System.out.println(s2.matches("[a-z][0-9]")); // false
		System.out.println(s5.matches("[a-z][0-9]")); // true
		
		String s6 = "abcdef 908765";
		System.out.println(s6.matches("[a-z]*\s[0-9]*")); // true
		
		// Exercise : find out valid gmail or not and separate username and domain
		
		String s7 = "Java@gmail.com";
		if(s7.matches(".*@gmail.*")) {
			int ind = s7.indexOf('@');
			System.out.println("Username: "+ s7.substring(0, ind));
			System.out.println("Domain: "+ s7.substring(ind + 1));
		}
		
		// exercises
		
		String s8 = "1011011";
		System.out.println("1011011 Binary or not: "+s8.matches("[01]+"));
		
		String s9 = "12ae";
		System.out.println("12ae Hex or not: "+s9.matches("[0-9a-f]+"));
		
		String s10 = "09/08/2024";
		String s11 = "09/8/24";
		System.out.println("Date or not: "+s10.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
		System.out.println("Date or not: "+s11.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}"));
		
		
		
	}

}
