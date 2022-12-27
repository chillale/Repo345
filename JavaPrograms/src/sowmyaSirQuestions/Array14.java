package sowmyaSirQuestions;
//find out the sum of all elements from a second half from given array
public class Array14 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i>a.length/2) {
				sum+=a[i];
			}
		}
		System.out.println("sum of all elements from second half of array"+ sum);
	}

}
