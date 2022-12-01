package arrayPrograms;

import java.util.Arrays;

public class Charaa {
	public static void main(String[] args) {
		char ch[]= {'a','b','$','f','s','y','y'};
		int start=0;
		int end=ch.length-1;
		for(int i=0;i<ch.length;i++) {
		if((start<end)&&(start<=1&&end>=4)){
			
			char ch1=ch[start];
			ch[start]=ch[end];
			ch[end]=ch1;
			start++;
			end--;
		}
			
		}
		System.out.println(Arrays.toString(ch));
	}

}
