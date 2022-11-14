package stringPrograms1;

import java.util.LinkedHashSet;

public class StringSentence1 {
	public static void main(String[] args) {
		String s = "khatam ta ta bye bye";
		String[] str=s.split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++) {
			linkedHashSet.add(str[i]);
		}
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]+ " "+i);
		}
	}

}
