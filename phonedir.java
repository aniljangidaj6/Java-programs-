//Programmer : Shrimant More
//Task : Phone Directory

import javax.swing.*;
	
class phonedir
{
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		//JLabel t = new JLabel("Phone_directory");
		JLabel n = new JLabel("Name");
		JLabel cn = new JLabel("Contact Number");
		
		JButton s = new JButton("Save Contact");
		JButton c = new JButton("Discard");

		JTextField tn = new JTextField();	
		JTextField tc = new JTextField();

		//t.setBounds(100,20,70,30);
		n.setBounds(90,100,120,20);
		cn.setBounds(90,170,120,20);	
		

		tn.setBounds(250,100,170,20);		
		tc.setBounds(250,170,170,20);


		s.setBounds(90,270,130,20);
		c.setBounds(250,270,130,20);

		//f.add(t);
		f.add(n);
		f.add(cn);
		f.add(s);
		f.add(c);

		f.add(tn);
		f.add(tc);

		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}
