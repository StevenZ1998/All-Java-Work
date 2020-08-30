
public class Chaining {

	public static void main(String[] args) {
		
		JavaDeveloper dev = new JavaDeveloper("Java");		
		
		System.out.println(dev);
		
	}

}

class Employee {
	String name = "Dan Pickles";
	public Employee () {
		System.out.println("Employee");
	}
}

class JavaDeveloper extends Employee {
	String language;
	public JavaDeveloper() {
		super();
		System.out.println(name + " JavaDeveloper");
	}
	
	public JavaDeveloper(String language) {
		this();
		this.language = language;
		System.out.println(language);
	}
}

