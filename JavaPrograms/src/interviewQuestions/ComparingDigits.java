package interviewQuestions;


public class ComparingDigits  {
	public static void main(String[] args) {
		int a=123;
		String value = Integer.toString(a);
		int arr[]=new int[value.length()];
		for(int i=0;i<value.length();i++) {
		     String temp=value.substring(i, i+1);	
		     arr[i]=Integer.parseInt(temp);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1) {
				sum=sum+arr[i];
		}
		
		
	}
		if(sum==arr[arr.length-1]) {
			System.out.println("the sum of first two digits are equal to third digit");
		}
		else {
			System.out.println("the sum of first two digits are not equal to third digit");
		}


	}
}

