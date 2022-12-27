package interfaceprograms;

import java.util.Arrays;

public class convertion {

	public static void main(String[] args) {
		int a=123456;
		Integer n1=Integer.valueOf(a);
		String str=n1.toString();
		char[] ch=str.toCharArray();
		int b=0;
		if(ch.length%2==0) {
			b=ch.length/2;
			
			
		}
		else {
			b=ch.length/2+1;
		}
		for(int i=0,j=b;i<ch.length;i++,j++) {
			if(i<ch.length/2) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
			}
		}
		System.out.println(Arrays.toString(ch));
	}

}
