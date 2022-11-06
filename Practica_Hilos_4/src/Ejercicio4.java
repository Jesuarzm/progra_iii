
public class Ejercicio4 extends Thread{

	String nombre;
	
	public Ejercicio4(int prioridad, String Nombre) {
		this.nombre = Nombre;
		setPriority(prioridad);
	}
	public void run() {
		for (int c = 1; c <= 30; c++) {
			System.out.println(c+"mt");
			Thread.yield();
		}
		
		System.out.println("\nLLego a la meta "+nombre);
	}
	static Ejercicio4 liebre;
	static Ejercicio4 conejo;
	static Ejercicio4 tortuga;
	
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		Ejercicio4 conejo = new Ejercicio4(1, "con");
		Ejercicio4 liebre = new Ejercicio4(5, "lie");
		Ejercicio4 tortuga = new Ejercicio4(8,"tor");
		
		conejo.start();
		liebre.start();
		tortuga.start();
		conejo.join();
		liebre.join();
		tortuga.join();
	}

}
