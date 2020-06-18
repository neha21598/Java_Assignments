/* 9)	Define a class “Shape” with “draw()” function .
 *  Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. 
 *  from “Shape” and override “draw()” function. Define a class “ShapeDemo” 
 *  in which  write  main()  function. In the main function create a reference to
 *   Shape class referring to any of the sub class. Using this reference, call “draw()”
 *    and check the result.
 _________________________________________________________________________________________*/
class Shape
{
	 void draw()
	 {
		 
	 }
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("In a circle");
	}
}
class Polygon extends Shape
{
	void draw()
	{
		System.out.println("In a Polygon");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("In a Rectangle");
	}
}

public class Nine
{

	public static void perform(Shape ref)
	{
		ref.draw();
	}
	public static void main(String[] args) 
	{
		perform(new Circle());
		perform(new Polygon());
		perform(new Rectangle());
	}

}

/* OUTPUT
In a circle
In a Polygon
In a Rectangle

*/