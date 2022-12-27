package sowmyaSirQuestions;
//finding the second minimum from the given int array
public class Array4 {
	public static void main(String[] args) {
		int a[]= {99,55,87,44,65,34};
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
		System.out.println(smin);
		
	}

}
