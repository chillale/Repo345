package arrayPrograms;

public class TwoMaximumNumbersWithoutBubbleSort {
	public static void main(String[] args) {
		int a[]= {2,33,21,12,55};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax) {
				smax=a[i];
			}
		}
		System.out.println("The two Maximum numbers are "+fmax+ " "+smax);
	}

}
