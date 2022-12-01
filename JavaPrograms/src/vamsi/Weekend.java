package vamsi;


public class Weekend {
	public static void main(String[] args) {
		String[] str= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("Sunday")||str[i].equals("Saturday")) {
				System.out.println(str[i]+ " is Weekend");
				
			}
		}
	}

}
