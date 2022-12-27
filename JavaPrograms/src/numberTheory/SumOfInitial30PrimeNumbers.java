package numberTheory;

public class SumOfInitial30PrimeNumbers {
	public static void main(String[] args) {
		int sum=0;
		int primeCount=0;
		for(int i=1;i<=150;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2&&primeCount<30) {
				sum=sum+i;
				primeCount++;
				
			}
		}
		System.out.println("The sum of initial 30 prime Numbers are "+sum);
	}

}
