package Array;

public class MaximumElementOfArray
{
	public static void main(String[] args) {
		int maxValue=0;
		int arr[]= {1,4,6,4,6,10,12,4,5};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>maxValue) {
				maxValue=arr[i];
			}
		}
		System.out.println("maximum value is :"+ maxValue);
	}

}
