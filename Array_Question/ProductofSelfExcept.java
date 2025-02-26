package Array;

public class ProductofSelfExcept {

	
	public int selfexcept(int[] nums) {
		int product=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i==j) continue;
				product*=nums[j];
			}
			
		}
		return product;
		
	}
	public static void main(String[] args) {
		ProductofSelfExcept pos =new ProductofSelfExcept();
		int nums[]= {1,2,3,4};
		int result=pos.selfexcept(nums);
	System.out.println(result);
	}
}
