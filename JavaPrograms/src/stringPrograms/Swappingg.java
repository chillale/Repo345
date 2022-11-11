package stringPrograms;

import java.util.Arrays;

public class Swappingg {
	public static void main(String[] args) {
		String s = "z%#d#b%#a";
		char[] ch=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		for(int i=0;i<ch.length;i++) {
			if(start<end&&ch[i]<='z') {
				char ch1 = ch[i];
				ch[start]=ch[end];
				ch[end]=ch1;
				end--;
				start++;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
