package geeksforGeeks;

import java.util.Arrays;

public class RemovingDuplicateinArray {
	public static void main(String[] args) {
          int a[]= {1,2,3,2,3,1,4};
          int size = 0;
          int b[]=new int[size];
          for(int i=0;i<a.length;i++) {
        	  for(int j=0;j<a.length;j++) {
        		  if(a[j]==a[i]) {
        			  break;
        		  }
        		  else {
        			  b[j]=a[i];
        			  size++;
        		  }
        	  }
          }
          System.out.println(Arrays.toString(b));
	}

}
