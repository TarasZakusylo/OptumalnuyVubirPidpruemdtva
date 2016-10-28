package DR.Muhalskuy01;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 
public class Region extends JFrame {


	JButton Yes = new JButton("Так");
	JButton No = new JButton("Ні");
	JLabel Pusto, l_Text1, l_Text2, l_Text3, l_Text4;

	String komentar = "Бажаєте перейти на офіційний сайт ?";
	String komentar1  = "Для подальшої роботи Вам необхідно\n";
	String komentar2  = "звернутися за дозволом за адресою\n";
	String komentar3  = "" ;
	
	String e_mail = "http://" ;
	
	int f = 0;

	////
	
	String a_1 = "м. Київ, площа Лесі Українки, 1";
	String a_2 = "м. Харків, вул. Сумська, 64";
	String a_3 = "м. Дніпропетровськ, проспект Кірова, 2";
	String a_4 = "м. Одеса, проспект Шевченка, 4";
	String a_5 = "м. Краматорськ, площа Леніна, 2";
	String a_6 = "м. Львів,вул. Винниченка, 18";
	String a_7 = "м. Запоріжжя, проспект Леніна, 164";
	String a_8 = "м. Миколаїв, вул. Адміральська, 22";
	String a_9 = "м. Луганськ, площа Героїв ВВВ, 3";
	String a_10 = "м. Вінниця, вул. Соборна, 70";
	String a_11 = "м. Херсон, площа Свободи, 1";
	String a_12 = "м. Потава, вул. Жовтнева, 45";
	String a_13 = "м. Чернігів, проспект Миру, 43";
	String a_14 = "м. Черкаси, бульвар Шевченка, 185";
	String a_15 = "м. Суми, площа Незалежності, 2";
	String a_16 = "м. Житомир, майдан Корольова, 1";
	String a_17 = "м. Кіроваград, площа Героїв Майдану, 1";
	String a_18 = "м. Хмельницький, майдан Незалежності, 2";
	String a_19 = "м. Рівне, майдан Просівти, 1";
	String a_20 = "м. Чернівці, вул. Грушевського, 1";
	String a_21 = "м. Тернопіль, вул. Грушевського, 8";
	String a_22 = "м. Івано-франківськ, вул. Грушевського, 21";
	String a_23 = "м. Луцьк, майдан Київський, 9";
	String a_24 = "м. Ужгород, площа Народна, 4";
	
	String e_1 = "kor.gov.ua";
	String e_2 = "kharkivoda.gov.ua";
	String e_3 = "oblrada.dp.ua";
	String e_4 = "oda.odessa.gov.ua";
	String e_5 = "donoda.gov.ua";
	String e_6 = "oblrada.lviv.ua";
	String e_7 = "oblrada.zp.ua";
	String e_8 = "mk-oblrada.gov.ua";
	String e_9 = "oblrada.lg.ua";
	String e_10 = "www.vinrada.gov.ua";
	String e_11 = "www.khoda.gov.ua";
	String e_12 = "www.oblrada.pl.ua";
	String e_13 = "shor.gov.ua";
	String e_14 = "oblrada.ck.gov.ua";
	String e_15 = "sorada.gov.ua";
	String e_16 = "zt.gov.ua";
	String e_17 = "oblrada.kirovograd.ua";
	String e_18 = "oblrada.km.ua";
	String e_19 = "oblrada.rv.ua";
	String e_20 = "oblrada.cv.ua";
	String e_21 = "obl-rada.te.ua";
	String e_22 = "oblrada.if.ua";
	String e_23 = "volynrada.gov.ua";
	String e_24 = "zakarpat-rada.gov.ua";

	eHandler handler = new eHandler();

	public Region(int fps) {
		super();

		Pusto = new JLabel("");
		Pusto.setBounds(10, 10, 10, 10);

		Yes.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
		Yes.setForeground(Color.red);
		Yes.setBounds(50, 120, 100, 30);
		add(Yes);
		
		No.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
		No.setForeground(Color.red);
		No.setBounds(200, 120, 100, 30);
		add(No);
 
		f=f+fps;

		
		l_Text2 = new JLabel(komentar1);
		l_Text2.setBounds(40, 5, 280, 20);
		add(l_Text2);
		l_Text3 = new JLabel(komentar2);
		l_Text3.setBounds(40, 25, 280, 20);
		add(l_Text3);
		
		l_Text1 = new JLabel(komentar);
		l_Text1.setBounds(40, 90, 280, 20);
		add(l_Text1);

		 
		switch (f){
		case 1:
			komentar3 = a_1;
			e_mail = e_mail+ e_1;
			break;
		case 2:
			komentar3 = a_2;
			e_mail = e_mail+e_2;
			break;
		case 3:
			komentar3 = a_3;
			e_mail =e_mail+ e_3;
			break;
		case 4:
			komentar3 = a_4;
			e_mail =e_mail+ e_4;
			break;
		case 5:
			komentar3 = a_5;
			e_mail =e_mail+ e_5;
			break;
		case 6:
			komentar3 = a_6;
			e_mail = e_mail+e_6;
			break;
		case 7:
			komentar3 = a_7;
			e_mail = e_mail+e_7;
			break;
		case 8:
			komentar3 = a_8;
			e_mail =e_mail+ e_8;
			break;
		case 9:
			komentar3 = a_9;
			e_mail = e_mail+e_9;
			break;
		case 10:
			komentar3 = a_10;
			e_mail =e_mail+ e_10;
			break;
		case 11:
			komentar3 = a_11;
			e_mail = e_mail+e_11;
			break;
		case 12:
			komentar3 = a_12;
			e_mail =e_mail+ e_12;
			break;
		case 13:
			komentar3 = a_13;
			e_mail =e_mail+ e_13;
			break;
		case 14:
			komentar3 = a_14;
			e_mail = e_mail+e_14;
			break;
		case 15:
			komentar3 = a_15;
			e_mail =e_mail+ e_15;
			break;
		case 16:
			komentar3 = a_16;
			e_mail =e_mail+ e_16;
			break;
		case 17:
			komentar3 = a_17;
			e_mail = e_mail+e_17;
			break;
		case 18:
			komentar3 = a_18;
			e_mail =e_mail+ e_18;
			break;
		case 19:
			komentar3 = a_19;
			e_mail = e_mail+e_19;
			break;
		case 20:
			komentar3 = a_20;
			e_mail = e_mail+e_20;
			break;
		case 21:
			komentar3 = a_21;
			e_mail = e_mail+e_21;
			break;
		case 22:
			komentar3 = a_22;
			e_mail =e_mail+ e_22;
			break;
		case 23:
			komentar3 = a_23;
			e_mail = e_mail+e_23;
			break;
		case 24:
			komentar3 = a_24;
			e_mail = e_mail+e_24;
			break;
		 
			
		}
		
		l_Text4 = new JLabel(komentar3);
		l_Text4.setBounds(15, 45, 330, 20);
		add(l_Text4);

		add(Pusto);
		
		Yes.addActionListener(handler);
		No.addActionListener(handler);
	}

 

	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == Yes) {
  
					Desktop d = Desktop.getDesktop();
					try {
					 d.browse(new URI(e_mail));
					} catch (Exception e1) {}
				}
				if (e.getSource() == No) {
					setVisible(false);
				}
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "System error");

			}
		}
	}
	
}
