import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio3 extends Thread{
	
	Scanner dato = new Scanner(System.in);
	String nombre;
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el nombre del atleta: ");
		nombre = dato.next();
		for (int c = 0; c <=30; c++) {
			System.out.println(c+"km");
			try {
				sleep(3500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Llego a la meta");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio3 eje = new Ejercicio3();
		eje.start();
	}

}
