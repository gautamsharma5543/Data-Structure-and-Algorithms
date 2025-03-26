

package Basic;

public class NextPalindrome {
	
	public static boolean isPalindrome(int num) {
		int temp=num;
		int rem;
		int newnum=0;
		
		while(num!=0) {
			
			rem=num%10;
			newnum=(newnum*10)+rem;
			num/=10;
		}
	return newnum==temp;	
	}
	
	public static int next(int num) {
		int nextnum=num+1;
		while(!isPalindrome(nextnum)) {
			nextnum++;
		}
		return nextnum;
		
	}
	public static void main(String[] args) {
		int num=121;
		int result=next(num);
		System.out.println(result);
	}

}
