class FindException2
{
	public void div(int a,int b)
	{
		int [] x={12,22,33,44,55};
		
		try
		{
			for (int i=0;i<=5;i++)
				System.out.println("value = "+x[i]);			
			int c=a/b;
			System.out.println("Division = "+c);			
		}
		catch(Throwable e)
		{
			System.out.println("Our system has encountered an error... Please check the values provided");
		}		
		System.out.println("Thank you..");
	}

	public static void main(String[] a)
	{
		FindException2 fe=new FindException2();
		fe.div(10,0);
	}
}