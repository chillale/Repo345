package interviewQuestions;

import java.util.Scanner;

public class Array1 {
	public static int sum(int a[][],int sum) {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(a[i][j]+ " ");
				sum=a[i][j]+sum;
			}
			System.out.println();
		}
		return sum;
	}
	public static void main(String[] args) {
		int a[][]= {{2,2,2},{3,3,3},{3,3,3}};
		int sum=0;
		System.out.println(sum(a,sum));
		
	}
	
}


