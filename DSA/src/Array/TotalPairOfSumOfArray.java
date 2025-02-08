package Array;

public class TotalPairOfSumOfArray {
	static int pairFind(int [] arr){
		int ans = 0;
		
		int x = 7;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == x) {
					ans++;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int arr[] = { 4, 6, 3, 5, 8, 2 };
		
		int ans=pairFind(arr);
		System.out.println(ans);
		
	}
}
