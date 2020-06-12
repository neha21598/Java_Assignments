/* 1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class. */
//_______________________________________________________________________________________
public class Shape
{
	private int height,width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public static void main(String[] args) 
	{
		Shape s1=new Shape();
		s1.setHeight(100);
		s1.setWidth(200);
		
		System.out.println("Height="+ s1.getHeight());
		System.out.println("width="+s1.getWidth());
	}

}
/*__________________________________________________
OUTPUT
Height=100
width=200
_____________________________________________________*/