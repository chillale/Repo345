package sowmyaSirQuestions;

import java.util.Arrays;

//Read second half of the elements in the reverse direction from an array
public class Array23 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b=0;
		if(a.length%2==0) {
			b=a.length/2;
		}
		else {
			b=a.length/2-1;
		}
		for(int i=b,j=a.length-1;i<a.length;i++,j--) {
			if(i<j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println("Arrays in reverse order from second half"+Arrays.toString(a));
	}

}
