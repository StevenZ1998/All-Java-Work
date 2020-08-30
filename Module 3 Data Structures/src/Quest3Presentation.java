import java.util.ArrayList;

public class Quest3Presentation {

	public static void main(String[] args) {
		
		ArrayList<String> students = new ArrayList<String>(4);
		students.add("Steven");
		students.add("Eduardo");
		students.add("Carlton");
		students.add("Zachary");
		students.add("Anthony");
		
		printInfo(students);
		
		students.remove(0);
		
		System.out.println();
		
		printInfo(students);
		
		
	}
	
	public static void printInfo(ArrayList<String> students) {
		System.out.println(students);
		System.out.println("The class has " + students.size() + " students.");
	}
	
}