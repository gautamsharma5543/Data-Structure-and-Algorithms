package String;

import java.util.Arrays;

public class AnagramCheck {
	
	public static boolean isanagram(String s,String t) {
		
		if(s.length()!=t.length()) return false; 
		
		char[] ss= s.toCharArray();
		char[] tt=t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(tt);
		
		return Arrays.equals(ss, tt);	
	}
	public static void main(String[] args) {
		String s="anagram";
		String t="margana";
		System.out.println(isanagram(s,t));
	}

}
