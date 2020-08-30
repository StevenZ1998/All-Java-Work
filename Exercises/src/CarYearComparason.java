import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarYearComparason {
	
	public static void main(String[] args) {
		
		List<Automobile> carList = new ArrayList<>();
		Automobile toyota = new Automobile();
		Automobile ford = new Automobile();
		Automobile chevy = new Automobile();
		
		toyota.setYear(1998);
		ford.setYear(2000);
		chevy.setYear(2010);
		toyota.setMake("Toyota");
		ford.setMake("Ford");
		chevy.setMake("Chevy");
		
		carList.add(ford);
		carList.add(chevy);
		carList.add(toyota);
		
		Collections.sort(carList);
		System.out.println(carList);
	}
	
}
