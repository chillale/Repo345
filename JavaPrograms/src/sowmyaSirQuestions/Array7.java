package sowmyaSirQuestions;
//find out the sum of all even indexed elements from an given int array
public class Array7 {
	public static void main(String[] args) {
		int a[]= {3,5,9,33,45,2};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of all even indexed Elements from int array"+ sum);
	}

}
