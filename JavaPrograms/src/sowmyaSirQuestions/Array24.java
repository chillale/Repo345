package sowmyaSirQuestions;
//Read only even indexed elements from an array
public class Array24 {
	public static void main(String[] args) {
		int a[]= {3,4,6,9,8,22};
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				System.out.print(a[i]+ " ");
			}
		}
	}

}
