
public class IfElse {

	public static void main(String[] args) {
		
		ifElse(10);
		switchCase("a");
		
	}
	
	public static void ifElse(int x) {
		
		if (x < 10) {
			System.out.println("X is less than 10.");
		}
		else if (x == 10) {
			System.out.println("X is euqal to 10.");
		}
		else if (x > 10) {
			System.out.println("X is greater than 10.");
		}
	}
	
	public static void switchCase(String x) {
		
		switch(x) {
		case "a":
			System.out.println("Character entered is a.");
			break;
		case "b":
			System.out.println("Character entered is a.");
			break;
		case "c":
			System.out.println("Character entered is a.");
			break;
		}
		
	}
	
}