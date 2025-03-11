package Array;

public class secondLargest {

	public static void sLargest(int[] arr) {
		int first=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		
		for (int num :arr) {
			if(num > first) {
				second=first;
				first=num;
			}
			else if(second>num && num!=first) {
				second=num;
			}
		}
		System.out.println(second);
		System.out.println(first);
	}
	public static void main(String[] args) {
		int[] arr= {20,30,70,60,80};
		sLargest(arr);
	}
}
