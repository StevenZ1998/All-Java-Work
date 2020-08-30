
public class Logical {

	public static void main(String[] args) {
		boolean holiday = false;
		boolean weekend = true;
		boolean work = false;
		
		if(holiday || weekend && !work) {
			System.out.println("Day off.");
		}
		
		int x = 10;
		if (x > 10 || x < 10) {}
		
	}

}
