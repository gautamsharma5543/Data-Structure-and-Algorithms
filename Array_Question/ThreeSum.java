package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	//cannot use duplicate triplet we cant pick elemrnt at twice it cant be repetative
	public List<List<Integer>> threeSum(int[] nums)  {
		
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>(); 
		
		for(int i=0;i<nums.length-2;i++) {
			
			if(i>0 && nums[i]==nums[i-1]) continue;
			int left =i+1;
			int right =nums.length-1;
			
			while(left<right) {
				int sum=nums[i]+nums[left]+nums[right];	
				if(sum==0) {
					list.add(Arrays.asList(nums[i],nums[left],nums[right]));
					while(left<right && nums[left]==nums[left+1]) left++;
					while(left<right && nums[right]==nums[right-1]) right--;
					left++;
					right--;
				}
				else if(sum>0) {
					right--;
				}
				else {
					left++;
				}
			}
		}
		
		
		return list;
		
	
}
	public static void main(String[] args) {
		ThreeSum th=new ThreeSum();
		int[] arr= {1,2,3,4,5,6,-6,0,0,-1,-5};
		System.out.println(th.threeSum(arr));
		
	}

}