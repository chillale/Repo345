package stringPrograms1;

import java.util.LinkedHashSet;

public class SringSentence1 {
	public static void main(String[] args) {
		String s="welcome to tyss welcome to india";
		String[] str=s.split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++) {
			linkedHashSet.add(str[i]);
		}
		
		for(String str1:linkedHashSet) {
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(str1.equals(str[i])) {
					count++;
					break;
				}
			}
			System.out.println(str1+ " "+count);
		}
	}

}
