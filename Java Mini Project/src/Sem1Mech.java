import java.awt.*;
import java.awt.event.*;
import javax.swing.*;   
import javax.swing.JFrame; 
import javax.swing.JScrollPane; 
import javax.swing.JTable;  
public class Sem1Mech extends JFrame implements ActionListener {    
    JTable j; 
	JLabel lb;
	JButton bt;
    Sem1Mech() 
    {   
	    lb =new JLabel(" ");
	    lb.setBounds(50,400, 100,30);
		
		
		bt=new JButton("Back");  
	    bt.setBounds(480,200, 100,30);
	
	
	
        setTitle("Engineering Mechanics"); 
        
        String[] columnNames = {"Sr. NO", "Author", "Publication", "Price" }; 
        
        String[][] data = { {"   1 ", "   M.D Dayal", "   M.D Dayal Publications ", "   Rs 500" },
        		{"   2 ", "   N.H Dubey", "   Tata McGraw Hill ", "   Rs 520" }		
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
     ITsem1 obj4 = new ITsem1();
     obj4.setVisible(true); 


}

}	
	
    public static void main(String[] args) 
    { 
        new Sem1Mech(); 
    } 
}