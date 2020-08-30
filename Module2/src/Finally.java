import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) {
		
		FileInputStream f = null; // Create file variable.
		
		try { // Try block will make an attempt to complete the task.
			
			f = new FileInputStream("abc.txt"); // Looks for file that does not exist.
			
			System.out.println((char) f.read()); // File is not able to be read properly
		}
		
		catch(FileNotFoundException e) { // Catch block sees FileNotFoundException, and is handled.
			
			System.out.println("FileNotFoundException"); //Code within appropriate catch block is handled.
		}
		
		catch(IOException e) { // Variant error catch block.
			}
		
		finally { // Regardless of what happens, finally block WILL occur.
			
			System.out.println("Finally"); // Prints code.

			if(f != null) { // If file DOES exist.
				try{ // Attempt code.
					f.close(); // Close.
				}
				catch(IOException e) { // Handle if close cannot occur.
					
				}
			}
			
		}
		
	}
}
//Try with resources statement is another way to do this.