
public class pares extends Thread{

	public void run() {
		int n;
		int contador = 0;
		
		for (n = 1; n <= 10; n++) {
			if (n%2 == 0) {
				System.out.println(""+n+"\n");
				contador = contador +n;
			}
		}
		System.out.println("La suma de los pares es: "+contador+"\n");
		System.out.println("******************\n");
	}
}
