
public class Store {

	public static void main(String[] args) {
		
		Furniture chair = new Chair();
		Furniture table = new Table();
		sell(chair);
		sell(table);
	}

	public static void sell (Furniture furn) {
		System.out.println(furn);
	}
	
}

class Furniture {}
class Chair extends Furniture{}
class Table extends Furniture{}