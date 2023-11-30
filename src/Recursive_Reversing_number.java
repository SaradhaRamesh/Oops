import java.util.Scanner;

public class Recursive_Reversing_number {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		callMyself(n);//5=5 4 3 2 1

	}
public static void callMyself(long i) {
	if (i<=0) {
		return;
	}
	System.out.print(i+" ");
	i=i-1;
	callMyself(i);
}
}
