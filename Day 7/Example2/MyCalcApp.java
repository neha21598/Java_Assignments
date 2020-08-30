package trial;

import java.util.*;

public class MyCalcApp 
{

	public static void main(String[] args)  
	{
		Calculator c1=new Calculator();
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		
		int c=sc.nextInt();
		
		try
		{
		int result=c1.caldouble(c);
		System.out.println("Result is:" + result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

/***************************************
OUTPUTT:
Enter a number
-2
trial.MyArithException: Negative not allowed
	at trial.Calculator.caldouble(Calculator.java:14)
	at trial.MyCalcApp.main(MyCalcApp.java:19)
*/