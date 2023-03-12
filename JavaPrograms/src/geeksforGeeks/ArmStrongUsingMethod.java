package geeksforGeeks;

import java.util.Scanner;

public class ArmStrongUsingMethod {
	public static boolean armStrong(int num,int power,int count, int sum) {
		int copy=num;
		while(num>0) {
			power=1;
			int digit=num%10;
		for(int i=1;i<=count;i++) {
			power*=digit;
		}
		sum+=power;
		num/=10;
		}
		if(copy==sum) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the size of the array");
         
         int range = sc.nextInt();
         int a[]=new int[range];
         for(int i=0;i<range;i++) {
        	 a[i]=sc.nextInt(); 
         }
         for(int i=0;i<range;i++) {
        	 int num=a[i];
        	 int sum=0,count=0,power=1,digit;
        	 while(a[i]>0) {
        		 digit=a[i]%10;
        		 count++;
        		 a[i]/=10;
        	 }
        	 if(armStrong(num,power,count,sum)) {
        		 System.out.println(num+"is armstrong number");
        	 }else {
        		 System.out.println(num+ " is not armstrong number");
        	 }
         }
	}

}
