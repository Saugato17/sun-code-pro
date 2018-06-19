package AWTObjects;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;

/*
<applet code="UsingButtons" width=300 height=200>
</applet>
 */

public class UsingButtons extends Applet implements ActionListener
{
	Button b1, b2, b3;
	Label l1;
	public void init()
	{
		b1=new Button("Submit");
		b2=new Button("Cancel");
		b3=new Button("Clear");
		l1=new Label();
		
		add(b1);
		add(b2);
		add(b3);
		add(l1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent a) 
	{
		String st=a.getActionCommand();
		if(st.equals("Submit"))
		{
			l1.setText("");
			l1.setText("You clicked on \'Submit\'");
		}
		else if(st.equals("Cancel"))
		{
			l1.setText("");
			l1.setText("You clicked on \'Cancel\'");
		}
		else if(st.equals("Clear"))
		{
			l1.setText("");
			l1.setText("You clicked on \'Clear\'");
		}			
	}
}
