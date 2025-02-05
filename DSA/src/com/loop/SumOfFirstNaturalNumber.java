package com.loop;

import java.util.Scanner;

public class SumOfFirstNaturalNumber
{
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a positive integer N: ");
	        int N = scanner.nextInt();
	        
	        int sum = 0;
	        for (int i = 1; i <= N; i++) {
	            sum += i;
	        }
	        
	        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);
	        scanner.close();
	    
		
		
	}

}
