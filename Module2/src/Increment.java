
public class Increment {

	public static void main(String[] args) {
		int x = 0;
		
		// x + 1 "PRINT"
		System.out.println(++x);
		
		// "PRINT" x + 1
		System.out.println(x++);
		
		// "PRINT"
		System.out.println(x);
		
		// x - 1 "PRINT"
		System.out.println(--x);
		
		// x + 3
		System.out.println(x += 3);
		
		// Even element looping
		for (int i=0; i <= 10; i+=2) {
			System.out.print(i + " ");
		}
		
	}

}
