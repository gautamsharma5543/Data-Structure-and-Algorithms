package Array;

public class ProductSubarray {

	public static int product(int[] arr) {
		
		int product=1;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			product*=arr[i];
			max=Math.max(max, product);
			if(product<0) {
				product=1;
			}
		}
		return max;
		
	}
	public static void main(String[] args) {
		int arr[]= {2,3,-2,4};
		int result = product(arr);
		System.out.println(result);
	}
}
