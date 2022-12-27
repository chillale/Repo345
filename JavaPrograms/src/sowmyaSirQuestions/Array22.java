package sowmyaSirQuestions;

import java.util.Arrays;

//Read first half of an elements in reverse direction from an given array
public class Array22 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b=0;
		if(a.length%2==0) {
			b=a.length/2-1;
		}
		else {
			b=a.length/2;
		}
		for(int i=0,j=b;i<a.length;i++,j--) {
			if(i<j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println("Reverse Order of First Half"+ Arrays.toString(a));
	}

}
