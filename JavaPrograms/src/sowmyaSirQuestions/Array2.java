package sowmyaSirQuestions;

public class Array2 {
	public static void main(String[] args) {
		int a[]= {4,6,2,39,9};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
