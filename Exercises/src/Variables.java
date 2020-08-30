
public class Variables {
	
	public static void main(String[] args) {
		
		System.out.println();
		
	}
	
}

class Variable {
	public static int year = 2020;
	
	private int age = 65;
	public String name = "John";
	String lastName = "Johnson";
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void show() {
		System.out.println("Var Name: " + name);
	}
	
	
	
}