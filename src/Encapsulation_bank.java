import java.util.Scanner;

class EncapsulationDemo2{
	
	private String Ac_num;
	private float bal;
	


	public String getAc_num() {
		return Ac_num;
	}
	public float getbal() {
		return bal ;
	}
	public void setAc_num(String newvalue) {
		Ac_num=newvalue;
		
	}
	
	public void setbal(float newvalue) {
		bal= newvalue;
	}
	
}


public class Encapsulation_bank {

	public static void main(String[] args) {
		EncapsulationDemo2 obj= new EncapsulationDemo2();
		Scanner s = new Scanner(System.in);
		String Ac_num=s.next();
		float bal=s.nextFloat();
		obj.setAc_num(Ac_num);
		obj.setbal(bal);
		System.out.println("Account Number:"+obj.getAc_num());
		System.out.print("Account Number:"+obj.getbal());
	}

}
