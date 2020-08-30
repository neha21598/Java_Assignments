package trial;

public class Calculator 
{
	public int caldouble(int k) throws MyArithException
	{
			if(k==0)
			{
			throw new MyArithException("Zero not allowed");
			}
			
			else if(k<0)
			{
				throw new MyArithException("Negative not allowed");
			}
			else
			{
			return k*k;
			}
		}
}