
public class Scopes {

	public static void main(String[] args) {
		Person one = new Person();
		Person two = new Person();
		one.age = 10;
		two.age = 20;
		Person.setPlanet("Earth");
		System.out.println(Person.getPlanet() + " is " + two.age + " old.");
	}

}

class Person{
	int age;
	private static String planet;
	
	public void move(int distance) {
		{
			distance = 10;
		}
		distance = 10;
	}

	public static String getPlanet() {
		return planet;
	}

	public static void setPlanet(String planet) {
		Person.planet = planet;
	}
	
}