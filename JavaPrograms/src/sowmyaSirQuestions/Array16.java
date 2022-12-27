package sowmyaSirQuestions;
//find out the min value from second half of given int array
public class Array16 {
	public static void main(String[] args) {
		int a[]={999,47,23,79,1919,3};
		int min=a[a.length/2];
		for(int i=0;i<a.length;i++) {
			 
			if(i>a.length/2&&a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value from second half of given array"+min);
	}

}
