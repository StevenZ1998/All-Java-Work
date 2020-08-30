
public class Presentation {
	public static void main(String[] args) {
		Vanilla iceCream = new Vanilla();
		iceCream.eat(1);
	}
}

class IceCream {
	public void start() {
		System.out.println("*You are handed some ice cream.*");
	}	
	public void eat() {
		System.out.println("Yummy!");
	}
}

class Vanilla extends IceCream {
	public void eat() {
		super.start();
		System.out.println("YOU: I really like Vanilla!");
	}	
	public void eat(int limitedNumberScoops) {
		super.start();
		System.out.println("*It only has one scoop of ice cream in it*");
		System.out.println("YOU: I never really liked Vanilla anyway...");
	}
}