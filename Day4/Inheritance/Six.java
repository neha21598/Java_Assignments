/*6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.
_________________________________________________________________________________________*/
interface A
{
	void disp1();
}  
interface B extends A
{
	void disp2();
}
class C implements A,B
{
	public void disp1()
	{
		System.out.println("In disp1");
	}
	public void disp2()
	{
		System.out.println("In disp2");
	}
}
public class Six 
{

	public static void main(String[] args) 
	{
		 C c1=new C();
		 c1.disp1();
		 c1.disp2();
	}

}
/* OUTPUT
In disp1
In disp2
*/
