package examPrograms;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatingCharactersInString {
	public static void main(String[] args) {
		String s="Automationusingseleniumwebdriver";
		HashMap<Character, Integer> hash = new HashMap();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(hash.containsKey(ch)) {
				hash.put(ch, hash.get(ch)+1);
			}else {
				hash.put(ch, 1);
			}
		}
//		System.out.println(hash);
//		System.out.println(hash.keySet());
//	int count=0;
//		char[] ch1=new char[count];
//		String s1="";
		for(Character c:hash.keySet()) {
			System.out.println(c+" "+hash.get(c));
		}
		
	}

}
