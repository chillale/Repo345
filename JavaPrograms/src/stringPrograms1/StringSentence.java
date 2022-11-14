package stringPrograms1;

import java.util.LinkedHashSet;

public class StringSentence {
	public static void main(String[] args) {
		String s = "khatam ta ta bye bye";
		String[] str=s.split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++) {
			linkedHashSet.add(str[i]);
		}
		
		for(String singleSet:linkedHashSet) {
			for(int i=0;i<str.length;i++) {
				if(singleSet.equals(str[i])) {
					System.out.println(singleSet+ " "+i);
					break;
				}
			}
		}
		
	}

}
