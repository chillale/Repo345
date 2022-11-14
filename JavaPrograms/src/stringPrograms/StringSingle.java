package stringPrograms;

import java.util.LinkedHashSet;

public class StringSingle {
	public static void main(String[] args) {
		String s ="welcome to tyss welcome to india";
		String[] str=s.split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<str.length;i++) {
			linkedHashSet.add(str[i]);
		}
		for(String str1:linkedHashSet)
		{
			int count=0;
			for(int i=0;i<str.length;i++) {
				if(str1.equals(str[i])) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(str1+ " "+count);
			}
		}
	}

}
