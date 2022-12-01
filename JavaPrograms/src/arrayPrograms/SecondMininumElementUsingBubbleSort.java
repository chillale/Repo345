package arrayPrograms;

public class SecondMininumElementUsingBubbleSort {
	public static void main(String[] args) {
		int a[]= {22,1,44,68,87};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
          for(int i=0;i<a.length;i++) {
        	  System.out.println("Second Minimum element in array is "+a[a.length-2]);
        	  break;
          }
	}

}
