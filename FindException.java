class FindException
{
	public void div(int a,int b)
	{
		int [] x={12,22,33,44,55};
		
		try
		{
			try
			{
				for (int i=0;i<=5;i++)
					System.out.println("value = "+x[i]);
			}
			catch(ArrayIndexOutOfBoundsException arr)
			{
				System.out.println("Array index exceeded.");
			}
			int c=a/b;
			System.out.println("Division = "+c);			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("You cannot divide a number by 0");
		}		
		System.out.println("Thank you..");
	}

	public static void main(String[] a)
	{
		FindException fe=new FindException();
		fe.div(10,0);
	}
}