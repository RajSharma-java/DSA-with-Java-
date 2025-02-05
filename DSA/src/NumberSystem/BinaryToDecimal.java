package NumberSystem;

public class BinaryToDecimal
{
	public static void main(String[] args) {
		int n=1001; // it is binary number
		int power=1; // it is 2^0=1
		
		int ans=0;
		
		while(n>0) {
			int lastDigit= n%10;
			ans=ans+(lastDigit*power);
			n=n/10;
			power= power*2;
			
		}
		System.out.println(ans);
	}

}
