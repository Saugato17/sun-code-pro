package AWTObjects;

import java.awt.*;
import java.applet.*;

/*
<applet code="UsingLabel" width=300 height=200>
</applet>
 */

public class UsingLabel extends Applet 
{
	Label l1, l2, l3;
	public void init()
	{
		l1=new Label ("M/S XYZ LIMITED", Label.CENTER);
		l2=new Label ("DATE - ",Label.RIGHT);
		l3=new Label ("This is a offer letter from XYZ Limited.");
		
		add(l1);
		add(l2);
		add(l3);
	}
}
