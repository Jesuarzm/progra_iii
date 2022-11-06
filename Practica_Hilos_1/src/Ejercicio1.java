import java.util.*;

public class Ejercicio1 implements Runnable{

	Scanner dato = new Scanner(System.in);
	String n,d;
	double h;
	
	public Ejercicio1(String nombre, String dia, double hora) {
		n=nombre;
		d=dia;
		h=hora;
		
		System.out.println("Ingrese el nombre del empleado: ");
		n=dato.nextLine();
		System.out.println("Ingrese el dia: ");
		d=dato.nextLine();
		System.out.println("Ingrese la hora");
		h=dato.nextDouble();
	}
	public void run() {
		if (h > 8.00) {
			System.out.println(n+ " llego tarde el dia "+ d);
		}else {
			System.out.println(n+" llego temprano el dia " + d);
		}
	}
	public static void main(String[] args){
		
		Ejercicio1 usr1 = new Ejercicio1("","",0);
		Thread t1 = new Thread(usr1);
		
		Ejercicio1 usr2 = new Ejercicio1("","",0);
		Thread t2 = new Thread(usr2);
		t1.start(); 
		t2.start(); 
	}

}
