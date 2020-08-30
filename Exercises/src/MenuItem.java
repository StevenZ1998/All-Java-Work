
public class MenuItem implements Comparable<MenuItem>{
	
	String name;
	int price;
	
	public MenuItem(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public MenuItem() {
		super();
	}
	
	@Override
	public String toString() {
		return "MenuItem [name = " + name + ", price = " + price + ".";
	}

	@Override
	// Defines Natural Order
	public int compareTo(MenuItem another) {
		
		if(this.price > another.price) return 1;
		else return -1;
		
	}
	
}
