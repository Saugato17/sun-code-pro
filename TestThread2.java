public class TestThread2 implements Runnable
{
	String thName;
	Thread th;
	TestThread2(String nm)
	{
		th=new Thread(this, nm);
		th.start();
	}
	
	public void run()
	{
		try
		{
			for (int i=0;i<10;i++)
			{
				System.out.println(th.getName()+" -> "+i);
				System.out.println();
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
		TestThread2 t1=new TestThread2("DemoThread - 1 ");
		TestThread2 t2=new TestThread2("DemoThread - 2 ");
		TestThread2 t3=new TestThread2("DemoThread - 3 ");

		try{	
			t1.th.join();
			System.out.println("Demo Thread 1 Joined");
			
			t2.th.join();
			System.out.println("Demo Thread 2 Joined");
	
			t3.th.join();
			System.out.println("Demo Thread 3 Joined");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Thread Interuptted");
		}
	}
}