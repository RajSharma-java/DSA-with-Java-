package Array;

public class SumOfArray 
{
	public static void main(String[] args) {
		int sum=0;
		int arr[] = {1,5,3};
		for(int i=0; i<=arr.length-1;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
	}

}
