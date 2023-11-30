package Polymorphism;

public class Cat extends Animal {
			public void sound() {
			System.out.println("meow");
		}

		public static void main(String[] args) {
			Animal obj = new Cat();
			obj.sound();
			
			

		}

	}
