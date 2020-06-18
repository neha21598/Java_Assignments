
/* 2)	Create a class with static and non-static member variables.
 *  Define static and non-static member functions. Create instance of this class 
 *  and call both static and non-static member functions.
 ____________________________________________________________________________________*/

public class Two 
{
	//Member variables
	public int num1=10; //non static  
	public static int cnt=20; //static
	
	//Member functions
	void display()	//non static
	{
		System.out.println("Value of num1 is:" + num1);
	}
	
	static void show()
	{
		System.out.println("Value of cnt is:" + cnt);
	}
	
	public static void main(String[] args) 
	{
		Two t=new Two();
		t.display();
		Two.show();
	}

}
/* OUTPUT 
 * Value of num1 is:10
 * Value of cnt is:20
*/
