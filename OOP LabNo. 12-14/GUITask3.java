import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUITask3 extends JFrame implements ActionListener{
	
	Container c=getContentPane();
	String[] arr={"MALE","FEMALE"};
	JLabel n=new JLabel("NAME ");
	JLabel gen=new JLabel("GENDER ");
	JLabel f=new JLabel("FATHER NAME ");
	JLabel p=new JLabel("PASSWORD ");
        JLabel Cp=new JLabel("CONFIRM PASSWORD ");
	JLabel ci=new JLabel("CITY ");
	JLabel e=new JLabel("EMAIL ");
	JTextField nT=new JTextField();
	JTextField fT=new JTextField();
	JPasswordField pT=new JPasswordField();
        JPasswordField CpT=new JPasswordField();
        JTextField cT=new JTextField();
	JTextField eT=new JTextField();
	JComboBox genB=new JComboBox(arr);
	JButton reg=new JButton("REGISTER ");
	JButton res=new JButton("RESET ");
//        JDialog d=new JDialog(this,"Dialog");

        public GUITask3(){
            super("Registration Form");
	c.setLayout(null);
        c.setBackground(Color.PINK);
	sizeOfComponents();	
	addComponentToContainer();
        //actions();
	
	}	

	public void sizeOfComponents(){
		n.setBounds(50,150,100,40);
		gen.setBounds(50,190,120,40);
		f.setBounds(50,230,140,40);
		p.setBounds(50,270,160,40);
                Cp.setBounds(50,310,180,40);
		ci.setBounds(50,350,200,40);
		e.setBounds(50,390,220,40);
		nT.setBounds(200,150,200,30);
		genB.setBounds(200,190,200,30);
		fT.setBounds(200,230,200,30);
		pT.setBounds(200,270,200,30);
                CpT.setBounds(200, 310, 200, 30);
		cT.setBounds(200,350,200,30);
		eT.setBounds(200,390,200,30);
		reg.setBounds(80,440,110,45);
		res.setBounds(260,440,110,45);
                reg.addActionListener(this);
                res.addActionListener(this);
            
        }
        
    @Override
                public void actionPerformed(ActionEvent e){
                if(e.getSource()==reg){
                    int d=genB.getSelectedIndex();
                    
                 
                    String [] s={"Name = "+ nT.getText(),"Father Name = " +fT.getText(),"Gender = "+ genB.getSelectedItem().toString(),"Password = " +new String(CpT.getPassword())  ,"City = "+cT.getText(),"Email = "+eT.getText()};
                     JOptionPane.showConfirmDialog(this,s, "Confirmation Message",JOptionPane.PLAIN_MESSAGE);
                }
                else if(e.getSource()==res){
                nT.setText("   ");
                    fT.setText("   ");
                   genB.setSelectedIndex(0);
                   pT.setText("   ");
                    CpT.setText("   ");
                    cT.setText("   ");
                    eT.setText("   ");}
                }    
        

	public void addComponentToContainer(){
		c.add(n);
		c.add(gen);
		c.add(f);
		c.add(p);
                c.add(Cp);
                c.add(ci);
		c.add(e);
		c.add(nT);
		c.add(genB);
		c.add(fT);
		c.add(pT);
                c.add(CpT);
                c.add(cT);
		c.add(eT);
		c.add(reg);
		c.add(res);
	}
        
             

	public static void main(String[] args) throws Exception {
		GUITask3 a=new GUITask3();
		a.setVisible(true);
		a.setBounds(30,30,570,700);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setResizable(true);

}}