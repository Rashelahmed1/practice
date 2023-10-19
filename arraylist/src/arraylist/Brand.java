package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Brand {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<>();

	cars.add("BMW");
	cars.add("Honda");
	cars.add("Acura");
	cars.add("Toyota");
	cars.add("Kia");
	for (int i = 0;i<cars.size();i ++) {
		
	
	
	
	Collections.sort(cars);
	System.out.println(cars.get(i));
	
	
	}
	
	
	
	
	
	
	
	
	
	}

}
