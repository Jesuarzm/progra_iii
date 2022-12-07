import javax.swing.JOptionPane;

public class numerosImpares implements Runnable{
	public void run() {		
		for (int n = 1; n <= 10; n++) {
			int c= n%2;
			if (c!=0) {
				JOptionPane.showMessageDialog(null, "Impares: " + n);
			}
		}
	}
}
