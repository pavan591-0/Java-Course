package coreJavaRefresher;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


/**
 * Task 1: 
 * Create a List<Student> with 10 students

Find:
✅ Average marks
✅ Highest scoring student (name + marks)
*/
public class StudentMarkAnalyzer {
	
	public static final int BASE_SCORE=500;
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Random rand = new Random();
		
		String[] names = {"Mikasa", "Eren", "Naruto", "Levi", "Sasuke",
	            "Goku", "Luffy", "Tanjiro", "Ichigo", "Gojo"
	            };
		for(String name: names) {
			students.add(new Student(name, BASE_SCORE+rand.nextInt(101)));
		}
		
		System.out.println("------------Marks Report------------");
		
		System.out.printf("Average Score of the students is: %.2f%n", getAverageMarks(students));
		
		System.out.println("\nThe highest marks achieved is: "+ getHighestMarks(students)+"\n");
		
		printTopThree(students);
		
	}
	
	private static double getAverageMarks(List<Student> students) {
		return students.stream().mapToInt(student -> student.getMarks()).average().orElse(0);
	}
	
	private static Student getHighestMarks(List<Student> students) {
		return students.stream().max((s1, s2) -> Integer.compare(s1.getMarks(), s2.getMarks())).orElse(null);
	}
	
	private static void printTopThree(List<Student> students) {
		 students.stream()
		 .sorted(Comparator.comparingInt(Student::getMarks).reversed())
		//	    .sorted((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks())) // descending
			    .limit(3)
			    .forEach(System.out::println);;

	}

}
