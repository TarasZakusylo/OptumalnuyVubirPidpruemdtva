package DR.Muhalskuy01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSlider;

import DR.Muhalskuy01.Vilnuy.eHandler;

 
class Obmejennuy extends JFrame {
	
		JFrame obmejennuy = new JFrame("Diploma0.1");
	   
		JButton b_nazad = new JButton("Назад");
		JButton b_gidro = new JButton("Гідроелектростанції та гідрозалежні споруди");
		JButton b_kopalunu = new JButton("Корисні копалини та родовища");
		JButton b_rubackuy_p = new JButton("Рибацький промисел");
		JButton b_zburalnuckuy_p = new JButton("Збиральницький промисел");
		JButton b_zemlerobnuy_p = new JButton("Землеробний промисел");
		JButton b_pacicnuy_p = new JButton("Пасічницький промисел");
		
	    JLabel Pusto ;
	 
	    JLabel l_tup = new JLabel ("Виберіть вид обмеженого місця розташування підприємства:") ;

	    
	eHandler handler = new eHandler();
	
	public Obmejennuy(String s) {
		super(s);		

		obmejennuy.setVisible(true);
		obmejennuy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obmejennuy.setSize(950,500);
		obmejennuy.setResizable(false);
		obmejennuy.setLocationRelativeTo(null);
		
		Pusto = new JLabel("");
		Pusto.setBounds(10, 10, 10, 10);
		
		b_nazad.setBounds(850, 0, 100, 20);
		obmejennuy.add(b_nazad);
		
		b_gidro.setBounds(225, 100, 500, 50);
		obmejennuy.add(b_gidro);
		b_kopalunu.setBounds(225, 150, 500, 50);
		obmejennuy.add(b_kopalunu);
		b_rubackuy_p.setBounds(225, 200, 500, 50);
		obmejennuy.add(b_rubackuy_p);
		b_zburalnuckuy_p.setBounds(225, 250, 500, 50);
		obmejennuy.add(b_zburalnuckuy_p);
		b_zemlerobnuy_p.setBounds(225, 300, 500, 50);
		obmejennuy.add(b_zemlerobnuy_p);
		b_pacicnuy_p.setBounds(225, 350, 500, 50);
		obmejennuy.add(b_pacicnuy_p);
				
 
		l_tup.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 20));
		l_tup.setForeground(Color.blue);
		l_tup.setBounds(75, 30, 800, 20); 
		obmejennuy.add(l_tup);	
		
		
		obmejennuy.add(Pusto);
		
		 
		b_nazad.addActionListener(handler);
		
		b_gidro.addActionListener(handler);
		b_kopalunu.addActionListener(handler);
		b_rubackuy_p.addActionListener(handler);
		b_zburalnuckuy_p.addActionListener(handler);
		b_zemlerobnuy_p.addActionListener(handler);
		b_pacicnuy_p.addActionListener(handler);
		 
	}


	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				  
				if (e.getSource() == b_nazad) {
					new Menu1("");
				}
				if (e.getSource() == b_gidro) {
					new Obmejennuy1("");
					Obmejennuy1.metod(1);
				}
				if (e.getSource() == b_kopalunu) {
					new Obmejennuy1("");
					Obmejennuy1.metod(2);
				}
				if (e.getSource() == b_rubackuy_p) {
					new Obmejennuy1("");
					Obmejennuy1.metod(3);
				}
				if (e.getSource() == b_zburalnuckuy_p) {
					new Obmejennuy1("");
					Obmejennuy1.metod(4);
				}
				if (e.getSource() == b_zemlerobnuy_p) {
					new Obmejennuy1("");
					Obmejennuy1.metod(5);
				}
				if (e.getSource() == b_pacicnuy_p) {
					new Obmejennuy1("");
					Obmejennuy1.metod(6);
				}
				
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "System error");

			}
		}
	} 

}
 
 

