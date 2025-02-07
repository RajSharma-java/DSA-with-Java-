package Strings;

public class PalindromeString
{
	public static void main(String[] args) {
		String str="madam";
		char ch[]=str.toCharArray();
		String rev="";
		
		String originalString=str;
		for(int i=ch.length-1; i>=-0; i--) {
			rev= rev+ch[i];
			
		}
		System.out.println("Reverse String is :" + rev);
		if(rev.equals(originalString)) {
			System.out.println("String is palindrome ");
		}
		else {
			System.out.println("String is not palindrome ");
		}
	}

}
