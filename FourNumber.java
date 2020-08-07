/*4)create 2 threads. Write a program which displays number 1 to 10
  using class lock. 
  [hint:- use "implements Runnable" and synchronized block]
 */


public class FourNumber implements Runnable
{
	public void run()
	{
		display();
	}
	synchronized public static void display()
	{
		int i;
		for(i=1;i<11;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		FourNumber  f = new FourNumber();
		Thread t1 = new Thread(f);
		Thread t2 = new Thread(f);

		t1.start();
		t2.start();
	}
}


/*OUTPUT
 1
2
3
4
5
6
7
8
9
10
1
2
3
4
5
6
7
8
9
10

 */


