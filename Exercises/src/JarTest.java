import java.util.Arrays;

public class JarTest {

	public static void main(String[] args) {
		
		Jar<Pickle> pickleJar = new Jar<>();
		pickleJar.add(new Pickle());
		
		System.out.println(pickleJar);
		
	}

}

class Jar<E>{
	private Object[] values = new Object[1];
	public void add(E el) {
		values[0] = el;
	}
	@Override
	public String toString() {
		return "Jar [values = " + Arrays.toString(values) + "]";
	}
	
}

class Pickle{
	String color = "green";
	
	@Override public String toString() {
		return "Pickle [color = " + color + "]";
	}
	
}