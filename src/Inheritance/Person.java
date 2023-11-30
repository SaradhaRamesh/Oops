package Inheritance;
class person1{
	private int age;
	private String name;
	private String country;
	//Getter and Setter methods
	public int getage() {
		return age;
	}
	public String getname() {
		return name ;
	}
	public String getcountry() {
		return country ;
	}
	public void setage(int newvalue) {
		age= newvalue;
	}
	public void setname(String newvalue) {
		name=newvalue;
		
	}
	public void setcountry(String newvalue) {
		country=newvalue;
		
	}
	
}

public class Person {

	public static void main(String[] args) {
		person1 obj=new person1();
		obj.setname("sara");
		obj.setage(21);
		obj.setcountry("India");
		System.out.println("Name:"+obj.getname());
		System.out.println("Age:"+obj.getage());
		System.out.println("Country:"+obj.getcountry());
	}

	}

