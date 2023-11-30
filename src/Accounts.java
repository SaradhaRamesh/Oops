import java.io.*;

import java.util.Scanner;

public class Accounts {
static int Acc_id;
static Long con;
static int Dep_amount;
static String Acc_name,Add;
static void display(int Acc_id,String Acc_name,String Add,Long con, int Dep_amount) {
	System.out.println("Account id: "+Acc_id);
	System.out.println("Account name: "+Acc_name);
	System.out.println("Address: "+Add);
	System.out.println("Contact: "+con);
	System.out.println("Deposite Amount: "+Dep_amount);
}
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Account id: ");
		Acc_id=s.nextInt();
		System.out.println("Account name: ");
		Acc_name=s.next();
		System.out.println("Address: ");
		//Add=s.next();
		//s.nextLine();
		DataInputStream object = new DataInputStream(System.in);
		Add = object.readLine();
		System.out.println("Contact: ");
		con=s.nextLong();
		System.out.println("Deposite Amount: ");
		Dep_amount=s.nextInt();
		display( Acc_id, Acc_name,Add, con, Dep_amount) ;
		s.close();
	}

}
