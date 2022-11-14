package stringPrograms;

import java.util.LinkedHashSet;

public class StringCollection {
	public static void main(String[] args) {
		String s = "Tester";
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			linkedHashSet.add(s.charAt(i));
		}
		for(Character ch:linkedHashSet) {
			for(int i=0;i<s.length();i++) {
				System.out.println(ch+ " "+s.indexOf(ch));
				break;
			}
		}
	}

}
