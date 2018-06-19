import java.applet.*;
import java.awt.*;

/*
<applet code="AppletDemo" width=300 height=500>
</applet>
*/

public class AppletDemo extends Applet 
{
	String in,st,end;
	int r;
	public void init()
	{
		in="Inside init method";
		st="";
		end="";
		r=0;
		//this should always be set in init()
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
	}
	
	public void start()
	{
		st="starting the applet";
	}
	
	public void stop()
	{
		end="stopping the applet";
	}
	
	public void destroy()
	{
		System.out.println("Destroying the applet");
	}
	
	public void paint(Graphics g)
	{
		showStatus ("This is my first applet.");
		g.drawString(in, 20, r+=10);
		g.drawString(st, 20, r+=20);
		stop();
		g.drawString(end, 20, r+=20);
		start();
		g.drawString(st, 20, r+=20);
		stop();
		g.drawString(end, 20, r+=20);
		start();
		g.drawString(st, 20, r+=20);
	}
}
