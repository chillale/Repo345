package sowmyaSirQuestions;
//finding the average value of given int array
public class Array6 {
	public static void main(String[] args) {
		int a[]= {8,3,22,45,89};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Average of the given int array"+(sum/a.length));
	}

}
