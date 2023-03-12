package numberTheory;

public class AnagramProgram {
	public static void main(String[] args) {
		int num=123;
		String value = Integer.toString(num);
		int a[]=new int[value.length()];
	    for(int i=0;i<value.length();i++) {
	    	String temp=value.substring(i, i+1);
	    	a[i]=Integer.parseInt(temp);
	    }
	    int sum=0;
	    for(int i=0;i<a.length;i++) {
	    	if(i<a.length-1) {
	    		sum=sum+a[i];
	    	}
	    }
	    if(sum==a[a.length-1]) {
	    	System.out.println("The sum of first two digits are equal");
	    }else {
	    	System.out.println("The sum of first two digits are not equal");
	    }
	    
	}

}
