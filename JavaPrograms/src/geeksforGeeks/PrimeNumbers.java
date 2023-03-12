package geeksforGeeks;

public class PrimeNumbers {
	static int primeCount=0;
	public static boolean isPrime(int x) {
		int count=0;
		for(int i=2;i<=x/2;i++) {
			if(x%i==0) {
				count++;
			}
		}
		if(count==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("The prime numbers are ");
		for(int i=2;i<=10;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}

}
