package DR.Muhalskuy01;

import javax.swing.JFrame;
 
public class App 
{
    public static void main( String[] args )
    {
		Reader r = new Reader("Diploma0.1");

		r.setVisible(true);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(950, 500);
		r.setResizable(false);
		r.setLocationRelativeTo(null);
    }
}
