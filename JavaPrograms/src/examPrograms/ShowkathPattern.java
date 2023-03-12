package examPrograms;

import java.util.Scanner;

public class ShowkathPattern {
	public static void main(String[] args) {
//		int space=3;
//		int star=1;
//		for(int row=1;row<=4;row++) {
//			for(int col=1;col<=space;col++) {
//				System.out.print(" ");
//			}
//			for(int k=1;k<=star;k++) {
//				System.out.print("* ");
//			}
//			space--;
//			star++;
//			System.out.println();
//		}
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter a sentence To Get Last Name Reverse:");
		String s= sc.nextLine();
		
		String rev="";
	   for(int i=s.length()-1;i>=0;i--) {
		   if(i>s.length()/2)
		   rev=rev+s.charAt(i);
		   else
			   rev=s.charAt(i)+rev;
	   }
	    System.out.println(rev);
	    
		
		//Box pattern
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				if((i+j>=6)&&(i<=j)) {
//					System.out.print("*");
//				}
//				else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
	}

}
