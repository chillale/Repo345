package stringPrograms;

import java.util.LinkedHashSet;

public class RemovingDuplicates {
	public static void main(String[] args) {
		String s="indiaa";
		LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			linkedHashSet.add(s.charAt(i));
		}
		System.out.println(linkedHashSet);
		
		for(Character character:linkedHashSet) {
			System.out.println(character);
		}
	}

}
