/* 4)	Show the example of single level inheritance with constructor invocation.
 _____________________________________________________________________________________*/
class base
{
	int num1=10;
	void disp1()
	{
		System.out.println(num1);
	}
}
class sub extends base
{
	int num2=20;
	void disp2()
	{
		System.out.println(num2);
	}
}

public class Single
{	
	public static void main(String[] args) 
	{
	
		sub s=new sub();
		s.disp1();
		s.disp2();
	}

}
/* OUTPUT
10
20

 */

