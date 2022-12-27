package sowmyaSirQuestions;
//find out the sum of all odd indexed elements from an given int array
public class Array8 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				sum=sum+a[i];
			}
		}
		System.out.println("sum of all odd indexed elements from an array"+ sum);
	}

}
