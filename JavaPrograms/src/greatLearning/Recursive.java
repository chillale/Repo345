package greatLearning;

public class Recursive {
	
	//Reversing the sentence using recursive method
	public String reverse(String str) {
		if(str==null||str.length()<=1)
			return str;
		else
			return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));
	}
	
	//Reversing one word using recursive method
//	public String reverse(String str) {
//		if(str.isEmpty())
//			return str;
//		else
//			return reverse(str.substring(1))+str.charAt(0);
//	}
	//to know the factorial of a number
//	public  int fact(int num) {
//		if(num==1)
//			return 1;
//		else
//			return num*fact(num-1);
//	}
	//to find the count of 8 in given number
//	public int count8(int n) {
//		
//		 if(n==0)
//		 return 0;
//		 if(n>0){
//		   if(n%10==8){
//		     if(n/10%10==8){
//		       return 2+count8(n/10);
//		     }
//		     return 1+count8(n/10);
//		   }
//		 }
//		 return count8(n/10);
//		}
	public static void main(String[] args) {
		Recursive r=new Recursive();
		//System.out.println(r.count8(818));
		//System.out.println(r.fact(5));
		System.out.println(r.reverse("The Java is awesome language"));
	}

}
