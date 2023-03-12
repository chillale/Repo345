package geeksforGeeks;

public abstract class Shape {
	    String objectName = " ";
	    Shape(String name) { this.objectName = name; }
	 
	    
	    public void moveTo(int x, int y)
	    {
	        System.out.println(this.objectName + " "
	                           + "has been moved to"
	                           + " x = " + x + " and y = " + y);
	    }
	 
	    // Method 2
	    // Abstract methods which will be
	    // implemented by its subclass(es)
	    abstract public double area();
	    abstract public void draw();
	}
	 
	// Class 2
	// Helper class extending Class 1
	
	 
	// Class 3
	// Helper class extending Class 1
	
	 
	// Class 4
	// Main class
	


