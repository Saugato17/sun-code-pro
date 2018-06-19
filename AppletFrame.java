// Create a child frame window from within an applet.
package AWTObjects;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="AppletFrame" width=300 height=50>
</applet>
*/
// Create a subclass of Frame.
class SampleFrame extends Frame implements MouseListener, MouseMotionListener
{
	int x,y,cl;
	boolean mouse_status;
	private boolean mouse_pressed;
	SampleFrame(String title) 
	{
		super(title);
		cl=0;
		//adding mouse listeners
		addMouseListener(this);
		addMouseMotionListener(this);
		//create an object to handle window events
		MyWindowAdapter adapter = new MyWindowAdapter(this);
		//register it to receive those events
		addWindowListener(adapter);
	}
	public void paint(Graphics g) 
	{
		g.drawString("Mouse X Co-ordinate = "+x, 10, 50);
		g.drawString("Mouse Y Co-ordinate = "+y, 10, 75);
		g.drawString("Mouse clicked for "+cl+" times.", 10, 100);
		
		if (mouse_status)
			g.drawString("Mouse is in the frame.", 10, 125);
		else
			g.drawString("Mouse is out of the frame.", 10, 125);
		
		if (mouse_pressed)
			g.drawString("Mouse is pressed.", 10, 150);
		else
			g.drawString("Mouse is released.", 10, 150);
	}
	public void mouseDragged(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
	}
	public void mouseMoved(MouseEvent m) 
	{
		x=m.getX();
		y=m.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent arg0) 
	{
		cl++;
		// TODO Auto-generated method stub
	}
	public void mouseEntered(MouseEvent arg0) 
	{
		mouse_status=true;
		// TODO Auto-generated method stub
	}
	public void mouseExited(MouseEvent arg0)
	{
		mouse_status=false;
		// TODO Auto-generated method stub
	}
	public void mousePressed(MouseEvent arg0) 
	{
		mouse_pressed=true;
		// TODO Auto-generated method stub
	}
	public void mouseReleased(MouseEvent arg0) 
	{
		mouse_pressed=false;
		// TODO Auto-generated method stub
	}
}

class MyWindowAdapter extends WindowAdapter 
{
	SampleFrame sampleFrame;
	//CONSTRUCTOR
	public MyWindowAdapter(SampleFrame frame) 
	{
		sampleFrame = frame;
	}
	public void windowClosing(WindowEvent we) 
	{
		sampleFrame.setVisible(false);
	}
}
// Create frame window.
public class AppletFrame extends Applet 
{
	Frame f;
	public void init() 
	{
		f = new SampleFrame("A Frame Window");
		f.setSize(500, 500);
		f.setVisible(true);
	}
	public void paint(Graphics g) 
	{
		g.drawString("This is in applet window", 10, 20);
	}
}