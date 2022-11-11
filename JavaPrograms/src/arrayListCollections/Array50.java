package arrayListCollections;

public class Array50
{
	public static void main(String[]args)
	{
	  Array50 s=new Array50();
	  int input[]= {5,6,3,5};
	  boolean result=s.bike(input);
	  System.out.println(result);
	}
	public boolean bike(int[] nums)
	{
		if (nums.length<=1 && nums[0]==nums[nums.length-1]) {
		return true;
		}
		else {
		return false;
		 }
		
	}
}
	
		
		