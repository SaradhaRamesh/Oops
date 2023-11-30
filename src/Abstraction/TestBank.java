package Abstraction;
abstract class Bank{
	abstract int getRateOfIntrest();
}
class SBI extends Bank{
	int getRateOfIntrest() {
		return 7;
	}
}
class PNB extends Bank{
	int getRateOfIntrest() {
		return 8;
	}
}

public class TestBank {
public static void main(String args[]) {
	Bank b= new SBI();
	System.out.println("Rate of intrest:"+b.getRateOfIntrest()+"%");
	 b= new PNB();
	System.out.print("Rate of intrest:"+b.getRateOfIntrest()+"%");

}
}
