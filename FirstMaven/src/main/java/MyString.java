
public class MyString {
	
	public String reverse(String value) {
		// Return new StringBUilder(value).reverse().toString();
		
		StringBuilder reversed = new StringBuilder();
		for (int pos = value.length() - 1; pos >= 0; pos--) {
			reversed.append(value.charAt(pos));
		}
		
		return reversed.toString();
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
}
