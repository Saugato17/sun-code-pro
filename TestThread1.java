public class TestThread1 implements Runnable
{
	String thName;
	TestThread2(String nm)
	{
		thName=nm;
	}
	
	public void run()
	{
		try
		{
			for (int i=0;i<10;i++)
			{
				System.out.println(thName+" -> "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException ie)
		{
			System.out.println("Thread Interuptted");
		}
	}

	public static void main(String[] ar)
	{
		TestThread1 t1=new TestThread1("DemoThread");
		Thread t=new Thread(t1);		
		t.start();		
	}
}