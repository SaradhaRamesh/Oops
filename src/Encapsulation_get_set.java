import java.util.Scanner;

class EncapsulationDemo1{
	
	private String Name;
	private int Age;
	private String Country;
	

	
	public String getName() {
		return Name;
	}
	public int getAge() {
		return Age ;
	}
	public String getCountry() {
		return Country ;
	}
	public void setName(String newvalue) {
		Name=newvalue;
		
	}
	
	public void setAge(int newvalue) {
		Age= newvalue;
	}
	public void setCountry(String newvalue) {
		Country=newvalue;
		
	}
	
}

public class Encapsulation_get_set {

	public static void main(String[] args) {
		
			EncapsulationDemo1 obj=new EncapsulationDemo1();
			Scanner s=new Scanner(System.in);
			String Name=s.nextLine();
			int Age=s.nextInt();
			String Country =s.next();
			
			obj.setName(Name);
			obj.setAge(Age);
			obj.setCountry(Country);
			System.out.println("Name:"+obj.getName());
			System.out.println("Age:"+obj.getAge());
			System.out.println("Country:"+obj.getCountry());


		
		}
}
