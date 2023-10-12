package abstract1;

public class Bird extends Animal{

	String color;
	String kinds;
	
	public Bird(String color,String kinds,String name,int age) {
		super(name,age);
		this.color = color;
		this.kinds = kinds;
	}
	public void eat() {
		System.out.println("Bird eat worms");
	}


	public void disply() {
		System.out.println("Color = "+color);
		System.out.println("Kinds ="+kinds);
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println();
	}
	
	
	
	
}
