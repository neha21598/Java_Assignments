/*1) initialize a single dimension array and sort it in ascending order.
 ________________________________________________________________________________*/

public class One 
{
	
	public static void main(String[] args) 
	{
	int temp=0;
	int []arr=new int[5];
	arr[0]=50;
	arr[1]=60;
	arr[2]=10;
	arr[3]=20;
	arr[4]=70;
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("Sorted Elements are:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	}
}


/* OUTPUT
 Sorted Elements are:
10
20
50
60
70
 */