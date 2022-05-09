package constructor;

public class shirt {
	
	  public static String color;
	  public static char Size;
	 
	  
	  shirt(String newColor , char newSize)
	  {
		  color=newColor;
		  Size=newSize;
	  }
	
	public void putOn()
	{
		System.out.println("shirt is on");
	}
	
	public static void takeOff()
	{
		System.out.println("shirt is off");
	}
	
	public void setColor(String newColor)
	{
		color = newColor;
	}
	public void setSize(char newSize)
	{
		Size = newSize;
	}

}
