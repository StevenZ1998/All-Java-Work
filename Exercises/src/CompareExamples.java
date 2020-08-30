import java.util.*;

public class CompareExamples {
	public static void main(String[] args) {
		
		List<String> words = new ArrayList<>();
		words.add("dog");
		words.add("sky");
		words.add("house");
		words.add("city");
		
		System.out.println(words);
		
		Collections.sort(words);
		
		System.out.println(words);
		
		words.sort(Comparator.reverseOrder());
		System.out.println(words);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<MenuItem> items = new ArrayList<>();
		MenuItem salad = new MenuItem("Salad", 10);
		MenuItem fanta = new MenuItem("Fanta", 3);
		MenuItem wings = new MenuItem("Lemon Pepper", 12);
		
		items.add(salad);
		items.add(fanta);
		items.add(wings);
		
		Collections.sort(items);
		System.out.println(items);
		
	}
}
