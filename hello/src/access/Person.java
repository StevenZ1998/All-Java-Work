package access;

public class Person {
	Computer pc = new Computer();
	private int age;
	
	public void setAge(int val) {
		age = val;
	}
	
	public int getAge() {
		return age;
	}
	
	public void code() {
		pc.code();
	}
	
}

class House {
	public void tenant() {
		Person person = new Person();
		person.setAge(1);
	}
}