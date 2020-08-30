import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Declaring {

	public static void main(String[] args) {
		
		// read(); // Handle somewhere else

	}
	
	// Declaring exception, not handling.
	static void read() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("file.txt");
	}
	
}
