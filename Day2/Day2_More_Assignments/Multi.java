/*5)	Show the example of multi-level inheritance with constructor invocation.
 _______________________________________________________________________________________*/

class parent
{
	int num1=100;
	parent()
	{
		System.out.println("In parent default constructor");
	}
	void disp1()
	{
		System.out.println(num1);
	}
}
class sub1 extends parent
{
	int num2=200;
	sub1()
	{
		System.out.println("In sub1 default constructor");
	}
	void disp2()
	{
		System.out.println(num2);
	}
}
class sub2 extends sub1
{
	int num3=300;
	sub2()
	{
		System.out.println("In sub2 default constructor");
	}
	void disp3()
	{
		System.out.println(num3);
	}
}
public class Multi
{

	public static void main(String[] args) 
	{
	sub2 s=new sub2();
	s.disp1();
	s.disp2();
	s.disp3();
	}

}

/* OUTPUT
In parent default constructor
In sub1 default constructor
In sub2 default constructor
100
200
300
*/