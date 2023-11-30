package Inheritance;
class EncapsulationDemo{
	private int ssn;
	private String empName;
	private int empAge;
	//Getter and Setter methods
	public int getEmpSSN() {
		return ssn;
	}
	public String getEmpName() {
		return empName ;
	}
	public int getEmpAge() {
		return empAge ;
	}
	public void setEmpAge(int newvalue) {
		empAge= newvalue;
	}
	public void setEmpName(String newvalue) {
		empName=newvalue;
		
	}
	public void setEmpSSN(int newvalue) {
		ssn=newvalue;
		
	}
	
}
public class EncapsTest {

	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpName("sara");
		obj.setEmpAge(21);
		obj.setEmpSSN(2125);
		System.out.println("Employee Name:"+obj.getEmpName());
		System.out.println("Employee SSN:"+obj.getEmpSSN());
		System.out.println("Employee Age:"+obj.getEmpAge());
	}

}
