package arrayPrograms;

import java.util.Arrays;

public class Ones {
	public static void main(String[] args) {
		int a[]= {0,1,0,1,1,0};
		int start=0;
		int end=a.length-1;
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				b[start]=a[i];
				start++;
			}
			else {
				b[end]=a[i];
				end--;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
