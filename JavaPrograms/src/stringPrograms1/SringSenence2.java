package stringPrograms1;

import java.util.LinkedHashSet;

public class SringSenence2 {
	public static void main(String[] args) {
		String s = "welcome to tyss welcome to india";
		String[] str=s.split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		for(int i=0;i<str.length;i++) {
			linkedHashSet.add(str[i]);
		}
		for(String str1:linkedHashSet) {
			for(int i=0;i<str.length;i++) {
				if(str1.equals(str[i])) {
					System.out.println(str1+ " "+i);
					break;
				}
			}
		}
	}

}
