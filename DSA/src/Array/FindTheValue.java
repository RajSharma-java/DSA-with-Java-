package Array;

public class FindTheValue 
{
 public static void main(String[] args) {
	FindTheValue v1= new FindTheValue();
	v1.SearchElement();
	
}
 	void SearchElement( ) {
 		int arr[]= {1,5,3};
 		int x=5;
 		int ans=-1;
 		for(int i=0; i<arr.length; i++) {
 			if(arr[i]==x) {
 				ans=i;
 			}
 			
 			
 		}
 		System.out.println("Search element on the index of:" + ans);
	
 	}
}
