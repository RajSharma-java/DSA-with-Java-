package com.loop;

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int fact=1;
		
		//that is n digit number factorial
		Scanner sc= new Scanner(System.in);
		System.out.println("Give me input value");
		int n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		

		//find the fact of 5
//		for(int i=1; i<=5; i++) {
//		fact=fact*i;
//		}
//		System.out.println(fact);
		
		
	}

}
