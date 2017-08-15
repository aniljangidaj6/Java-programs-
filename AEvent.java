//Programmer : Shrimant More
//Task : See how many times key was pressed

import java.awt.*;
import java.awt.event.*;

class AEvent extends Frame implements ActionListener
{
  TextField tf;
  int count;


 	 AEvent()
	 {
	   tf = new TextField();
	   tf.setBounds(60,50,190,20);

           Button b = new Button("Click me");
	   b.setBounds(100,120,80,30);
	   add(b);
	   add(tf);

	    b.addActionListener(this);


       	 setSize(300,300);
	 setLayout(null);
	 setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		count++;
  		tf.setText("No. of times keypressed : "+count);

	}

		public static void main(String args[])
		{
  			new AEvent();

		}

}
