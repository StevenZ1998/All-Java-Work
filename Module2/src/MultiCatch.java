import java.util.concurrent.ExecutionException;
import java.util.zip.DataFormatException;

public class MultiCatch {

	public static void main(String[] args) {
		
		try{
			process();
			// In order of exception, go from specialized to general.
		}
		catch(ExecutionException | DataFormatException e) {
			// Same code.
		}
		
	}
	
	static void process () throws DataFormatException, ExecutionException {
		//code
	}
	
}
