package Test;

public class VowelString {

	
	public static int vowel(String name) {
		int count=0;
		char[] n=name.toCharArray();
		
		for(int i=0;i<name.length();i++) {
			if(n[i] == 'a' ||n[i] =='e' ||n[i] =='o'||n[i]=='u'||n[i]=='i') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(vowel("corporation"));
	}
}
