import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;  
public class Sem3PCOM extends JFrame implements ActionListener {    
    JTable j; 
	JLabel lb;
	JButton bt;	
    Sem3PCOM() 
    {    
	    lb =new JLabel(" ");
	    lb.setBounds(50,400, 100,30);
		
		
		bt=new JButton("Back");  
	    bt.setBounds(480,200, 100,30);
	
	
	
	
        setTitle("Database Management System"); 
        
        String[] columnNames = {"Sr. NO", "Author", "Publication", "Price" }; 
        
        String[][] data = { { "   1 ","   Vijay Kumar Garg", "   Morgan Kaufmann ", "   Rs 500 " },
        	    { "   2 ","   Simon Haykin-Michael Moher", "   Wiley India ", "   Rs 699 " }
        };
        
        j = new JTable(data, columnNames); 
        j.setBounds(30, 40, 200, 300);  
        
        JScrollPane sp = new JScrollPane(j);
        sp.setBounds(0, 0, 1120,55);
		
        add(sp);
        add(lb);
	    lb.add(bt);
		bt.addActionListener(this);
		
        setSize(1366, 768); 
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    } 
	
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==bt)
{
	 setVisible(false);
     ITsem3 obj8 = new ITsem3();
     obj8.setVisible(true); 
}
}		
	
    public static void main(String[] args) 
    { 
        new Sem3PCOM(); 
    } 
}