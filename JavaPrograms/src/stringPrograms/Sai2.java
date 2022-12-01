package stringPrograms;

public class Sai2 {
	public static void main(String[] args) {
		String s="sai";
		String s1="sai";
		String s2=new String("sai");
		String s3=new String("sai");
		
		System.out.println(s3.equals(s2));
		s2=s3;
		System.out.println(s2==s3);
		System.out.println(s3==s2);
	}

}
