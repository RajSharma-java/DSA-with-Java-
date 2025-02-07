package loop;

import java.util.Scanner;

public class GCD 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give me firstNumber :");
		int num1= sc.nextInt();
		System.out.println("Give me SecondNumber :");
		int num2= sc.nextInt();
		int gcd=0;
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) {
				gcd=i;
			}
		}
				System.out.println("GCD is " + gcd);
	}
}
