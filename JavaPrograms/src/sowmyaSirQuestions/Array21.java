package sowmyaSirQuestions;

import java.util.Arrays;

//Read all elements from an array in reverse order
public class Array21 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			if(i<j) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
