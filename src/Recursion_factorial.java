
public class Recursion_factorial {
static int factorial(int n) {
	if(n!=0)//terminal condition
		return n*factorial(n-1);//recursive call
	else
		return 1;
}
	public static void main(String[] args) {
		int number=4,result;  
		result=factorial(number);
		System.out.print(number+" factorial="+result);

	}

}
