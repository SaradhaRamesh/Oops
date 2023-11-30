
public class Recursive_palindrome {

	public static void main(String[] args) {
		boolean flag = palindromeCheck("madam");
		System.out.println(flag);
		flag=palindromeCheck("nine");
		System.out.println(flag);
		flag=palindromeCheck("malayalam");
		System.out.println(flag);
	}
public static boolean palindromeCheck(String s) {
	if(s.length()==0||s.length()==1) {
		return true;
	}
	if(s.charAt(0) == s.charAt(s.length()-1))
{
		return palindromeCheck(s.substring(1,s.length()-1));
	}
	return false;
}
}
