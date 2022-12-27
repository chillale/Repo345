package sowmyaSirQuestions;
//sum of all given elements from an int array
public class Array1 {
	public static void main(String[] args) {
		int []a= {1,4,5,3,8};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
