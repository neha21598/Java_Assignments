/*3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt 
-------------------------------------------------------------*/

public class Emp 
{
	private	static int cnt=10;
	public static int display()
	{	
	return cnt;
	}
	public static void main(String[] args)
	{
		System.out.println(Emp.display());
	}

}

/*output
10
*/