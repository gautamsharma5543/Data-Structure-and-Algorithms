package Happy;

import java.util.HashSet;

public class HappyNumber {

	public static boolean divide(int n) {
		HashSet<Integer> used=new HashSet<>();
		while(n!=1) {
		int digit=0;
		while(n!=0) {
			int rem=n%10;
			digit+=Math.pow(rem,2);
			n=n/10;
		}
		if(used.contains(digit)) return false;
		used.add(digit);
		n=digit;
		}
		return true;
	}
	public static void main(String[] args) {
		
		boolean happy=divide(19);
		if(happy==true) 
		{
		System.out.println("wow its happy number");	
		}
		else {
			System.out.println("uff ya galat number");
		}
	}
}
