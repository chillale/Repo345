package arrayPrograms;

import java.util.Arrays;

public class SecondMaximumUsingBubbleSort {
	public static void main(String[] args) {
		int a[]= {44,22,78,99,12};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println("Second Maximum number of array is"+a[a.length-2]);
			break;
		}
	}

}
