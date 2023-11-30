import java.util.Scanner;

public class Recursive_sum_digits {

	public static void main(String[] args) {
	//	Scanner s= new Scanner(System.in);
	//	number=s.nextInt();
		long sumOfAllNumbers=sumOfAllNumbers(9);
		System.out.println(sumOfAllNumbers);

	}
public static long sumOfAllNumbers(long number)
{
	
	if(number!=0) {
		return number + sumOfAllNumbers(number-1);
	}
	else {
		return number;
	}
}
}
