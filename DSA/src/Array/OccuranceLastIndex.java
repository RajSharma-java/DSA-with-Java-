package Array;

public class OccuranceLastIndex 
{
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,2,2,1,5};
		int x=2;
		int lastIndex=-1;
		for(int i=1; i<arr.length;i++) {
			if(arr[i]==x) {
				lastIndex=i;
			}
		}
		System.out.println(lastIndex);
	}

}
