/*8)	Define a parent class with one function.
 *  Define child class with the function having same name as of parent class function,
 *   but having different argument.
Create an instance of child class and call the functions.
 Make sure u have followed the concept of “function overloading “ in inheritance.
 _____________________________________________________________________________________________*/

class parent7
{
	int num1=10;
	void disp()
	{
		System.out.println(num1);
	}
}
class child7 extends parent7
{
	int num2;
	void disp(int num)
	{
		num2=num;
		System.out.println(num2);
	}
}

public class Eight 
{

	public static void main(String[] args) 
	{
		child7 c=new child7();
		c.disp(20);
	
	}

}

/* OUTPUT
20
*/