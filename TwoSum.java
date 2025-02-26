package Array;

import java.util.Arrays;

public class TwoSum {
	
	public static int[] twosum(int[] nums ,int target) {
		//brute force solution  (n square)
		//we can do with hashmap
		for(int i=0;i<nums.length;i++) {
			
		for(int j=i+1;j<nums.length;j++) {
			if(target==nums[i]+nums[j]) {
				return new int[] {i,j};
			}
		}
		}
		
		return new int[] {};
	}
	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		int target=4;
		int result[]=twosum(a,target);
		System.out.println(Arrays.toString(result));
	}

}
