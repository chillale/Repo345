package arrayPrograms;

public class SumOfArrayAverage {
	public static void main(String[] args) {
		int a[] = {4,5,22,12,65};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of the elements"+sum);
		float avg=sum/a.length;
		System.out.println(avg);
	}

}
