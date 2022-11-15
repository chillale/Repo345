package arrayPrograms;

import java.util.Arrays;

public class CopyingArray {
	public static void main(String[] args) {
		int a[]= {3,44,2,12,56};
		int b[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(b));
	}

}
