package examPrograms;

public class StringRotation {
	public static void main(String[] args) {
		String s="ABCD";
		String s1="CDAB";
		if(isRotation(s,s1)) {
			System.out.println("Rotation of String is present");
		}else {
			System.out.println("Rotation not found");
		}
		
	}
	public static boolean isRotation(String str,String str1) {
		return (str.length()==str1.length())&&((str+str).indexOf(str1)!=-1);
	}

}
