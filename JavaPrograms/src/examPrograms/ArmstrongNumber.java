package examPrograms;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=1634,sum=0;
		int r,temp=num,c=0,power=1;
		while(temp>0) {
			r=temp%10;
			c++;
			temp=temp/10;
		}
		temp=num;
		while(temp>0) {
			r=temp%10;
			power=1;
			for(int i=1;i<=c;i++) {
				power=power*r;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println(num+" is armstrong");
		}
		else {
			System.out.println(num+ " is not armstrong");
		}
	}

}
