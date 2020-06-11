// 2]	using switch case   display whether character is vowel or not.

public class Vowel1
{
	public static void main(String args[])
	{
		char a='n';
		switch(a)
		{
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			System.out.println(a + " is a Vowel");
			break;
					
			default:
			System.out.println(a + " is a Consonant");
		
		}
	}
}

/* OUTPUT
n is a Consonant
*/