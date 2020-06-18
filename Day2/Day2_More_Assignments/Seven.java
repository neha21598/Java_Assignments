//7)	Define a parent and a child class . Now explain function overriding with Example.
class parent1
{
	int num1=10;
	void disp()
	{
		System.out.println(num1);
	}
}
class child3 extends parent1
{
	int num2=20;
	void disp()
	{
		System.out.println(num2);
	}
}
public class Seven 
{

	public static void main(String[] args) 
	{
		child3 c=new child3();
		c.disp();
	}

}

/* Output
20*/