package numberTheory;

import java.util.Arrays;

public class ReverseFirstHalf {
	public static void main(String[] args) {
		int n = 123456;
		String str = Integer.toString(n);
		char ch[]=str.toCharArray();
		int b=0;
		if(ch.length%2==0) {
			b=ch.length/2-1;
		}
		else {
			 b=ch.length+1;
		}
		for(int i=0,j=b;i<str.length();i++,j--) {
			if(i<b) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
