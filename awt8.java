import java.awt.*;
import java.awt.event.*;
class awt8 extends Frame implements ActionListener
{
	int count=0;
	TextField tf1,tf2,tf3,tf4;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,restart;
	awt8()
	{
		
		tf1=new TextField();
		tf1.setBounds(50,250,150,50);
		
		restart=new Button("RESTART");
		restart.setBounds(50,300,150,50);
		restart.addActionListener(this);
		
		tf3=new TextField("player1=X");
		tf3.setBounds(50,50,75,50);
		
		tf4=new TextField("player2=0");
		tf4.setBounds(125,50,75,50);
		
		
		b1=new Button("1");
		b1.setBounds(50,100,50,50);
		b1.addActionListener(this);
		
		b2=new Button("2");
		b2.setBounds(100,100,50,50);
		b2.addActionListener(this);
		
		b3=new Button("3");
		b3.setBounds(150,100,50,50);
		b3.addActionListener(this);
		
		b4=new Button("4");
		b4.setBounds(50,150,50,50);
		b4.addActionListener(this);
		
		
		b5=new Button("5");
		b5.setBounds(100,150,50,50);
		b5.addActionListener(this);
		
		b6=new Button("6");
		b6.setBounds(150,150,50,50);
		b6.addActionListener(this);
		
		
		b7=new Button("7");
		b7.setBounds(50,200,50,50);
		b7.addActionListener(this);
		
		b8=new Button("8");
		b8.setBounds(100,200,50,50);
		b8.addActionListener(this);
		
		b9=new Button("9");
		b9.setBounds(150,200,50,50);
		b9.addActionListener(this);
		add(tf3);
		add(tf4);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(tf1);
		add(restart);
		setSize(800,500);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String sign=(count%2==0)?"X":"0";// to assign the value to the box we use ? for true and : for false.
		
		if(ae.getSource()==b1)
		{
			b1.setLabel(sign);
		}
		if(ae.getSource()==b2)
		{
			b2.setLabel(sign);
		}
		if(ae.getSource()==b3)
		{
			b3.setLabel(sign);
		}
		if(ae.getSource()==b4)
		{
			b4.setLabel(sign);
		}
		if(ae.getSource()==b5)
		{
			b5.setLabel(sign);
		}
		if(ae.getSource()==b6)
		{
			b6.setLabel(sign);
		}
		if(ae.getSource()==b7)
		{
			b7.setLabel(sign);
		}
		if(ae.getSource()==b8)
		{
			b8.setLabel(sign);
		}
		if(ae.getSource()==b9)
		{
			b9.setLabel(sign);
		}
		if(ae.getSource()==restart)
		{
			b1.setLabel("1");
			b2.setLabel("2");
			b3.setLabel("3");
			b4.setLabel("4");
			b5.setLabel("5");
			b6.setLabel("6");
			b7.setLabel("7");
			b8.setLabel("8");
			b9.setLabel("9");
			tf1.setText("");
		}
		count++;
		check();
	}
	public void check()
	{
		if(b1.getLabel().equals(b2.getLabel())&& b2.getLabel().equals(b3.getLabel()))// to compare buttons.
		{
			if(b3.getLabel().equals("X"))// to comapre strings
				tf1.setText(String.valueOf("player1 is the winner"));
			else if(b3.getLabel().equals("0"))
				tf1.setText(String.valueOf("player2 is the winner"));
		}
			
		if(b1.getLabel().equals(b4.getLabel())&& b4.getLabel().equals(b7.getLabel()))
		{
			if(b7.getLabel().equals("X"))
				tf1.setText(String.valueOf("player1 is the winner"));
			else if(b7.getLabel().equals("0")) 
				tf1.setText(String.valueOf("player2 is the winner"));
		}
			
		if(b2.getLabel().equals(b5.getLabel())&& b5.getLabel().equals(b8.getLabel()))
		{
			if(b8.getLabel().equals("X"))
				tf1.setText(String.valueOf("player1 is the winner"));
			else if(b8.getLabel().equals("0"))
				tf1.setText(String.valueOf("player2 is the winner"));
		}	
		if(b3.getLabel().equals(b6.getLabel())&& b6.getLabel().equals(b9.getLabel()))
		{
			if(b9.getLabel().equals("X"))
				tf1.setText(String.valueOf("player1 is the winner"));
			else if(b9.getLabel().equals("0"))
				tf1.setText(String.valueOf("player2 is the winner"));
		}
			
		if(b3.getLabel().equals(b5.getLabel())&& b5.getLabel().equals(b7.getLabel()))
		{
			if(b7.getLabel().equals("X"))
				tf1.setText(String.valueOf("player1 is the winner"));
			else if(b7.getLabel().equals("0"))
				tf1.setText(String.valueOf("player2 is the winner"));
		}
			
		if(b7.getLabel().equals(b8.getLabel())&& b8.getLabel().equals(b9.getLabel()))
		{
			if(b9.getLabel().equals("X"))
				tf1.setText(String.valueOf("player1 is the winner"));
			else if (b9.getLabel().equals("0"))
				tf1.setText(String.valueOf("player2 is the winner"));
		}
			
		if(b4.getLabel().equals(b5.getLabel())&& b5.getLabel().equals(b6.getLabel()))
		{
			if(b6.getLabel().equals("X"))
				tf1.setText(String.valueOf(" player1 is the winner"));
			else if(b6.getLabel().equals("0"))
				tf1.setText(String.valueOf("player2 is the winner"));
		}
			
		if(b1.getLabel().equals(b5.getLabel())&& b5.getLabel().equals(b9.getLabel()))
		{
			if(b9.getLabel().equals("X"))
				tf1.setText(String.valueOf("player1 is the winner"));
			else if(b9.getLabel().equals("0"))
				tf1.setText(String.valueOf("player2 is the winner"));
		}
	}
	public static void main(String[] args)
	{
		new awt8();
	}
}	