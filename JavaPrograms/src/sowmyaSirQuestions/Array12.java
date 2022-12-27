package sowmyaSirQuestions;
//find out the avg value from all odd indexed elements from given int array
public class Array12 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==1) {
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("Average value from all odd indexed elements"+(sum/count));
	}

}
