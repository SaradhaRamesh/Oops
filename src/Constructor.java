import java.util.Scanner;

public class Constructor {

	
		// TODO Auto-generated method stub
		int emp_id,salary;
	 String emp_name;
	Constructor(){
		emp_id=1;
		emp_name="sara";
		salary=200000;
		
	}
	Constructor(int id ,String name,int sal){
		//parameterized constructor
		emp_id=id;
		emp_name=name;
		salary=sal;
		
	}
	void display() {
		System.out.println("Employee details: ");
		System.out.println("Employee id: "+emp_id);
		System.out.println("Employee name: "+emp_name);
		System.out.println("Employee salary: "+salary);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id,salary;
		String name;
		System.out.print("Enter employee id:");
		id=s.nextInt();
		System.out.print("Enter employee name:");
		name=s.next();
		System.out.print("Enter employee salary:");
		salary=s.nextInt();
		Constructor obj = new Constructor();
		obj.display();
		Constructor obj1 = new Constructor(2,"madhu",300000);
		obj1.display();
		Constructor obj2 = new Constructor(id,name,salary);
		obj2.display();
}
}