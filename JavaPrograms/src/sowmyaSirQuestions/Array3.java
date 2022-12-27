package sowmyaSirQuestions;
//finding the max element from the given int array
public class Array3 {
	public static void main(String[] args) {
		int a[]= {5,23,9,1,89,3,78};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
