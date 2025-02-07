package loop;

public class PalindromeNumber {
public static void main(String[] args) {
	int n=121;
	int originalNumber=n;
	int rev=0;
	while(n>0){
		int lastDigit= n % 10; // that is  find the lastDigit
		rev=	rev*10+ lastDigit;
		n=n/10;
	}
	
	
	if(originalNumber==rev) {
		System.out.println("Number is Palindrome");
	}
	
	else { 
		System.out.println("No is not Palindrome");
		
	}
}
}
