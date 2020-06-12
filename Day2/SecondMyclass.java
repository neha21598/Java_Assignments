/*********************************************************************
2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
**********************************************************************/

public class SecondMyclass
{
	int num=5;
	SecondMyclass()
	{
	System.out.println("Inside Default Constructor");
	}
	SecondMyclass(int k)
	{
	num=k;
	System.out.println("Inside Parameterized Constructor");
	}
	SecondMyclass(int m1,int m2)
	{
	System.out.println("Inside Parameterized Constructor with 2 arguments");
	}

	public static void main(String[] args) 
	{
		SecondMyclass m1=new SecondMyclass();
		SecondMyclass m2=new SecondMyclass(200);
		new SecondMyclass(100,200);	
		
	}

}
/* OUTPUT
Inside Default Constructor
Inside Parameterized Constructor
Inside Parameterized Constructor with 2 arguments
*/