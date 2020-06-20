/* create a hierarchy Animal void makeSound() override "makeSound()" in all the child classes.
Dog		Cat		Tiger							void hunting()
write a class "AnimalDemo" with main and perform functions perform function should be defined
 in such a way that it can accept any animal and invoke "makeSound()" function.
also make sure if "Tiger" is passed , its "hunting()" method also should be called.
_____________________________________________________________________________________*/
class Animal
{
	void makeSound() {}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("In Dog makeSound");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("In Cat makeSound");
	}
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("In Tiger makeSound");
	}
	void hunting()
	{
		System.out.println("In Tiger Hunting");
	}
}

public class Two 
{
	public static void perform(Animal ref)
	{
		if(ref instanceof Tiger)
		{
			Tiger t=(Tiger)ref;
			t.hunting();
			
		}
		ref.makeSound();
	}

	public static void main(String[] args) 
	{
		perform(new Dog());
		perform(new Cat());
		perform(new Tiger());
		
	}

}

/* Output
In MsCit start
In MsCit end
In Basic start
In Basic end
In Dbda orientation
In Dbda start
In Dbda end
*/
