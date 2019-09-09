import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class GUItask2 extends JFrame{
	JPanel p=new JPanel();
	JButton b1=new JButton("Button");
	BorderLayout b=new BorderLayout();

	GUItask2(){

		p.setLayout(b);
		p.add(b1,BorderLayout.SOUTH);
		add(p);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new GUItask2();
	}

	
}
