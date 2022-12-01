package vamsi;

import java.util.Arrays;

public class BubbleSort1 {
	public static void main(String[] args) {
		int a[]= {5,1,4,2,8};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]&&j<a.length-1) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
