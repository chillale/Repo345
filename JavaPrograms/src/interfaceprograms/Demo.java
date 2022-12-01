package interfaceprograms;

public abstract class Demo {
	abstract void m1();
	 public abstract void m2();

}
class Demo1 extends Demo{

	@Override
	void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2 method");
		
	}
	public static void main(String[] args) {
		Demo1 demo1=new Demo1();
		demo1.m1();
		demo1.m2();
	}
	
}
