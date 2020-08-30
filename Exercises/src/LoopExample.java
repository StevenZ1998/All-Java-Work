
public class LoopExample {
	
	public static void main(String[] args) {
		
		LoopExample lp = new LoopExample();
		lp.dowhile();
		lp.switches("B");
		lp.loops();
		
	}
	
	public void dowhile() {
		System.out.println("***** DOWHILE *****");
		
		int x = 5;
		
		while (x <= 5) {
			System.out.println("While: " + x++);
		}
		
		do {
			System.out.println("Do: " + x);
		} while (x < 5);
		
	}
	
	public void switches(String choice) {
		System.out.println("***** SWITCHES *****");
		switch(choice) {
			case "A": {
				System.out.println("A");
				break;
			}
			case "B": {
				System.out.println("B");
				break;
			}
			case "C": {
				System.out.println("C");
				break;
			}
		}
	}
	
	public void loops() {
		System.out.println("***** FOR LOOPS *****");
		int[] numbers = {1,2,3};
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		for(int el: numbers) {
			System.out.println(el);
		}
		
	}
	
	public void tern() {
		System.out.println("***** TERNARY *****");
		int x = 5;
		
		if(x > 5) {
			if (x > 6) {
				System.out.println("X > 6");
			}else System.out.println("Else Enner");
		}else System.out.println("Else Outer");
		
		String msg = "";
		msg = (x > 5) ? "x > 5" : "x <= 5";
		System.out.println(msg);
		
		int y = x > 0 ? x > 5 ? 1 : 2 : 3;
		System.out.println(y);
	}
	
}
