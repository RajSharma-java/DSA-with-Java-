package NumberSystem;

public class DecimalToBinary {
public static void main(String[] args) {
	int n=11;
	int ans=0;
	int pw=1;
	while(n>0) {
		int parity= n%2;
		ans+=(parity*pw);
		pw*=10;
		n=n/2;
		
	}
	System.out.println(ans);
}
	
}
