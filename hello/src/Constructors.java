
public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Pizza pizza = new Pizza();
	 pizza.slices = 8;
	 Pizza pie = new Pizza(6);
	 pizza.eat();
		
	 System.out.println(pizza.slices);
	 
	 System.out.println(pie.slices);

	}
}

class Pizza {
	
	int slices;
	String topping;
	
	Pizza() {}
	
	Pizza(int pieces){
		slices = pieces;
	}
	
	public void eat () {
		
		slices = slices - 1;
		
	}
	
}