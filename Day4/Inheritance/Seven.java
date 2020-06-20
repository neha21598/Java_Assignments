/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some data.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
_____________________________________________________________________________________*/

class Parent7
{
	void disp1()
	{
		System.out.println("In display1 method");
	}
}
interface parent2
{
	void disp2();
}
class child7 extends Parent7 implements parent2
{
	public void disp2()
	{
		System.out.println("In disp2 method");
	}
}
public class Seven 
{

	public static void main(String[] args) 
	{
		child7 c=new child7();
		c.disp1();
		c.disp2();
	}

}

/* OUTPUT
In display1 method
In disp2 method
*/