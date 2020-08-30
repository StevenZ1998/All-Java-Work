
public class Farmer {

	public static void main(String[] args) {
		Pickle pickle = new Pickle();
		pickle.grow();
		

	}

}

class Cucumber {	
	double calories;	
	public void grow () {}
}

class Pickle extends Cucumber {
	public Pickle() {
		calories = calories * 0.70;
	}
}

class Salad{}