package String;

import java.util.Scanner;

public class PalindromicSubstring {

	
	
	public int palindomesub(String s) {
		int count=0;
	
		for(int i=0;i<s.length();i++) {
		count +=countpalindrome(s,i,i); //for odd character
		count +=countpalindrome(s,i,i+1); //for even character
		}
		return count;
	}
	
	private	 int countpalindrome(String s,int left ,int right) {
		int count=0;
		while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
			 //left=0 
			count++;
			left--;
			right++;
		}
		return count;
	}
	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String s = scanner.nextLine();
		        scanner.close();
		       
		        PalindromicSubstring obj = new PalindromicSubstring();
		        int result = obj.palindomesub(s);
		        System.out.println("Total palindromic substrings: " + result);
		    }	
}
