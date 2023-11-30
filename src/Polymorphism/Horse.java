package Polymorphism;

public class Horse extends  Animal{
	public void sound() {
		super.sound();
		System.out.println("Neigh");
	}

	public static void main(String[] args) {
		Animal obj = new Horse();
		obj.sound();
		
		

	}

}
