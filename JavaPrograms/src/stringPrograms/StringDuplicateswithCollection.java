package stringPrograms;

import java.util.LinkedHashSet;

public class StringDuplicateswithCollection {
	public static void main(String[] args) {

		String s = "aabbddccaaddbbccddbaa";
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		// this step is to remove duplicates
		for (int i = 0; i < s.length(); i++) {
			linkedHashSet.add(s.charAt(i));

		}
		System.out.println(linkedHashSet);

		// this step is to compare collection with string
		for (Object setofuniqueCharacters : linkedHashSet) {
			for (int i = 0; i < s.length(); i++) {
				if (setofuniqueCharacters.equals(s.charAt(i))) {
					System.out.print(s.charAt(i));
				}
			}
			System.out.println();
		}

	}

}
