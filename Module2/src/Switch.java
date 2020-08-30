
public class Switch {

	public static void main(String[] args) {
		switchCase("C");
	}

	static void switchCase(String value) {
		switch(value) {
		case "A" : {
			System.out.println("A");
			break;
		}
		case "B" : {
			System.out.println("B");
			break;
		}
		default : {
			System.out.println("Neither A nor B");
			break;
		}
		}
	}
	
}
