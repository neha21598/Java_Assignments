package trial;

public class Item 
{
	String itemid;
	String name;
	int cost;

	public Item(String itemid,String name,int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("Itemid:"+ itemid);
		System.out.println("Name:"+ name);
		System.out.println("Cost:"+ cost);

	}

	
	public static void main(String[] args) 
	{
		Item i=new Item("One","AC",25000);
		i.display();
	}

}

/*
OP:
Itemid:One
Name:AC
Cost:25000
*/