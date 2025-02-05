package com.loop;

import java.util.Scanner;

public class CountTheNumber 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give me the input value :");
		int n= sc.nextInt();
		int count=0;
		
		while(n>0) {
			n= n/10;
			
			count++;
		}
		
		System.out.println("All number of  count :" + count);	
	}
}
