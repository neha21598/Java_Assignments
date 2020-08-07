/*2) create a multi-threaded application by using  "implements runnable"
 *  method.create 2 threads. they should display characters from A to J.
****************************************************************** */

public class TwoDispchar implements Runnable
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
		TwoDispchar ob = new TwoDispchar(); 
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		
		t1.start();
		t2.start();

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
