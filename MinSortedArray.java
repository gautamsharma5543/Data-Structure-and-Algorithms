package Array;

public class MinSortedArray {
	
	public static int min(int[] nums)
	{
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			
			if(min>nums[i]) 
			{
			min=nums[i];	
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int arr[]= {2,1,3,4,5,9,7};
		System.out.println(min(arr));
	}
}
