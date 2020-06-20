/* 3) Go for Hierarchical inheritance, create instances of child class and observe constructor 
 * invocation.
 __________________________________________________________________________________________*/

class parent3
{
	parent3()
	{
		System.out.println("Inside parent3 constructor");
	}
}
class sub1 extends parent3
{
	 sub1()
	{
		System.out.println("Inside sub1 constructor");
	}
}
class sub2 extends parent3
{
	sub2()
	{
		System.out.println("Inside sub2 constructor");
	}
}
public class Three 
{

	public static void main(String[] args) 
	{
		sub2 s=new sub2();
	}

}

/*OUTPUT
Inside parent3 constructor
Inside sub2 constructor

*/