/*1) create a multi-threaded application by using  "extends Thread "
 *  method.create 2 threads. they should display characters from A to J.
****************************************************************** */

public class OneDispchar extends Thread
{

	public void run()
	{
		char i;
		for(i=65;i<75;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) 
	{
		
		OneDispchar o = new OneDispchar();
		OneDispchar o1 = new OneDispchar();
		
		o.start();
		o1.start();

	}

}
/*OUTPUT:
 A
B
C
D
E
F
G
H
I
J
A
B
C
D
E
F
G
H
I
J
*/
