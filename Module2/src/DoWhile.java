
public class DoWhile {

	public static void main(String[] args) {
		
		loop(false);

	}
	
	static void loop (boolean running) {
		do {
			System.out.println("Running");
		}
		while (running);
	}
	
}
