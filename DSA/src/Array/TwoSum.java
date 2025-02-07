package Array;

public class TwoSum {
	public static void main(String[] args) {
		
		int[] nums= {1,3,5,7,11,15,2};
		int target=9;
		for(int i =0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] + nums[j] == target) {
				
					int a[]= {i,j};
					 System.out.println("true");
	                    System.out.println("Indexes: " + i + ", " + j);
					return;
				}
			}
			
		}
		System.out.println("false");

	}
}
