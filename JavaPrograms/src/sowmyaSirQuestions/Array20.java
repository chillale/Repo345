package sowmyaSirQuestions;
//find out the avg value from a second half of given int array
public class Array20 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(i>=a.length/2) {
				sum+=a[i];
				count++;
			}
		}
		System.out.println("Average value from second half of given array"+(sum/count));
	}

}
