package Array;

public class SecondMaxElement
{
	static int maxElement(int[] arr) {
		int n= arr.length;
		int max= Integer.MIN_VALUE;
		for(int i=0;i<n ; i++) {
			if(arr[i]> max) {
				max=arr[i];
			}
		}
		
		return max;
		
	}
	static int secondMaxElement(int arr[]) {
		int max= maxElement(arr);
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==max) {
				arr[i]=Integer.MIN_VALUE;
			}
			
		}
		int secondmax= maxElement(arr);
		return secondmax;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {9,8,9,6,9,5,8};
		int ans=secondMaxElement(arr);
		System.out.println("Second max element is:" + ans);
	}

}
