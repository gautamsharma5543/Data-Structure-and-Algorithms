package Array;

public class SearchSortedArray {

	public int search(int[] nums,int target) {
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
		}
		return -1;
		
	}
	
//		public int binary(int[] nums,int target) {
//		
//		int left=0;
//		int right=nums.length-1;
//		
//		while(left<=right) {
//			int mid =left + (right - left) / 2;
//			if(nums[mid]==target) {
//				return mid;
//			}
//			if(nums[left]<=nums[mid])
//			{
//				if(nums[left]<=target && target < nums[mid]) {
//					right=mid-1;
//					}	else {
//						left=mid+1;
//					}
//			}
//			else {
//				if(nums[mid] < target && target <= nums[right]) {
//					left=mid+1;
//				}else {
//					right =mid-1;
//				}
//			}
//		}
//		return -1;
//	}
	
	
	
	    public int binary(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2; // Prevents overflow
	            
	            if (nums[mid] == target) {
	                return mid; // Found target, return index
	            }

	            // Check if left half is sorted
	            if (nums[left] <= nums[mid]) {
	                // Target lies within the sorted left half
	                if (nums[left] <= target && target < nums[mid]) {
	                    right = mid - 1;
	                } else { 
	                    left = mid + 1;
	                }
	            } 
	            // Otherwise, right half must be sorted
	            else {
	                // Target lies within the sorted right half
	                if (nums[mid] < target && target <= nums[right]) {
	                    left = mid + 1;
	                } else { 
	                    right = mid - 1;
	                }
	            }
	        }
	        
	        return -1; // Target not found
	    }
	

	
		
		
		
	public static void main(String[] args) {
		SearchSortedArray ssa=new SearchSortedArray();
		int nums[]= {7,6,5,4,3,2};
		int result=ssa.binary(nums, 4);
	System.out.println(result);
	}
}
