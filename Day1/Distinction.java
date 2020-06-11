//5)Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  

public class Distinction
{
	public static void main(String args[])
	{
		int mks=40;

		if(mks>=75)
		System.out.println("Distinction");

		else if(mks>=60 && mks<75)
		System.out.println("First Class");

		else if(mks>=40 && mks<60)
		System.out.println("Pass");

		else
		System.out.println("Fail");
	}
	
}

/*_______________________________________________
 OUTPUT
Pass */