package interviewQuestions;

import java.util.Scanner;

//Move first half to second and second half to first?
//total digits are even ex:- 123456 convert to 456123
public class MovingDigits {
	// Java program to print good numbers in a given range [L, R]
	
	 
	
	    // Function to check whether n is a good number and doesn't contain
	    // digit 'd'
	    static boolean isValid(int n, int d)
	    {
	        // Get last digit and initialize sum from right side
	        int digit = n%10;
	        int sum = digit;
	 
	        // If last digit is d, return
	        if (digit == d)
	        return false;
	 
	        // Traverse remaining digits
	        n /= 10;
	        while (n>0)
	        {
	            // Current digit
	            digit = n%10;
	     
	            // If digit is d or digit is less than or
	            // equal to sum of digits on right side
	            if (digit == d || digit <= sum)
	                return false;
	 
	            // Update sum and n
	                else
	                {
	                    sum += digit;
	                    n /= 10;
	                }
	        }
	    return true;
	    }
	     
	    // Print Good numbers in range [L, R]
	    static void printGoodNumber(int L, int R, int d)
	    {
	        // Traverse all numbers in given range
	        for(int i=L;i<=R;i++)
	        {
	            // If current numbers is good, print it
	            if(isValid(i, d))
	                System.out.print(i+" ");
	        }
	    }
	     
	    // Driver program
	    public static void main (String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the range");
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        int R=528;
	        for(int i=0;i<a.length;i++) {
	        	 printGoodNumber(a[i], R, n);
	        }
	         
	        // Print good numbers in [L, R]
	       
	    }
	}
		
	


