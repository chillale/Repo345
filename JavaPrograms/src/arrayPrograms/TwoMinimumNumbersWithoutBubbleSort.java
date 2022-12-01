package arrayPrograms;

public class TwoMinimumNumbersWithoutBubbleSort {
	public static void main(String[] args) {
		int a[]= {98,33,22,44,21};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin) {
				smin=a[i];
			}
		}
		System.out.println("The two minimum numbers are "+fmin+" "+smin);
	}

}
