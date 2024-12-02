package LinkedLists;

public class RecursionDescending {

	
	public static int fact(int n)
	{
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
		
	}
	
	public static int fib(int n) {
		
		if(n==1||n==0) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
	
	public static void printdesc(int n) {
		if(n==1) {
			System.out.print(n);
			return;
		}
		System.out.println(n);
		printdesc(n-1);
		
		
	}
	public static void main(String[] args) {
		printdesc(20);
	}
}
