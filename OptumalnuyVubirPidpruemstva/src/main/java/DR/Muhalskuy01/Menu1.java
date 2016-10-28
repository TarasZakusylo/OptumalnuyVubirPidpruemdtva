package DR.Muhalskuy01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu1  extends JFrame {
	
	JFrame vubirPoslug = new JFrame("Diploma0.1");

	 JLabel  Pusto ;
	
 	JButton b_obmejennuy = new JButton ("Обмежений");
 	JButton b_vilnuy = new JButton ("Вільний");
 	
	JLabel l_vbirPoslug = new JLabel("Виберіть тип");
 	
    ImageIcon logo = new ImageIcon("src/res/Menu1.png");
  	 JLabel l_logo = new JLabel(logo);
 
		 	 eHandler handler = new eHandler();
		 	 
	public Menu1(String s) {
        super(s);
    
        vubirPoslug.setVisible(true);
        vubirPoslug.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vubirPoslug.setSize(950, 500);
        vubirPoslug.setResizable(false);
        vubirPoslug.setLocationRelativeTo(null);
        
      	Pusto = new JLabel("");
    	Pusto.setBounds(10,10,10,10);
    	
        l_logo.setBounds(0, 0, 950, 500);
    	        
        l_vbirPoslug.setBounds(300,125,450,60);
        l_vbirPoslug.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,40));
        l_vbirPoslug.setForeground(Color.green);
    	vubirPoslug.add(l_vbirPoslug);
    	
    	b_obmejennuy.setBounds(100, 330, 300, 50) ;
    	b_obmejennuy.setForeground(Color.red);
        vubirPoslug.add(b_obmejennuy);
        b_vilnuy.setBounds(550, 330, 300, 50) ;
        b_vilnuy.setForeground(Color.red);
        vubirPoslug.add(b_vilnuy);
        
 	    vubirPoslug.add(l_logo);
    	vubirPoslug.add(Pusto);
        
    	b_obmejennuy.addActionListener(handler);
    	b_vilnuy.addActionListener(handler);	
	}
	
	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == b_obmejennuy) {
				     new Obmejennuy ("");
			//	     vubirPoslug.setVisible(false);
				}
				if (e.getSource() == b_vilnuy) {
				     new Vilnuy("");
			//	     vubirPoslug.setVisible(false);
				}				
			} catch (Exception ex) {
			//	JOptionPane.showMessageDialog(null, "System error");

			}
		}
	}
 
}
	
 
