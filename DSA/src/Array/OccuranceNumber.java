package Array;

public class OccuranceNumber 
{
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4,2,5,6,7,2,2};
		int x=2;
		int count =0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		System.out.println("numbre occurance is most "+x  +"--->"+count+"times");
	}

}
