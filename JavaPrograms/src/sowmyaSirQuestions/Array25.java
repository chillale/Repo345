package sowmyaSirQuestions;

import java.util.Arrays;

//Read only even indexed elements from an array in reverse order
public class Array25 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b=0;
		if(a.length%2==0) {
			b=a.length-2;
		}
		else {
			b=a.length-1;
		}
		for(int i=0,j=b;i<a.length;i++,j--) {
			if(i<j&&i%2==0&&j%2==0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println("Read only even indexed Elements from an array in reverse order"+Arrays.toString(a));
	}

}
