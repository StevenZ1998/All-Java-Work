import java.util.ArrayList;

public class Practice {
	
	public static void main(String[] args) {
		
		counter();
		
	}
	
	public static void counter() {
		int i;
		
		ArrayList<String> list = new ArrayList<String>();
		
		for(i = 1; i <= 5; i++) {
			System.out.println("Current count: " + i);
			
			switch(i) {
			case 1:
				list.add("A");
				System.out.println("Letter is: " + list.get(i - 1));
				break;
			case 2:
				list.add("B");
				System.out.println("Letter is: " + list.get(i - 1));
				break;
			case 3:
				list.add("C");
				System.out.println("Letter is: " + list.get(i - 1));
				break;
			case 4:
				list.add("D");
				System.out.println("Letter is: " + list.get(i - 1));
				break;
			case 5:
				list.add("E");
				System.out.println("Letter is: " + list.get(i - 1));
				break;
			}
		}
	}
	
}

