package stringPrograms;

import java.util.LinkedHashSet;

public class StringforEach {
	public static void main(String[] args) {
		String s = "welcome to india welcome to tyss";
		String[] str=s.split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++) {
			linkedHashSet.add(str[i]);
		}
		System.out.println(linkedHashSet);
		for(String str1:linkedHashSet) {
			System.out.println(str1);
		}
	}

}
