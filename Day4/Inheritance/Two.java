/*2) create a class "Vehicle", define a method "public void start()" in it. From this class 
 * derive a class FourWheeler. How will u override "start()" method of parent class ?
 _______________________________________________________________________________________*/

class Vehicle
{
	public void start()
	{
		System.out.println("Inside parent start method");
	}
}
class FourWheeler extends Vehicle
{
	 public void start()
	{
		System.out.println("Inside FourWheeler start method");
	}
	
}
public class Two 
{

	public static void main(String[] args) 
	{
		FourWheeler f=new FourWheeler();
		f.start();
	}

}

/* OUTPUT
Inside FourWheeler start method 
*/