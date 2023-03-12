package linkedList;

import java.util.ArrayList;
import java.util.List;

public class ArraySum {
	
	public static void main(String[] args) {
		List<Integer> ar = new ArrayList();
		ar.add(10);ar.add(20);ar.add(30);ar.add(10);
		ar.add(10);ar.add(20);ar.add(30);ar.add(10);
		System.out.println(ar);
		Object[] a=ar.toArray();
	    int length = a.length;
	    int arr[]=new int[length];
	    for(int i=0;i<a.length;i++) {
	    	arr[i]=(int)a[i];
	    }
	    int count=0;
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			count++;
	    			break;
	    		}
	    	}
	    	
	    }
	    System.out.println(count);
	}

}
