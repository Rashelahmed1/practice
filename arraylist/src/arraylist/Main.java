package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Person a = new Person(40,"Anis",30000);
		
		Person b = new Person(41,"Fahim",40000);
		
		Person c = new Person(42,"Ahmed",50000);
		
		ArrayList<Person> p = new ArrayList<>();
		p.add(a);
		p.add(b);
		p.add(c);
		
		
		for(Person x  :  p) { 
			
			System.out.println(x.name);
			System.out.println(x.age);
			System.out.println(x.salary);
		}
		
		

	}

}
