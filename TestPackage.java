import math.arithmatic.*;
import math.logics.*;

public class TestPackage
{
	public static void main(String[] ar)
	{
		Add a=new Add();
		Diff d=new Diff();
		Prime p=new Prime();

		int x=a.sum(25,80);
		int y=d.difference(40,10);
		boolean check = p.isPrime(13);

		System.out.println(x+", "+y);
		if(check==true)
			System.out.println("Prime");
		else
			System.out.println("Not prime");
	}
}