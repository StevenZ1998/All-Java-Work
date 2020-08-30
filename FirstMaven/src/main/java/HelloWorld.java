
public class HelloWorld {
	
	public static void main(String ...args) {
		
		System.out.println("Hello World!");
		print(99, 1, 4, 6, 8);
		
	}
	
	public static void print(int b, int r, int ...a) {
		System.out.println("B " + b);
		System.out.println("R " + r);
		for (int i : a) {
			System.out.println(i);
		}
	}
	
}
