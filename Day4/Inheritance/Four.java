/*4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.
________________________________________________________________________________________________*/

class Top1
{
	void disp1()
	{
		System.out.println("Inside top1 display");
	}
}
class Bottom1 extends Top1
{
	void disp1()
	{
		System.out.println("Inside Bottom1 display");
	}
}
class Bottom2 extends Top1
{
	void disp1()
	{
		System.out.println("Inside Bottom2 display");
	}
}
class Bottom3 extends Top1
{
	void disp1()
	{
		System.out.println("Inside Bottom3 display");
	}
}
public class Four 
{

	public static void main(String[] args) 
	{
		Top1 ref=new Bottom2();
		ref.disp1();
	}

}

/*OUTPUT 
Inside Bottom2 display
*/
