package String;

import java.util.HashSet;

public class LongestSubStringWithoutRepeating {

	public static int withoutRepeat(String name) {
		int maxlength=0;
		int left=0;
		HashSet<Character> set=new HashSet<>();
		for(int right=0;right<name.length();right++) {
			while(set.contains(name.charAt(right))) {
				set.remove(name.charAt(left));
				left++;
			}
			set.add(name.charAt(right));
			maxlength=Math.max(maxlength,right-left+1);
		}
		return maxlength;	
	}
	public static void main(String[] args) {
		System.out.println(withoutRepeat("gautam"));
	}
}
