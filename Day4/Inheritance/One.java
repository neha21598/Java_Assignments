/*1) Create a multi-level inheritance , instantiate the child class and observe constructor
 *  invocation.Also show, if needed how will u invoke parent class constructor from child class ?
 _______________________________________________________________________________________________*/

class parent
{
	parent()
	{
		System.out.println("Inside parent constructor");
	}
}
class child extends parent
{
	child()
	{
		System.out.println("Inside child constructor");
	}
}
class child2 extends child
{
	child2()
	{
		System.out.println("Inside child2 constructor");
	}
}

public class One 
{

	public static void main(String[] args) 
	{
		child2 c=new child2();
	
	}

}

/* OUTPUT
Inside parent constructor
Inside child constructor
Inside child2 constructor
*/
