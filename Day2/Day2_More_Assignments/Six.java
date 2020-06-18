//6)	Show the example of hierarchical inheritance with constructor invocation.

class base1
{
	int num1=100;
	base1()
	{
		System.out.println("In base1 constructor");
	}
	void disp1()
	{
		System.out.println(num1);
	}
}
class child1 extends base1
{

	int num2=200;
	child1()
	{
		System.out.println("In child1 constructor");
	}
	 void disp2()
	{
		System.out.println(num2);
	}
	
}
class child2 extends base1
{

	int num3=300;
	child2()
	{
		System.out.println("In child2 constructor");
	}
	void disp3()
	{
		System.out.println(num3);
	}
	
}

public class Six 
{

	public static void main(String[] args) 
	{
		child2 c2=new child2();
		c2.disp1();
		c2.disp2();
		c2.disp3();
	}

}
