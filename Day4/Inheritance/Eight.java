/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.
____________________________________________________________________________________*/

class base8
{
	int num;
	base8(int num)
	{
		this.num=num;
		System.out.println("Inside base paramterized constructor");
	}
}
class sub8 extends base8
{
	int num2,num3;
	sub8()
	{
		super(30);
		System.out.println("Inside sub Default construtor");
	}
	sub8(int num2)
	{
		super(10);
		this.num2=num2;
		System.out.println("Inside sub one parameter constructor");
	}
	sub8(int num2,int num3)
	{
		super(20);
		this.num2=num2;
		this.num3=num3;
		System.out.println("Inside sub ttwo parameter constructor");
	}
	
}
public class Eight 
{

	public static void main(String[] args) 
	{
	sub8 s=new sub8();
	}

}

/* OUTPUT
Inside base paramterized constructor
Inside sub Default construtor

*/