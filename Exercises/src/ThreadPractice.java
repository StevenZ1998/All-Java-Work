import java.util.concurrent.ThreadLocalRandom;

public class ThreadPractice {
	
	public static void main(String[] args) {
		
		Thread test = new ThreadObj();
		Thread test2 = new ThreadObj();
		test.start();
		test2.start();
		
	}
	
}

class ThreadObj extends Thread{
	
	@Override
	public void run() {
		int randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
		int iterations = 1;
		do {
			System.out.println("Test is Running, thread: " + Thread.currentThread().getName() + ". Thread has had " + iterations + " iterations.");
			randomNum = ThreadLocalRandom.current().nextInt(1, 10 + 1);
			iterations++;
		} while (randomNum <= 5);
		
	}
	
}
