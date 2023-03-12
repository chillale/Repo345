package greatLearning;

import java.util.Arrays;

public class StringtoInteger {
	public static void main(String[] args) {
		String s="110a";
		int a[]=new int[s.length()];
		for(int i=0;i<a.length;i++) {
			if(i==a.length-1) {
				String temp1=s.substring(i, i+1);
				char ch=temp1.charAt(0);
			    a[i]=Character.getNumericValue(ch);
			}
			else {
				String temp=s.substring(i, i+1);
				a[i]=Integer.parseInt(temp);
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
