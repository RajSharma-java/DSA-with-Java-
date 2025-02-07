package loop;

import java.util.Scanner;

public class PrintTable 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give the input");
		int n=sc.nextInt();
		
		for(int i=1; i<=10;i++) {
			int ans=n*i;
			System.out.println(n +"*"+ i+"="+ ans);
		}
	}
}
