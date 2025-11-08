package coreJavaRefresher;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Task 1: 
 * Create a List<Student> with 10 students

Find:
✅ Average marks
✅ Highest scoring student (name + marks)
*/
public class Task1 {
	
	public static final int PASSING_SCORE=500;
	
	public static void main(String[] args) {
		List<Student> st = new ArrayList<Student>();
		Random rand = new Random();
		
		String[] names = {"Mikasa", "Eren", "Naruto", "Levi", "Sasuke",
	            "Goku", "Luffy", "Tanjiro", "Ichigo", "Gojo"
	            };
		for(String name: names) {
			st.add(new Student(name, PASSING_SCORE+rand.nextInt(101)));
		}
		
		double avg = st.stream().mapToInt(s -> s.getMarks()).average().orElse(0);
		
		System.out.println(st);
		System.out.println(avg);
		
		Student topper = st.stream()
					.max((s1, s2) -> Integer.compare(s1.getMarks(), s2.getMarks()))
					.orElse(null);
		
		System.out.println(topper);
		
	}

}
