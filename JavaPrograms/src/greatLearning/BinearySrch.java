package greatLearning;

import java.util.Arrays;

public class BinearySrch {
	public static int binary(int a[],int key) {
		int first=0;
		int last=a.length-1;
		int ky = 0;
		while(first<=last) {
			int mid=(first+last)/2;
			if(a[mid]<key) {
				first=mid-1;
			}else if(a[mid]==key) {
				ky=mid;
				break;
			}else {
				last=mid+1;
			}
		}
		if(first>last) {
			return -1;
		}
		return ky;
	}
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8};
		int key=5;
		Arrays.sort(a);
		int x=binary(a,key);
		if(x>0) {
			System.out.println("element is found at"+x);
		}else {
			System.out.println("element not found");
		}
	}
	

}
