/*5) create 2 threads one thread will display 1 to 50
second thread will display 50 to 1 both the threads should start 
simultaneously.(use implements method)*/


class Mytthread1 implements Runnable
{
	public void run()
    {
    	for(int i=1;i<=50;i++)
    	{
    		System.out.println(i);
    		try
    		{
    			Thread.sleep(300);
    		}
    		catch(InterruptedException ie)
    		{
    			
    		}
    	}
    	
    }
}

class Mytthread2 implements Runnable
{
	public void run()
	{
		for(int i=50;i>=1;i--)
    	{
    		System.out.println(i);
    		try
    		{
    			Thread.sleep(300);
    		}
    		catch(InterruptedException ie)
    		{
    			
    		}
    	}
	}
}
public class FiveReverse 
{
   
   public static void main(String []args)
   {
   	Mytthread1 m1=new Mytthread1();
   	Mytthread2 m=new Mytthread2();
   	Thread t1=new Thread(m1);
   	Thread t2=new Thread(m);
   	t1.start();
   	t2.start();
   }
}
/*OUTPUT
1
50
49
2
3
48
47
4
46
5
6
45
7
44
43
8
9
42
10
41
11
40
12
39
13
38
14
37
15
36
16
35
17
34
33
18
32
19
31
20
21
30
22
29
23
28
24
27
25
26
25
26
24
27
23
28
22
29
21
30
20
31
19
32
18
33
17
34
16
35
15
36
14
37
13
38
12
39
11
40
10
41
9
42
8
43
7
44
6
45
5
46
4
47
48
3
2
49
50
1

*/
