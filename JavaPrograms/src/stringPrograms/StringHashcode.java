package stringPrograms;

public class StringHashcode {
	String name;
	int age;
	public StringHashcode(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	

	@Override
	public String toString() {
		return "name: "+name+"\n age:"+age;
	}



	public static void main(String[] args) {
		StringHashcode stringHashcode = new StringHashcode("pradeep", 21);
		System.out.println(stringHashcode.toString());
		
	}

}
