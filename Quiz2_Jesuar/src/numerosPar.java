import javax.swing.JOptionPane;

public class numerosPar implements Runnable{

	public void run() {
		
		
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				JOptionPane.showMessageDialog(null, "Pares: " + i);
			}
		}
	}
}


