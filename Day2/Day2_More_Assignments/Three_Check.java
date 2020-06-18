/* 3)	Define a class “Check” in which declare member variables using  different accessibility 
 modifiers i.e.  <default>, private ,public and protected.   Define a function “disp” 
 which should be public.  Define a class “CheckDemo” in which you will write “main()” function.
 Create an instance of  the class “Check” and  show how many  variables can be accessed
 directly and how many indirectly.
_____________________________________________________________________________________________ */
class Check
{
	int a;
	private int b;
	public int c;
	protected int d;
	
}

public class Three_Check 
{
	
	public static void main(String[] args) 
	{
	Check c=new Check();
	System.out.println(c.a);
	//System.out.println(c.b);//private so it is not accessible outside the class
	System.out.println(c.c);
	System.out.println(c.d);
	}

}
