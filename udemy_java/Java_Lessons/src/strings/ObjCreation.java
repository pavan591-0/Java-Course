package strings;

public class ObjCreation {

	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		
		byte[] b = {74, 97, 118, 97};
		String s4 = new String(b);
		
		char[] c = {'J', 'a', 'v', 'a'};
		String s5 = new String(c);
		
		if(s1 == s2) System.out.println(s1+" (S1 Equals S2) " +s2); // prints
		if(s1 == s3) System.out.println(s1+" (S1 Equals S3) " +s3);
		else System.out.println("It's not!!!"); // prints
		if(s3.equals(s1)) System.out.println(s1+" (S1 Equals S3) " +s3); // prints
		else System.out.println("It's not!!!");
		if(s1 == s4) System.out.println(s1+" (S1 Equals S3) " +s4); 
		else System.out.println("It's not!!!"); // prints
		if(s4.equals(s1)) System.out.println(s1+" (S1 Equals S4) " +s4); // prints
		else System.out.println("It's not!!!");
		if(s1 == s5) System.out.println(s1+" (S1 Equals S5) " +s5); 
		else System.out.println("It's not!!!"); // prints
		if(s5.equals(s1)) System.out.println(s1+" (S1 Equals S5) " +s5); // prints
		else System.out.println("It's not!!!");
		if((s3 == s4) && (s4 ==s5)) System.out.println("Objects are equal");
		else System.out.println("It's not!!!"); // prints

	}

}
