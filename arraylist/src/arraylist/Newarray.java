package arraylist;

import java.util.ArrayList;

public class Newarray {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();

		System.out.println(number.size());
	
	
	
	number.add(10);
	number.add(20);
	number.add(30);
	number.add(3, 40);
	
	for(int x : number)
	
	System.out.print(" "+x);
	
	System.out.println(number);
	
	System.out.println(number.size());
	
	
	
	
	}

}
