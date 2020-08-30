
public class Enhanced {

	public static void main(String[] args) {
		loop(new String[] {"a", "b", "c", "d", "e"});

	}

	static void loop (String[] array) {
		for(String i : array) {
			System.out.print(i);
		}
	}
	
}
