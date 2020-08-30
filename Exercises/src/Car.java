
/* public class Car {

	public static void main(String[] args) {
		
		Automobile ford = new Automobile();
		Automobile toyota = new Automobile();
		
		ford.setYear(1998);
		toyota.setYear(2010);
		
		System.out.println(ford.getYear() + " " + toyota.getYear());
		
	}
	
} */

class Automobile implements Comparable<Automobile>{
	static int wheels = 4;	
	
	private String make;
	private int year;
	private int speed;
	
	public void setMake(String make) {
		this.make  = make;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setYear(int value) {
		year  = value;
	}
	
	public int getYear() {
		return year;
	}
	
	public int speed(){
		int accelerationVal = 10;
		speed = accelerationVal;
		return speed;
	}
	
	
	
	@Override
	public String toString() {
		return "Automobile [Make = " + make + ", Year = " + year + ", Speed = " + speed + "]";
	}

	@Override
	public int compareTo(Automobile another) {
		
		if(this.year > another.year) return 1;
		else return -1;
		
	}
}