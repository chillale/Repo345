package arrayPrograms;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {1,2,44,8,54};
		int start=0;
		int end=a.length-1;
		 for(int i=0;i<a.length;i++) {
			 if(start<end) {
				 int temp=a[start];
				 a[start]=a[end];
				 a[end]=temp;
				 end--;
				 start++;
			 }
		 }
		 System.out.println(Arrays.toString(a));
	}

}
