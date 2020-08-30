
public class InnerClassExample {
	
	public static void main(String[] args) {
		
		Tree prunus = new Tree();
		prunus.blossoms();
		
	}
	
}

class Tree {
	
	public void exists() {
		System.out.println("The tree is tall and brown with dark green leaves.");
	}
	
	class Fruit {
		public void fruity() {
			System.out.println("A fruit of the tree, very sweet!");
		}
	}
	
	public void blossoms() {
		Fruit cherry = new Fruit();
		cherry.fruity();
	}
	
}