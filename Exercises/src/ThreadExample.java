
public class ThreadExample extends Thread{
	
	public void run() {
		System.out.println("Inside RUn Method: " + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		System.out.println("Test.");
		
		Thread thread = new ThreadExample();
		thread.start();
		
		Thread thread2 = new ThreadExample();
		thread2.start();
		
	}
	
}
