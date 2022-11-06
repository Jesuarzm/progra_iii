import javax.security.sasl.AuthenticationException;

public class Hilos implements Runnable{
	
	String equipo="";
	public Hilos(String eq) {
		equipo = eq;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("Gol de equipo: " + equipo);
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
		}
	}
	//Sin Hilos Forma Lineal
	/*public static void main(String[] args) {
		
		Hilos p1 = new Hilos("Saprissa");
		Hilos p2 = new Hilos("La Liga");
		
		p1.run();
		p2.run();
	}*/
	public static void main(String[] args) {
		
		Hilos p1 = new Hilos("Saprissa");
		Hilos p2 = new Hilos("La Liga");
		
		Runnable r1 = p1;
		Runnable r2 = p2;
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}

}
