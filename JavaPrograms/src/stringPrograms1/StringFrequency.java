package stringPrograms1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class StringFrequency {
	public static void main(String[] args) {
		String s="aabbcddffee";
		char[] ch=s.toCharArray();
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			linkedHashSet.add(ch[i]);
		}
		int count=0;
		int cCount=0;
		for(char ch1:linkedHashSet) {
			for(int i=0;i<ch.length;i++) {
				if(ch1==ch[i]) {
					count++;
				   
				}
	         
			}
		}
		
		System.out.println(cCount);
		
	}

}
