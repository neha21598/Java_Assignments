/*1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.
*/

abstract class Game
{
	abstract void play();
}
class Football extends Game
{
	void play()
	{
		System.out.println("In football");
	}
}
class Cricket extends Game
{
	void play()
	{
		System.out.println("In Cricket");
	}
}
class Tennis extends Game
{
	void play()
	{
		System.out.println("In Tennis");
	}
}

public class GamesDemo 
{
	
	public static void main(String[] args) 
	{	
		Game arr[]= {new Football(),new Cricket(),new Tennis()};
		
		for(int i=0;i<3;i++)
		{
			if(arr[i] instanceof Cricket)
			{
			arr[i].play();
			}
		}
	}

}

/* Output:
In Cricket
*/