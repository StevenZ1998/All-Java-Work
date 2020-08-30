import java.util.*;

public class CollectionExample {
	
	public static void main(String[] args) {
		
		MenuItem salad = new MenuItem("Salad", 10);
		MenuItem pepsi = new MenuItem("Pepsi", 3);
		MenuItem wings = new MenuItem("Chicken Wings", 12);
		
		Collection<MenuItem> menu = new ArrayList<MenuItem>();
		
		menu.add(salad);
		menu.add(pepsi);
		menu.add(wings);
		
		System.out.println(menu);
		
		for (MenuItem m : menu) {
			System.out.println("For Each: " + m);
		}
		
		Iterator<MenuItem> itemIterator = menu.iterator();
		while(itemIterator.hasNext()) {
			MenuItem item = itemIterator.next();
			System.out.println(item);
			
			if(item.price < 10) {
				itemIterator.remove();
			}
			
		}
		
		System.out.println("Updated Menu " + menu);
		
		System.out.println("Size " + menu.size());
		System.out.println("Empty " + menu.isEmpty());
		System.out.println("Contains Wings:  " + menu.contains(wings));
		System.out.println("Contains Pepsi:  " + menu.contains(pepsi));
		
		Collection<MenuItem> newMenu = new ArrayList<>();
		newMenu.addAll(menu);
		System.out.println("New Menu " + newMenu);
		
		menu.add(pepsi);
		System.out.println("Menu " + menu);
		
		menu.removeAll(newMenu);
		System.out.println("Menu " + menu);
		
	}
}
