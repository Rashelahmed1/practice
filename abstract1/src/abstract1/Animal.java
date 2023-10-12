package abstract1;

public abstract class Animal {

	String name;
	int age;

	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}


	public void disply() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println();
	}

	public abstract void eat();


}