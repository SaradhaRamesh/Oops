import java.util.Scanner;

public class Class_Objects {
	
	static int id,m1,m2,m3;
	static String name;
	static void display(int id, String name,int m1,int m2 ,int m3) {
		float tot,avg;
		tot=m1+m2+m3;
		avg=tot/3;
		System.out.println("Student details");
		System.out.println("Stud id: "+id);
		System.out.println("Stud name: "+name);
		System.out.println("Mark1: "+m1);
		System.out.println("Mark2: "+m2);
		System.out.println("Mark3: "+m3);
		System.out.println("Total: "+tot);
		System.out.println("Avg: "+avg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student Id: ");
		id =s.nextInt();
		System.out.println("Enter student name: ");
		name =s.next();
		System.out.println("Enter student m1: ");
		m1 =s.nextInt();
		System.out.println("Enter student m2: ");
		m2 =s.nextInt();
		System.out.println("Enter student m3: ");
		m3 =s.nextInt();
		//Class_Objects obj = new Class_Objects(); ------->normal object creation
		//obj.display(id,name,m1,m2,m3) ---------> object calling
		display(id,name,m1,m2,m3);//static method calling
		s.close();
	}

}
