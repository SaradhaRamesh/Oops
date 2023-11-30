import java.util.Scanner;

class Encapsulationdemo3{
	private int Id;
	private String Name;
	private double salary;
	


	public int getId() {
		return Id;
	}
	public String getName() {
		return Name ;
	}
	public double getsalary() {
		return salary ;
	}
	public void setId(int newvalue) {
		Id=newvalue;
		
	}
	
	public void setName(String newvalue) {
		Name= newvalue;
	}
	public void setsalary(double newvalue) {
		salary= newvalue;
	}
	
}


public class Encapsulation_salary {

	public static void main(String[] args) {
		Encapsulationdemo3 obj= new Encapsulationdemo3();
		Scanner s = new Scanner(System.in);
		int Id=s.nextInt();
		s.nextLine();
		String Name=s.nextLine();
		double salary=s.nextDouble();
		obj.setId(Id);
		obj.setName(Name);
		obj.setsalary(salary);
		System.out.println("Employee Details:");
		System.out.println("Id:"+obj.getId());
		System.out.println("Name:"+obj.getName());
		System.out.printf("salary: $%.2f",obj.getsalary());
	

	}

}
