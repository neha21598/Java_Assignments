/* create a hierarchy Course void start() void end() override "start()" and "end()" in 
 * all the child classes.	MsCit		Basic		Dbda	void orientation()
write a class "CourseDemo" with main and perform functins
perform function should be defined in such a way that it can accept any course and invoke 
"start()" and "end()" functions.	also make sure if "Dbda" is passed , its "orientation()"
 method also should be called.
____________________________________________________________________________*/

class Course
{
	void start() {}
	void end() {}
}
class MsCit extends Course
{
	void start()
	{
		System.out.println("In MsCit start");
	}
	void end()
	{
		System.out.println("In MsCit end");
	}
}
class Basic extends Course
{
	void start()
	{
		System.out.println("In Basic start");
	}
	void end()
	{
		System.out.println("In Basic end");
	}
}
class Dbda extends Course
{
	void start()
	{
		System.out.println("In Dbda start");
	}
	void end()
	{
		System.out.println("In Dbda end");
	}
	void orientation()
	{
		System.out.println("In Dbda orientation");
	}
}

public class One 
{
	public static void perform(Course ref)
	{
		if(ref instanceof Dbda)
		{
			Dbda d=(Dbda)ref;
			d.orientation();
			
		}
		ref.start();
		ref.end();
	}

	public static void main(String[] args) 
	{
		perform(new MsCit());
		perform(new Basic());
		perform(new Dbda());
		
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