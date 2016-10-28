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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

 
class Obmejennuy1 extends JFrame {
	
		JFrame obmejennuy1 = new JFrame("Diploma0.1");
	   
		JButton b_nazad = new JButton("Назад");
		JButton b_gotovo = new JButton("Готово");

		 ImageIcon map = new ImageIcon("src/res/U_map2.png");
	  	 JLabel l_map = new JLabel(map);
	  	 JLabel l_region = new JLabel ("Виберіть регіон:") ;
	 	
	  	 JSlider sl = new JSlider( 1, 1 , 25 , 1);
		 int fps = 1 ;
	  	 
	    JLabel Pusto ;
	 
	  
	eHandler handler = new eHandler();
	SliderListener slider = new SliderListener();
	
	
	public Obmejennuy1(String s) {
		super(s);		

		obmejennuy1.setVisible(true);
		obmejennuy1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obmejennuy1.setSize(950,500);
		obmejennuy1.setResizable(false);
		obmejennuy1.setLocationRelativeTo(null);
		
		l_region.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 22));
		l_region.setForeground(Color.green);
		l_region.setBounds(350, 0, 800, 20); 
		obmejennuy1.add(l_region);
		
	//  бігунок
			sl.setMajorTickSpacing(5);
			sl.setMinorTickSpacing(1);
			sl.setPaintTicks(true);
			sl.setPaintLabels(true);
			sl.setLabelTable(sl.createStandardLabels(2,1));
			
			sl.setBounds(770,25,55,430);
			obmejennuy1.add(sl);
		
		
		Pusto = new JLabel("");
		Pusto.setBounds(10, 10, 10, 10);
		
		b_nazad.setBounds(850, 0, 100, 20);
		obmejennuy1.add(b_nazad);
		b_gotovo.setBounds(848, 447, 100, 20);
		obmejennuy1.add(b_gotovo);
		
		l_map.setBounds(100, 27, 635, 440);
		obmejennuy1.add(l_map);
		
		obmejennuy1.add(Pusto);
		
		 
		b_nazad.addActionListener(handler);
		b_gotovo.addActionListener(handler);
		sl.addChangeListener(slider);
		 
	}

public static void metod(int i) {
	
	} 

class SliderListener implements ChangeListener {
    public void stateChanged(ChangeEvent e) {
       sl = (JSlider)e.getSource();
           fps = (int)sl.getValue();	     
    } 
}

	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == b_nazad) {
					new Obmejennuy("");
				}
				if (e.getSource() == b_gotovo){
					
					if(fps == 25){
						JOptionPane.showMessageDialog(null, "Вибачте, інформація на даний момент відсутня\n"
								+ "зверніться, будь ласка, пізніше.");
					}
					else{
					Region r = new Region (fps);
				 	
						r.setVisible(true);
						r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						r.setSize(350, 200);
						r.setResizable(false);
						r.setLocationRelativeTo(null);
					}
				}
				
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "System error");

			}
		}
	}


	

}