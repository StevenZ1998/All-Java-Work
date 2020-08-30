
public class AnimalSim {
	
	public static void main(String[] args) {
		
		Lion Marty = new Lion();
		
		Marty.exists();
		Marty.eat();
		
	}
	
}

abstract class Animal {
	
	private String species;
	private int height;
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void eat() {
		System.out.println(species + " ate.");
	}
	
	public void run() {
		System.out.println(species + " runs");
	}
	
}

class Lion extends Animal {
	
	public void exists () {
		setHeight(10);
		setSpecies("Lion");
	}
}
