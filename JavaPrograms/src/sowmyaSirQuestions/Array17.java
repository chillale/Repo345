package sowmyaSirQuestions;
//find out the max value from first half of given array
public class Array17 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(i<a.length/2&&a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value from first half of given array"+max);
	}

}
