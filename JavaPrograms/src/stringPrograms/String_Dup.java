package stringPrograms;

import java.util.LinkedHashSet;

public class String_Dup {
	public static void main(String[] args) {
		String s= "welcome to india welcome to tyss";
		String[] arr = s.split(" ");
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		for(int i=0;i<arr.length;i++) {
			 linkedHashSet.add(arr[i]);
		}
		for(String str:linkedHashSet) {
			int count=0;
			for(int i=0;i<arr.length;i++) {
				if(str.equals(arr[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(str+ " "+count);
			}
		}
	}

}
