package sowmyaSirQuestions;
//find out the avg value from all even indexed elements from an given int array
public class Array11 {
	public static void main(String[] args) {
		int a[]={8,47,23,79,1919,383};
		int count=0;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(i%2==0) {
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("Average value from all indexed elements from an array"+(sum/count));
	}

}
