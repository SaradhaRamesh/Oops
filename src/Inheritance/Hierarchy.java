package Inheritance;
class Parent{
	void show() {
		System.out.println("We are parents");
	}
}
class son1 extends  Parent{
	void disp() {
		System.out.println("I am son class");
	}
}
class daughter extends  Parent{
	void disp() {
		System.out.println("I am daughter class");
	}
}

public class Hierarchy {

	public static void main(String[] args) {
		son1 s = new son1();
		daughter d = new daughter();
		s.show();
		d.show();
		s.disp();
		d.disp();

	}

}
