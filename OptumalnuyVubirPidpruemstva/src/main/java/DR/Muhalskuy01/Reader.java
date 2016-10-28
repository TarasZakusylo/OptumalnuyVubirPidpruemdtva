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
 

class Reader extends JFrame {

	// JFrame Reader = new JFrame("Diploma0.1");

	JButton Vhid = new JButton("Почати       роботу");
	JLabel Pusto, l_Text1, l_Text2, l_Text3;
	
	String f = "src/res/Pruvitanna.png";
  
	ImageIcon logo = new ImageIcon(f);
	JLabel l_logo = new JLabel(logo);

	eHandler handler = new eHandler();

	public Reader(String s) {
		super(s);
	 
		
		Pusto = new JLabel("");
		Pusto.setBounds(10, 10, 10, 10);
		
		Vhid.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
		Vhid.setForeground(Color.red);
		Vhid.setBounds(70, 400, 800, 50);
		add(Vhid);

		l_logo.setBounds(0, 0, 950, 500);
		

		l_Text1 = new JLabel("Інтелектуальний модуль підтримки прийняття");
		l_Text1.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		l_Text1.setForeground(Color.BLUE);
		l_Text1.setBounds(20, 20, 930, 75);
		add(l_Text1);		

		l_Text2 = new JLabel("рішень щодо вибору оптимального місця");
		l_Text2.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		l_Text2.setBounds(100, 80, 900, 75);		
		l_Text2.setForeground(Color.BLUE);
		add(l_Text2);
		
		l_Text3 = new JLabel("розташування підприємства.");
		l_Text3.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 30));
		l_Text3.setBounds(250, 140, 600, 75);		
		l_Text3.setForeground(Color.BLUE);
		add(l_Text3);
		
		
		add(l_logo);
		add(Pusto);

		Vhid.addActionListener(handler);
	}

	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == Vhid) {
					new Menu1("");
	//				setVisible(false);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "System error");

			}
		}
	}

}