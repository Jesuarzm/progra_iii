import java.util.Iterator;

public class Ejercicio2 extends Thread{

	public void run() {
		for (int num = 1; num <= 20; num++) {
			System.out.println(""+num+"");
			try {
				sleep(1500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2 ejer = new Ejercicio2();
		ejer.start();
	}

}
