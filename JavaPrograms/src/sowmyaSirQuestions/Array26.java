package sowmyaSirQuestions;
//Read only odd indexed elements from an array
public class Array26 {
	public static void main(String[] args) {
		int a[]= {1,2,4,3,5,6};
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				System.out.println(a[i]+ " ");
			}
		}
	}

}
