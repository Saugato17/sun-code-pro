package AWTObjects;
// Demonstrate color.
import java.awt.*;
import java.applet.*;
/*
<applet code="ColorDemo" width=300 height=200>
</applet>
*/
public class ColorDemo extends Applet {
// draw lines
	public void paint(Graphics g) 
	{
		Color c1 = new Color(255, 100, 100);
		g.setColor(c1);
		g.drawLine(0, 0, 100, 100);
		g.drawLine(0, 100, 100, 0);
		g.fillRect(20, 20, 80, 100);
	}
}
