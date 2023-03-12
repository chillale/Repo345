package geeksforGeeks;

public class HashEquals {
      public static void main(String[] args) {
		String s="sravan";
		String s1="sravan";
		if(s.equals(s1)) {
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
		String s2=new String("rajesh");
		String s3=new String("rajeh");
		if(s2.equals(s3)) {
			
		}
	}
}
