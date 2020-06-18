/* 1)	Define 2 classes “First” and “Second” with member variables , member functions 
 * and constructors of  your choice. Now define a class “Two” in which define main function . 
 * In main function create various instances of First and Second  and call their individual
 *  member functions.
 *___________________________________________________________________________________________*/

class First
{
	public int a;

	public First()
	{
		System.out.println("In First default constructor");
	}
	public First(int a)
	{
		System.out.println("In first 1 param constructor");
	}
	public int getA() 
	{
		return a;
	}

	public void setA(int a) 
	{
		this.a = a;
	}
	
}
class Second
{
	int b;
	
	public Second()
	{
		System.out.println("In Second default constructor");
	}
	public int getB()
	{
		return b;
	}

	public void setB(int b) 
	{
		this.b = b;
	}

	}
public class One_Two
{

	public static void main(String[] args) 
	{
		First f=new First(); //First default constructor
		f.setA(10);	//setA method of class First
		System.out.println(f.getA()); //Call getA method through instance
		First f1=new First(1); //Parmeterized construcotr of class  First
		Second s=new Second();//Seocnd default constructor
		s.setB(20);//setB method of class Second
		System.out.println(s.getB()); //Call getB method through instance
	}

}

/* OUTPUT
In First default constructor
10
In first 1 param constructor
In Second default constructor
20
*/