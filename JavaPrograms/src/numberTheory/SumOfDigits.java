
package numberTheory;

public class SumOfDigits {
	public static void main(String[] args) {
		int n=67;
		
		while(n>9) {
			int sum=0;
			while(n>0) {
				sum=sum+n%10;
				n/=10;
			}
			n=sum;
			System.out.println(sum);
			
		}
		//System.out.println("The sum of digits are "+n);
	}

}
