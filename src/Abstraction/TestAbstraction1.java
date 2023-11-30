package Abstraction;
abstract class Shape1{
	abstract void draw();
}
class Rectangle extends Shape1{
	void draw() {
		System.out.println("drawing rectangle");
	}
}
class circle1 extends Shape1{
	void draw() {
		System.out.println("drawing circle1");
	}
}
public class TestAbstraction1 {

	public static void main(String[] args) {
		Shape1 s = new circle1();
		Shape1 r = new Rectangle();
		s.draw();
		r.draw();
	}

}
