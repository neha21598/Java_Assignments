/*3) create 3 threads in such a way that while one thread is 
 executing,2 threads cannot interfere. they should display output 
 "Exec  0" to "Exec 5". */

public class ThreeInterfare implements Runnable
{
	synchronized public void run()
	{
		int i;
		for(i=0;i<6;i++)
		{
			System.out.println("Exec" + i);
		}
	}
	public static void main(String[] args) 
	{
		ThreeInterfare t = new ThreeInterfare();
		Thread t1 =new Thread(t);
		Thread t2 =new Thread(t);
		Thread t3 =new Thread(t);
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
/*OUTPUT
Exec0
Exec1
Exec2
Exec3
Exec4
Exec5
Exec0
Exec1
Exec2
Exec3
Exec4
Exec5
Exec0
Exec1
Exec2
Exec3
Exec4
Exec5

*/