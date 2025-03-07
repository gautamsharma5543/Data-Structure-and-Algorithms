package String;

public class ReverseString {

	public static void main(String[] args) {
		
		String name="Hello";
		String reverse="";
		
		char[] chararr=name.toCharArray();
		
		for(int i=chararr.length-1;i>=0;i--) {
			reverse+=chararr[i];
		}
		System.out.println(reverse);	
	}
}
