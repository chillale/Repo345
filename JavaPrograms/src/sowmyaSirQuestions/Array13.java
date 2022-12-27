package sowmyaSirQuestions;
//find out the sum of all elements from a first half of the given int array
public class Array13 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i<a.length/2) {
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of all elements from first half of array"+sum);
	}

}
