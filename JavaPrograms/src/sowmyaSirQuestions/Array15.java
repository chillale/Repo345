package sowmyaSirQuestions;
//find out the min value from a first half of given array
public class Array15 {
	public static void main(String[] args) {
		int a[]={87,47,23,79,1919,3};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(i<a.length/2&&a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value from first half of given array"+min);
	}

}
