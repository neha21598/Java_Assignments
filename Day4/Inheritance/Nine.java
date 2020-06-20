/* 9) create interface "Game" , have an abstract method "play()". from this interface 
 implements classes like "Cricket" , "FootBall" and "Tennis".Now Define one more class 
public class Demo with main function.In this class have a static method "perform" which will 
take interface reference as parameter.inside "perform()" see to it that any child object passed
 ,its "play()" method should be invoked. Call "perform()" method from main function.
________________________________________________________________________________________________*/

interface Game
{
	void play();
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("Inside Cricket");
	}
}

class Football implements Game
{
	public void play()
	{
		System.out.println("Inside Football");
	}
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("Inside Tennis");
	}
}
public class Nine 
{
	public static void perform(Game ref)
	{
		ref.play();
	}
	public static void main(String[] args) 
	{
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());

	}

}
/* OUTPUT
Inside Cricket
Inside Football
Inside Tennis
*/