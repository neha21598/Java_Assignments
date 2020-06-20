/* 5) create abstract class Shape. declare "draw()" function as abstract. From this class
define "Triangle","Polygon" and "Circle" .create an array of Shape having 3 elements.
store child objects into this array . and call their draw function.
_______________________________________________________________________________________________*/

abstract class Shape
{
	abstract void draw();
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("In Triangle draw method");
	}
}

class Polygon extends Shape
{
	void draw()
	{
		System.out.println("In polygon draw method");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("In Circle draw method");
	}
}

public class Five 
{

	public static void main(String[] args) 
	{
		Shape arr[]= {new Triangle(),new Polygon(),new Circle()};
		arr[0].draw();
	}

}
/*OUTPUT 
In Triangle draw method
*/