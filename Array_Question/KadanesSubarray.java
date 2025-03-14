package Array;

public class KadanesSubarray {
	public static int subarray(int[] arr) {
		
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			 
				sum+=arr[i];	
				max=Math.max(max, sum);
			
			if(sum<0) {
				sum=0;
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {-1,-2,3,5,-5,7};
		int result= subarray(arr);
		System.out.println(result);
	}

}
