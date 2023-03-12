package geeksforGeeks;

import java.util.Arrays;
import java.util.List;

public class StreamAp {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(3,5,7,9);
		boolean isDivisibleByTwo = asList.stream().anyMatch(n -> n%2==0);
		if(isDivisibleByTwo) {
			System.out.println("Atleast one numbers is divisible by two");
		}
		else {
			System.out.println("Not a single number is divisble by two");
		}
		
//		boolean areDivisibleByTwo = asList.stream().allMatch(n -> n%2==0);
//		if(areDivisibleByTwo) {
//			System.out.println("All the numbers are divisible by two");
//		}
//		else {
//			System.out.println("All the numbers are not divisible by two");
//		}
	}

}
