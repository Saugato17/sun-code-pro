package math.logics;

public class Prime
{
	public boolean isPrime(int a)
	{
		for (int i=2;i<a;i++)
		{
			if (a%i==0)
				return (false);
		}

		return (true);
	}
}