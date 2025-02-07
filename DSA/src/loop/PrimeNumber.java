package loop;

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give the number ");
		int n= sc.nextInt();
		int temp=0;
		for(int i=2; i<=n-1; i++) {
			if(n%i==0) {
				temp++;
			}
			
		}
		if(temp>0) {
			System.out.println("Number is not prime");
		}
		else {
			System.out.println("Number is prime");
		}
	}

}
