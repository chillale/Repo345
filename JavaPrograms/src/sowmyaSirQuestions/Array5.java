package sowmyaSirQuestions;
//finding the second maximum from an given int array
public class Array5 {
	public static void main(String[] args) {
		int a[]= {8,47,23,79,1919,383};
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
		System.out.println(fmax);
	}

}
