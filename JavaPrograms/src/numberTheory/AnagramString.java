package numberTheory;

import java.util.Arrays;
import java.util.Collections;

public class AnagramString {
	public static void main(String[] args) {
		String s="race";
		String s1="caree";
		if(s.length()==s1.length()) {
			char ch[]=s.toCharArray();
			char ch1[]=s1.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch);
			boolean status=Arrays.equals(ch, ch1);
			if(status==true) {
				System.out.println("Strings are anagram");
			}else {
				System.out.println("Strings are not anagram");
			}
			
		}
		else {
			System.out.println("We cannot perform anagram ");
		}
	}
}
