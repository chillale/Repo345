package interviewQuestions;

import java.util.Arrays;

public class CloudTech {
	public static void main(String[] args) {
		int a[]= {2,3,5,7};
		int b[]= {3,5,7,2};
		if(areEqual(a , b)) {
			System.out.println("two arrays are equal");
		}
		else {
			System.out.println("Two arrays are not equal");
		}
	}
	public static boolean areEqual(int a[], int b[]) {
		if(a.length!=b.length) {
			return false;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<a.length;i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}

}
