package DR.Muhalskuy01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.xeiam.xchart.BitmapEncoder;
import com.xeiam.xchart.Chart;
import com.xeiam.xchart.ChartBuilder;
import com.xeiam.xchart.StyleManager.ChartType;
import com.xeiam.xchart.StyleManager.LegendPosition;
import com.xeiam.xchart.SwingWrapper;

class Vilnuy extends JFrame {

	JFrame vilnuy = new JFrame("Diploma0.1");

	JButton Analith = new JButton("Провести аналіз");
	JButton b_nazad = new JButton("Назад");
	JButton b_g_vutpatu = new JButton("Графік витрат");
	JButton b_g_prubytok = new JButton("Графік прибутку");
	JButton b_g_BP = new JButton("Графік брутто-прибутку");
	JLabel Pusto;

	JLabel l_l = new JLabel("Відстань від заводу до магазину:");
	JTextField t_l = new JTextField("6.2");
	JLabel l_a = new JLabel("Вартість транспортування 1 тони:");
	JTextField t_a = new JTextField("1.1");
	JLabel l_n = new JLabel("Кількість видів сировини, товарів:");
	JTextField t_n = new JTextField("1");
	JLabel l_m = new JLabel("Маса одного виробу:");
	JTextField t_m = new JTextField("2.4");
	JLabel l_p = new JLabel("Кількість потенційних покупців:");
	JTextField t_p = new JTextField("1005000");
	JLabel l_cm = new JLabel("Число професій, спеціальностей:");
	JTextField t_cm = new JTextField("1");
	JLabel l_z = new JLabel("Середньомісячна заробітня плата:");
	JTextField t_z = new JTextField("160");
	JLabel l_b = new JLabel("Соціальні фонди:");
	JTextField t_b = new JTextField("0.34");
	JLabel l_N = new JLabel("Кількість працівників:");
	JTextField t_N = new JTextField("4");
	JLabel l_d = new JLabel("Плата за оренду грн/вк.м за міс.:");
	JTextField t_d = new JTextField("2.6");
	JLabel l_s = new JLabel("Площа орендованого приміщення:");
	JTextField t_s = new JTextField("110");
	JLabel l_y = new JLabel("Загальна ставка податку:");
	JTextField t_y = new JTextField("1.2");
	JLabel l_k = new JLabel("Вартість основного капіталу:");
	JTextField t_k = new JTextField("110000");
	JLabel l_с = new JLabel("Середня ціна товару:");
	JTextField t_с = new JTextField("25");
	JLabel l_j = new JLabel("Ставка податку із обороту:");
	JTextField t_j = new JTextField("28");

	double K1_1 = 1.375;
	double K1_2 = 1.375;
	double K1_3 = 1.175;
	double K1_4 = 1.05;
	double K1_5 = 1.05;

	double K2_1 = 1.225;
	double K2_2 = 1.225;
	double K2_3 = 1.1;
	double K2_4 = 1.025;
	double K2_5 = 1.225;

	double K3_1 = 1.45;
	double K3_2 = 1.45;
	double K3_3 = 1.2;
	double K3_4 = 1;
	double K3_5 = 1;

	double K4_1 = 1;
	double K4_2 = 1;
	double K4_3 = 1;
	double K4_4 = 1;
	double K4_5 = 0.35;

	double K5_1 = 0.35;
	double K5_2 = 0.35;
	double K5_3 = 0.125;
	double K5_4 = 0.0375;
	double K5_5 = 0.125;

	double K6_1 = 0.125;
	double K6_2 = 0.125;
	double K6_3 = 0.145;
	double K6_4 = 0.175;
	double K6_5 = 0.145;
	
	////
	
	double Q1 = 0;
	double D1 = 0;
	double B1 = 0;
	double B2 = 0;
	double B3 = 0;
	double B4 = 0;
	double B5 = 0;
	
	double Q2 = 0;
	double D2 = 0;
	double B1_1 = 0;
	double B2_1 = 0;
	double B3_1 = 0;
	double B4_1 = 0;
	double B5_1 = 0;
	
	double Q3 = 0;
	double D3 = 0;
	double B1_2 = 0;
	double B2_2 = 0;
	double B3_2 = 0;
	double B4_2 = 0;
	double B5_2 = 0;

	double Q4 = 0;
	double D4 = 0;
	double B1_3 = 0;
	double B2_3 = 0;
	double B3_3 = 0;
	double B4_3 = 0;
	double B5_3 = 0;
	
	double Q5 = 0;
	double D5 = 0;
	double B1_4 = 0;
	double B2_4 = 0;
	double B3_4 = 0;
	double B4_4 = 0;
	double B5_4 = 0;
	
	double BP1,BP2,BP3,BP4,BP5;
	
	////
	
	static  double[] Result = new double[5];
	static double[] Result1 = new double[5];
	static double[] Result2 = new double[5];
	static double[] Result3 = new double[5];
	static double[] Result4 = new double[5];

	static double[] Result_0 = new double[5];
 

	eHandler handler = new eHandler();
 

	public Vilnuy(String s) {
		super(s);

		vilnuy.setVisible(true);
		vilnuy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		vilnuy.setSize(950, 500);
		vilnuy.setResizable(false);
		vilnuy.setLocationRelativeTo(null);

		Pusto = new JLabel("");
		Pusto.setBounds(10, 10, 10, 10);

		b_nazad.setBounds(850, 0, 100, 20);
		vilnuy.add(b_nazad);

		Analith.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
		Analith.setForeground(Color.red);
		Analith.setBounds(70, 350, 800, 50);
		vilnuy.add(Analith);

		b_g_vutpatu.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
		b_g_vutpatu.setForeground(Color.red);
		// b_g_vutpatu.setBounds(70, 400, 266, 50);
		vilnuy.add(b_g_vutpatu);

		b_g_prubytok.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
		b_g_prubytok.setForeground(Color.red);
		// b_g_prubutok.setBounds(336, 400, 267, 50);
		vilnuy.add(b_g_prubytok);

		b_g_BP.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 15));
		b_g_BP.setForeground(Color.red);
		// b_g_BP.setBounds(603, 400, 267, 50);
		vilnuy.add(b_g_BP);

		l_l.setBounds(40, 5, 250, 20);
		t_l.setBounds(300, 5, 80, 20);

		l_a.setBounds(40, 45, 250, 20);
		t_a.setBounds(300, 45, 80, 20);

		l_n.setBounds(40, 85, 250, 20);
		t_n.setBounds(300, 85, 80, 20);

		l_m.setBounds(40, 125, 250, 20);
		t_m.setBounds(300, 125, 80, 20);

		l_p.setBounds(40, 165, 250, 20);
		t_p.setBounds(300, 165, 80, 20);

		l_cm.setBounds(40, 205, 250, 20);
		t_cm.setBounds(300, 205, 80, 20);

		l_z.setBounds(40, 245, 250, 20);
		t_z.setBounds(300, 245, 80, 20);

		l_b.setBounds(40, 285, 250, 20);
		t_b.setBounds(300, 285, 80, 20);
		//
		l_N.setBounds(490, 5, 250, 20);
		t_N.setBounds(750, 5, 80, 20);

		l_d.setBounds(490, 45, 250, 20);
		t_d.setBounds(750, 45, 80, 20);

		l_s.setBounds(490, 85, 250, 20);
		t_s.setBounds(750, 85, 80, 20);

		l_y.setBounds(490, 125, 250, 20);
		t_y.setBounds(750, 125, 80, 20);

		l_k.setBounds(490, 165, 250, 20);
		t_k.setBounds(750, 165, 80, 20);

		l_с.setBounds(490, 205, 250, 20);
		t_с.setBounds(750, 205, 80, 20);

		l_j.setBounds(490, 245, 250, 20);
		t_j.setBounds(750, 245, 80, 20);

		vilnuy.add(l_l);
		vilnuy.add(t_a);

		vilnuy.add(l_n);
		vilnuy.add(t_l);

		vilnuy.add(l_a);
		vilnuy.add(t_n);

		vilnuy.add(l_m);
		vilnuy.add(t_m);

		vilnuy.add(l_p);
		vilnuy.add(t_p);

		vilnuy.add(l_cm);
		vilnuy.add(t_cm);

		vilnuy.add(l_z);
		vilnuy.add(t_z);

		vilnuy.add(l_b);
		vilnuy.add(t_b);

		vilnuy.add(l_N);
		vilnuy.add(t_N);

		vilnuy.add(l_d);
		vilnuy.add(t_d);

		vilnuy.add(l_s);
		vilnuy.add(t_s);

		vilnuy.add(l_y);
		vilnuy.add(t_y);

		vilnuy.add(l_k);
		vilnuy.add(t_k);

		vilnuy.add(l_с);
		vilnuy.add(t_с);

		vilnuy.add(l_j);
		vilnuy.add(t_j);

		vilnuy.add(Pusto);

		Analith.addActionListener(handler);
		b_nazad.addActionListener(handler);
		b_g_vutpatu.addActionListener(handler);
		b_g_prubytok.addActionListener(handler);
		b_g_BP.addActionListener(handler);

	}

	double metod_Q(double P, double K5, double K6, double M, double Q) {
		Q = ((P * K6 * K5 * M) / 1000);
		// System.out.println("Q "+ Q);
		return Q;
	}

	double metod_D(double c, double K5, double K6, double P, double D) {
		D = P * K6 * K5 * c;
		// System.out.println("D "+ D);
		return D;
	}

	double metod_B1(double K1, double n, double a, double l, double Q, double B1) {
		B1 = K1 * n * a * l * Q;
		// System.out.println("B1 "+ B1);
		return B1;
	}

	double metod_B2(double K2, double m, double z, double b, double N, double B2) {
		B2 = K2 * m * z * b * N;
		// System.out.println("B2 "+ B2);
		return B2;
	}

	double metod_B3(double K3, double d, double s, double B3) {
		B3 = K3 * d * s * 12;
		// System.out.println("B3 "+ B3);
		return B3;
	}

	double metod_B4(double K4, double k, double y, double B4) {
		B4 = K4 * k * y / 100;
		// System.out.println("B4 "+ B4);
		return B4;
	}

	double metod_B5(double K4, double d, double j, double B5) {
		B5 = K4 * d * j / 100;
		// System.out.println("B5 "+ B5);
		return B5;
	}



	public void vutpatu(double B1, double B2, double B3, double B4, double B5,
			 double b1_1, double b2_1, double b3_1, double b4_1,
			double b5_1,  double b1_2, double b2_2, double b3_2,
			double b4_2, double b5_2, double b1_3, double b2_3,
			double b3_3, double b4_3, double b5_3,  double b1_4,
			double b2_4, double b3_4, double b4_4, double b5_4)
			throws IOException {
		 

		Result[0] = B1;
		Result[1] = B2;
		Result[2] = B3;
		Result[3] = B4;
		Result[4] = B5;
 

		Result1[0] = b1_1;
		Result1[1] = b2_1;
		Result1[2] = b3_1;
		Result1[3] = b4_1;
		Result1[4] = b5_1;
 

		Result2[0] = b1_2;
		Result2[1] = b2_2;
		Result2[2] = b3_2;
		Result2[3] = b4_2;
		Result2[4] = b5_2;
 

		Result3[0] = b1_3;
		Result3[1] = b2_3;
		Result3[2] = b3_3;
		Result3[3] = b4_3;
		Result3[4] = b5_3;
 

		Result4[0] = b1_4;
		Result4[1] = b2_4;
		Result4[2] = b3_4;
		Result4[3] = b4_4;
		Result4[4] = b5_4;
 

		Chart chart = new ChartBuilder().chartType(ChartType.Bar).width(800)
				.height(600).title("Залежність витрат та  брутто-прибутку")
				.xAxisTitle(" Витрати").yAxisTitle("Грн.").build();

		chart.addSeries("Елітний район", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result);
		chart.addSeries("Центральний район", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result1);
		chart.addSeries("Розвинений район", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result2);
		chart.addSeries("Звичайний район", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result3);
		chart.addSeries("Вільна. екон. зона", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result4);
 

		chart.getStyleManager().setLegendPosition(LegendPosition.InsideNW);
		new SwingWrapper(chart).displayChart();
		BitmapEncoder.savePNGWithDPI(chart, "./Витрати.png", 400);

	}
	
	public void prubytok(double D1, double D2, double D3, double D4, double D5)
			throws IOException {
		 

		Result[0] = D1;
		Result[1] = D2;
		Result[2] = D3;
		Result[3] = D4;
		Result[4] = D5;
	
		

		Chart chart = new ChartBuilder().chartType(ChartType.Bar).width(800)
				.height(600).title("Залежність витрат та брутто-прибутку")
				.xAxisTitle("Прибуток").yAxisTitle("Грн.").build();

		chart.addSeries("Прибуток", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result);
 
 
 
		chart.getStyleManager().setLegendPosition(LegendPosition.InsideNW);
		new SwingWrapper(chart).displayChart();
		BitmapEncoder.savePNGWithDPI(chart, "./Прибуток.png", 400);

	}

	public void BP(double BP1, double BP2, double BP3, double BP4, double BP5)
			throws IOException {
		 

		Result[0] = BP1;
		Result[1] = BP2;
		Result[2] = BP3;
		Result[3] = BP4;
		Result[4] = BP5;
	
	 
		
		Result_0[0] = 0;
		Result_0[1] = 0;
		Result_0[2] = 0;
		Result_0[3] = 0;
		Result_0[4] = 0;
		

		Chart chart = new ChartBuilder().chartType(ChartType.Bar).width(800)
				.height(600).title("Залежність витрат та брутто-прибутку")
				.xAxisTitle("Брутто-прибуток").yAxisTitle("Грн.").build();

		chart.addSeries( " ", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result_0);
		chart.addSeries("Брутто-прибуток", new double[] { 0, 1, 2, 3, 4 },
				Vilnuy.Result );
 
 
		chart.getStyleManager().setLegendPosition(LegendPosition.InsideNW);
		new SwingWrapper(chart).displayChart();
		BitmapEncoder.savePNGWithDPI(chart, "./Брутто-прибуток.png", 400);

	}

	public class eHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				if (e.getSource() == b_nazad) {

					new Menu1("");
					// vilnuy.setVisible(false);
				}
				if (e.getSource() == Analith) {

					Double d_a = new Double(t_a.getText());
					Double d_l = new Double(t_l.getText());
					Double d_n = new Double(t_n.getText());
					Double d_m = new Double(t_m.getText());
					Double d_p = new Double(t_p.getText());
					Double d_cm = new Double(t_cm.getText());
					Double d_z = new Double(t_z.getText());
					Double d_b = new Double(t_b.getText());
					Double d_N = new Double(t_N.getText());
					Double d_d = new Double(t_d.getText());
					Double d_s = new Double(t_s.getText());
					Double d_y = new Double(t_y.getText());
					Double d_k = new Double(t_k.getText());
					Double d_c = new Double(t_с.getText());
					Double d_j = new Double(t_j.getText());

					// System.out.println("Підприємство знаходиться в елітному районі:");
 

					Q1 = metod_Q(d_p, K5_1, K6_1, d_m, Q1);
					D1 = metod_D(d_c, K5_1, K6_1, d_p, D1);
					B1 = metod_B1(K1_1, d_n, d_a, d_l, Q1, B1);
					B2 = metod_B2(K2_1, d_m, d_z, d_b, d_N, B2);
					B3 = metod_B3(K3_1, d_d, d_s, B3);
					B4 = metod_B4(K4_1, d_k, d_y, B4);
					B5 = metod_B5(K5_1, D1, d_j, B5);

					  BP1 = D1 - (B1 + B2 + B3 + B4 + B5);

					// System.out.println("Підприємство знаходиться в центральному районі:");
 

					Q2 = metod_Q(d_p, K5_2, K6_2, d_m, Q2);
					D2 = metod_D(d_c, K5_2, K6_2, d_p, D2);
					B1_1 = metod_B1(K1_2, d_n, d_a, d_l, Q2, B1_1);
					B2_1 = metod_B2(K2_2, d_m, d_z, d_b, d_N, B2_1);
					B3_1 = metod_B3(K3_2, d_d, d_s, B3_1);
					B4_1 = metod_B4(K4_2, d_k, d_y, B4_1);
					B5_1 = metod_B5(K5_2, D2, d_j, B5_1);

					 BP2 = D2 - (B1_1 + B2_1 + B3_1 + B4_1 + B5_1);

					// System.out.println("Підприємство знаходиться в районі з розвиненою інфраструктурою:");
 	

					Q3 = metod_Q(d_p, K5_3, K6_3, d_m, Q3);
					D3 = metod_D(d_c, K5_3, K6_3, d_p, D3);
					B1_2 = metod_B1(K1_3, d_n, d_a, d_l, Q3, B1_2);
					B2_2 = metod_B2(K2_3, d_m, d_z, d_b, d_N, B2_2);
					B3_2 = metod_B3(K3_3, d_d, d_s, B3_2);
					B4_2 = metod_B4(K4_3, d_k, d_y, B4_2);
					B5_2 = metod_B5(K5_3, D3, d_j, B5_2);

					 BP3 = D3 - (B1_2 + B2_2 + B3_2 + B4_2 + B5_2);

					// System.out.println("Підприємство знаходиться в звичайному районі:");


					Q4 = metod_Q(d_p, K5_4, K6_4, d_m, Q4);
					D4 = metod_D(d_c, K5_4, K6_4, d_p, D4);
					B1_3 = metod_B1(K1_4, d_n, d_a, d_l, Q4, B1_3);
					B2_3 = metod_B2(K2_4, d_m, d_z, d_b, d_N, B2_3);
					B3_3 = metod_B3(K3_4, d_d, d_s, B3_3);
					B4_3 = metod_B4(K4_4, d_k, d_y, B4_3);
					B5_3 = metod_B5(K5_4, D4, d_j, B5_3);

					  BP4 = D4 - (B1_3 + B2_3 + B3_3 + B4_3 + B5_3);

					// System.out.println("Підприємство знаходиться в вільній економічній зоні:");


					Q5 = metod_Q(d_p, K5_5, K6_5, d_m, Q5);
					D5 = metod_D(d_c, K5_5, K6_5, d_p, D5);
					B1_4 = metod_B1(K1_5, d_n, d_a, d_l, Q5, B1_4);
					B2_4 = metod_B2(K2_5, d_m, d_z, d_b, d_N, B2_4);
					B3_4 = metod_B3(K3_5, d_d, d_s, B3_4);
					B4_4 = metod_B4(K4_5, d_k, d_y, B4_4);
					B5_4 = metod_B5(K5_5, D5, d_j, B5_4);

					 BP5 = D5 - (B1_4 + B2_4 + B3_4 + B4_4 + B5_4);
 

					double a[] = { BP1, BP2, BP3, BP4, BP5 };
					double s;

					String t = "";

					for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 4; j++) {
							if (a[j] < a[j + 1]) {
								s = a[j];
								a[j] = a[j + 1];
								a[j + 1] = s;
							}
						}
					}

					for (int i = 0; i < 5; i++) {
						for (int j = 0; j < 5; j++) {
							t = t + a[j] + "    ";
						}
						t = t + "\n ";
					}

					// JOptionPane.showMessageDialog(null, t);

					if (a[1] == BP1) {
						JOptionPane
								.showMessageDialog(null,
										"Найкращим місцем розташування є елітний район");
					}
					if (a[1] == BP2) {
						JOptionPane
								.showMessageDialog(null,
										"Найкращим місцем розташування є центральний район");
					}
					if (a[1] == BP3) {
						JOptionPane
								.showMessageDialog(null,
										"Найкращим місцем розташування є район з розвиненою інфрастуктурою");
					}
					if (a[1] == BP4) {
						JOptionPane
								.showMessageDialog(null,
										"Найкращим місцем розташування є звичаний район");
					}
					if (a[1] == BP5) {
						JOptionPane
								.showMessageDialog(null,
										"Найкращим місцем розташування є район з вільною економічною зоною");
					}

					b_g_vutpatu.setBounds(70, 400, 266, 50);
					b_g_prubytok.setBounds(336, 400, 267, 50);
					b_g_BP.setBounds(603, 400, 267, 50);

				}
				if (e.getSource() == b_g_vutpatu) {
					vutpatu(B1, B2, B3, B4, B5, B1_1, B2_1, B3_1, B4_1,
							B5_1, B1_2, B2_2, B3_2, B4_2, B5_2,B1_3,
							B2_3, B3_3, B4_3, B5_3,B1_4, B2_4, B3_4,
							B4_4, B5_4);
				}
				if (e.getSource() == b_g_prubytok) {
					prubytok(D1, D2, D3, D4, D5 );
				}
				if (e.getSource() == b_g_BP) {
					BP(BP1, BP2, BP3, BP4, BP5 );
				}

			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "System error");

			}
		}

	}

}