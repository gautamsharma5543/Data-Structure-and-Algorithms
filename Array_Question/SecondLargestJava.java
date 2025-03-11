package Array;

import java.util.Arrays;

public class SecondLargestJava {
	
	public static void secondlargest(int[] arr) {
		
		int n=arr.length;
		Arrays.sort(arr);
	
		for(int i=n-2;i>=0;i--) {
			if(arr[i]!=arr[n-1]) {
				System.out.println("second largest "+arr[i]);
				return;
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		
		int arr[] = {20,30,40,10,50};
		secondlargest(arr);
		
		
	}
}
