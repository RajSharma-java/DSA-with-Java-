package Array;

public class CheckArrayIsSort {

	boolean check = true;
	public boolean sortArray(int arr[]) {
		for(int i=1; i< arr.length;i++) {
			if(arr[i]< arr[i-1]) {
				// not sorted
				check = false;
			}
		}
	
		
		return check;
	} 
	public static void main(String[] args) {
		CheckArrayIsSort c1= new CheckArrayIsSort();
		int arr[]= {2,1,3,4};
		
		System.out.println(c1.sortArray(arr));
		
	}
}
