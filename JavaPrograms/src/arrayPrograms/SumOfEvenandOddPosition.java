package arrayPrograms;

public class SumOfEvenandOddPosition {
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		int sumOfEven =0;
		int sumOfOdd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sumOfEven=sumOfEven+a[i];
				
			}
			else {
				sumOfOdd=sumOfOdd+a[i];
			}
		}
		System.out.println("sum of even numbers"+sumOfEven);
		System.out.println("sum of Odd numbers"+sumOfOdd);
	}

}
