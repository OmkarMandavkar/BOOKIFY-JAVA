import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 

class ITsem4 extends JFrame implements ActionListener
{

  JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,background1;

  JButton bt1,bt2,bt3,bt4,bt5,bt6;

  ImageIcon i;

  Font f1,f2;

  ITsem4(){

  super("Sem4-IT"); 


  i = new ImageIcon("Images/BG2.jpg");
  background1 = new JLabel("",i,JLabel.CENTER);
  background1.setBounds(0,0,1366, 768);
 
  f1=new Font("Times New Roman",Font.BOLD,33);
  f2=new Font("Times New Roman",Font.BOLD,20); 

  lb1 = new JLabel("INFORMATION TECHNOLOGY ENGINEERING SEM-4",JLabel.CENTER);
  lb1.setBounds(250,50,900,50);
  lb1.setFont(f1);  
  lb1.setForeground(Color.white);
  lb2 = new JLabel("Engineering Mathemetics-4",JLabel.LEFT);
  lb2.setBounds(440,150,250,40);
  lb2.setFont(f2);
  
  lb3 = new JLabel("Computer Network and ",JLabel.LEFT);
  lb3.setBounds(440,235,250,40); 
  lb3.setFont(f2);
 
  lb4 = new JLabel("Operating System",JLabel.LEFT);
  lb4.setBounds(440,330,250,40);
  lb4.setFont(f2);

  lb5 = new JLabel("Automata System",JLabel.LEFT);
  lb5.setBounds(440,420,250,40);
  lb5.setFont(f2);
  
  lb6 = new JLabel("Computer Organization and  ",JLabel.LEFT);
  lb6.setBounds(440,505,250,40);
  lb6.setFont(f2);
  
  lb7 = new JLabel("Network Design ",JLabel.LEFT);
  lb7.setBounds(530,255,250,40);
  lb7.setFont(f2);

  lb8 = new JLabel("Architecture ",JLabel.LEFT);
  lb8.setBounds(550,525,250,40);
  lb8.setFont(f2);
  
  bt1 = new JButton("Click Here");
  bt1.setBounds(710,155,120,30);

  bt2 = new JButton("Click Here");
  bt2.setBounds(710,245,120,30);

  bt3 = new JButton("Click Here");
  bt3.setBounds(710,335,120,30);

  bt4 = new JButton("Click Here");
  bt4.setBounds(710,425,120,30);
  
  bt5 = new JButton("Click Here");
  bt5.setBounds(710,515,120,30);

  bt6 = new JButton("Back");
  bt6.setBounds(580,600,120,30);

  add(background1);

  background1.add(lb1);
  background1.add(lb2);
  background1.add(lb3);
  background1.add(lb4);
  background1.add(lb5);
  background1.add(lb6);
  background1.add(lb7);
  background1.add(lb8);
  
  background1.add(bt1);
  background1.add(bt2);
  background1.add(bt3);
  background1.add(bt4);
  background1.add(bt5);
  background1.add(bt6);
 

 bt1.addActionListener(this);
 bt2.addActionListener(this);
 bt3.addActionListener(this);
 bt4.addActionListener(this);
 bt5.addActionListener(this);
 bt6.addActionListener(this);
 
        setLayout(null);    
        setVisible(true);  
        setSize(1366, 768);
        setDefaultCloseOperation(EXIT_ON_CLOSE);  

}


public void actionPerformed(ActionEvent ae){

	if(ae.getSource()==bt1)
	  {
	  	 setVisible(false);
	  	 Sem4Maths d1 = new Sem4Maths();
	  	 d1.setVisible(true);   

	  }


	  if(ae.getSource()==bt2)
	  {
	  	 setVisible(false);
	       Sem4CNND d2 = new Sem4CNND();
	       d2.setVisible(true);   
	  }


	  if(ae.getSource()==bt3)
	  {
	  	 setVisible(false);
	       Sem4OS d3 = new Sem4OS();
	       d3.setVisible(true);   
	  }


	  if(ae.getSource()==bt4)
	  {
	  	 setVisible(false);
	       Sem4AS d4 = new Sem4AS();
	       d4.setVisible(true);   
	  }


	  if(ae.getSource()==bt5)
	  {
	  	 setVisible(false);
	       Sem4COA d5 = new Sem4COA();
	       d5.setVisible(true); 
	  }


if(ae.getSource()==bt6)
{
  setVisible(false);
  thirdpageit obj3 =new thirdpageit();
  obj3.setVisible(true);
}


}


public static void main(String s[])  
    {  
       new ITsem4();
    }  
}