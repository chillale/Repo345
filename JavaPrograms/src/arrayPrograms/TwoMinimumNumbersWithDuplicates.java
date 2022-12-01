package arrayPrograms;

public class TwoMinimumNumbersWithDuplicates {
	public static void main(String[] args) {
		int a[]= {22,12,12,55,78,25};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
				if(a[i]<=fmin) {
					if(a[i]!=fmin) {
					smin=fmin;
					
					}
					fmin=a[i];
				}
				else if(smin>a[i] || fmin==smin){
					smin=a[i];
				}
		}
		System.out.println("Two minimum numbers are :"+fmin+" "+smin);

	}

}
