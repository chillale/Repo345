package greatLearning;

public class AfterAddingGetOneNumber {
	public static void main(String[] args) {
		int num=5688;
		while(num>9) {
			int sum=0;
			while(num!=0) {
				sum+=num%10;
				num/=10;
			}
			num=sum;
			System.out.println(sum);
		}
		System.out.println("Finel object is "+num);
	}

}
