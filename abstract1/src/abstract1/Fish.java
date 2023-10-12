package abstract1;

public class Fish extends Animal{
	
	String origin;
	double weight;
	
	public Fish (String origin,double weight,String name,int age) {
		
		super(name,age);
		this.origin = origin;
		this.weight = weight;
	}
		
		public void eat() {
			System.out.println("Fish eat sea food");
		}
		
	

	public void disply() {
		System.out.println("Origin = "+origin);
		System.out.println("Weight = "+weight+"lb");
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println();
	}
}
