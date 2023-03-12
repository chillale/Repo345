package interviewQuestions;

import java.util.HashSet;

public class CountingCharacters {
	public static void main(String[] args) {
		String s="aaabbbcccdd";
		char[] ch=s.toCharArray();
		HashSet hashSet = new HashSet();
		for(int i=0;i<s.length();i++) {
			hashSet.add(s.charAt(i));
		}
		for(Object single:hashSet) {
		for(int i=0;i<s.length();i++) {
			if(single.equals(s.charAt(i))) {
				System.out.println("the character is present in string"+s.charAt(i));
			}
		}
		}
	}

}
