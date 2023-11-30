package Interface;
interface inter1{
	public void fun1();
}
interface inter2 extends inter1{
	public void fun2();
}
class Interimple implements inter1,inter2{
	public void fun1() {
		System.out.println("Interface1");
	}
	public void fun2() {
		System.out.println("Interfac2");
	}
}
public class mainclassforinterface {

	public static void main(String[] args) {
		Interimple obj = new Interimple();	
		inter2 obj2 =  obj;
		obj2.fun1();
		obj2.fun2();
	}

}
