class FindException3
{
	public void div(int a,int b) throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		int [] x={12,22,33,44,55};
		int c=a/b;
		System.out.println("Division = "+c);			
		for (int i=0;i<=5;i++)
			System.out.println("value = "+x[i]);			
		System.out.println("Thank you..");
	}

	public static void main(String[] a)
	{
		FindException3 fe=new FindException3();
		try
		{
			fe.div(10,0);
		}
		catch(ArithmeticException e){
			System.out.println("cannot divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException e2){
			System.out.println("Array index exceeded");
		}
	}
}