package Polymorphism;
class ClassFirst{
	public void Display() {
		System.out.println("class First: display");
	}
	public void show() {
		System.out.println("class First: show");
	}
}
class ClassSecond extends ClassFirst{
	public void Display() {
		System.out.println("class Second: display");
	}
	public void show() {
		System.out.println("class Second: show");
	}
}
public class UseFirstSecond {

	public static void main(String[] args) {
		ClassSecond cs = new ClassSecond();
		cs.Display();
		cs.show();

	}

}
