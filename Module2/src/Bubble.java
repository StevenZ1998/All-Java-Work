
public class Bubble {

	public static void main(String[] args) {
		
		int[] unsorted = {5, 3, 7, 8, 10, 2};
		unsorted = sort(unsorted);
		for(int i : unsorted) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] sort(int[] array) {
		// For as elements in the array.
		for (int outer = 0; outer < array.length; outer++) {
			// Check each element and swap as needed.
			for(int inner = 1; inner <array.length - outer; inner++) {
				if(array[inner - 1] > array[inner]) {
					int temp = array[inner - 1];
					array[inner - 1] = array [inner];
					array [inner] = temp;
			}
		}
		}
		return array;
		
	}
	
}
