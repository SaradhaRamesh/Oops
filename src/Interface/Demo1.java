package Interface;
interface MyInterface{
	public void method1();
	public void method2();
}
public class Demo1 implements MyInterface {
	public void method1() {
		System.out.println("implementation of method1");
	}
	public void method2() {
		System.out.println("implementation of method2");
	}

	public static void main(String[] args) {
		MyInterface obj = new  Demo1();
		obj.method1();

	}

}
