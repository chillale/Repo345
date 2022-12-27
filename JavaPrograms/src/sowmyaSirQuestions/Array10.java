package sowmyaSirQuestions;
//find out the max value from all odd indexed elements from given int array
public class Array10 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max&&i%2==1) {
				max=a[i];
			}
		}
		System.out.println("max value from all indexed elements from array"+ max);
	}

}
