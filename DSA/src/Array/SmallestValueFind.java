package Array;

import java.lang.foreign.SymbolLookup;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestValueFind 
{
	static  int[] findLargestAndSortest(int[] arr) {
		 Arrays.sort(arr);
		 int ans[]= {arr[0] , arr[arr.length-1]};
		
		return ans;
	}
	public static void main(String[] args) {
	
//		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the array of size: ");
//		int n= sc.nextInt();
//		int arr[]=new int[n];
//		System.out.println("Enter the element");
//		for(int i=0; i< arr.length; i++) {
//			arr[i]= sc.nextInt();
//		}
		int arr[]= {2,5,3,6,1,9,7};
		
		int ans[]=findLargestAndSortest(arr);
		System.out.println("smallest value is: " +ans[0]);
		System.out.println("LArgest value is: " +ans[1]);

	}
	
}
