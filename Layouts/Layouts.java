import java.awt.*;  
import javax.swing.*;

public class Layouts{  
  JFrame l;  
  Layouts()
  {  
    l=new JFrame();  
      
    JButton b1=new JButton("1");  
    JButton b2=new JButton("2");  
    JButton b3=new JButton("3");  
    JButton b4=new JButton("4");

     l.setLayout(new BorderLayout());

     l.add("North",  new Button("North"));
     l.add("South",  new Button("South"));
     l.add("East",   new Button("East"));
     l.add("West",   new Button("West"));
     l.add("Center", new Button("Center")); 
    
              
    l.add(b1);l.add(b2);l.add(b3);l.add(b4);
      
    l.setLayout(new FlowLayout(FlowLayout.RIGHT));

    l.setLayout(new GridLayout(3,3)); 

    GridBagLayout layout = new GridBagLayout();  

    l.setLayout(layout);
    l.setSize(200,200);
    l.setVisible(true);  
}  
public static void main(String[] args) 
{  
    new Layouts();  
}  
}  