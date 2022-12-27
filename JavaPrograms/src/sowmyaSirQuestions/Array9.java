package sowmyaSirQuestions;
//find out the min value from all even indexed elements from given array
public class Array9 {
	public static void main(String[] args) {
		int a[]={57,47,239,79,1919,383};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(i%2==0&&a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("Minimum value from all even indexed elements in array"+min);
	}
	

}
