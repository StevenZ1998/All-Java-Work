
public class InnerClassesExample {
	public static void main(String[] args) {
		
		Computer comp = new Computer();
		comp.printCompInfo();
		
		Computer.Screen screen = comp.new Screen();
		screen.printScreenInfo();
		
		// Anonymous
		Computer comp2 = new Computer() {
			public void printCompInfo() {
				System.out.println("Year from Anonymous: " + getYear());
			}
		};
		
		comp2.printCompInfo();
		
		// Local Inner Class
		Outer o = new Outer();
		o.run();
		
	}
}

class Computer {
	private int year = 2020;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printCompInfo() {
		System.out.println("Year from OUTER: " + year);
	}
	
	class Screen {
		public void printScreenInfo() {
			System.out.println("Year from Inner: " + year);
		}
	}
	
}

class Outer {
	int outerVar = 100;
	static int staticOuterVar = 150;
	
	Object run() {
		class LocalClass {
			void displayLocal() {
				System.out.println("Hello from local class.");
				System.out.println("Hell from local class: " + staticOuterVar);
			}
		}
		
		LocalClass local = new LocalClass();
		local.displayLocal();
		return local;
	}
}
