import java.lang.Math;
import javax.swing.JOptionPane;


public class JesuarMiranda {
	
	public static void main(String[] args) throws InterruptedException {
		//Definimos las variables a usar
		//Generamos un numero random para la cantidad de Clientes
		int numeroClientes = (int) (Math.random() * 50);

		float tiempoTrabajoCajero=0,tiempoOcupacion=0;
		int tiempoCliente=0,minutos = 0,segundos= 0;

		//Lanzamos un Ventana para Escoger la la velocidad de simulacion
		int velocidad= JOptionPane.showOptionDialog(null, "Simulacion Cajero", "Seleccione velocidad de simulacion",
				   JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Real", "x2", "x3", "x4" },"opcion 1");
		//Lanzamos otra ventana para definir los horas de trabajo del Cajero
		String horasCajero = JOptionPane.showInputDialog(null,"Ingrese horas del trabajo del Cajero",JOptionPane.QUESTION_MESSAGE);
		
		//Creamos una condicional switch para definir el tiempo de emulacion 
		switch(velocidad) {
			case 0:
				velocidad=1000;
				System.out.println("Velocidad de simulacion: Real");
				break;
			case 1:
				velocidad=100;
				System.out.println("Velocidad de simulacion: x2");
				break;
			case 2:
				velocidad=10;
				System.out.println("Velocidad de simulacion: x3");
				break;
			case 3:
				velocidad=1;
				System.out.println("Velocidad de simulacion: x4");
				break;
		}
		//Imprimimos la cantoda de clientes generados por consola
		System.out.println("Cantidad de clientes del día: " + numeroClientes);
		
		//Creamos el ciclo de emulacion que depente del tiempo de emulacion
		for (int i = 1; i <= numeroClientes; i++) {
			//Usamos la funicion para generar un timpo aleatorio entre 1 min y 3 min 
			tiempoCliente = generateTime();
			//Usamos el ThreardSleep para hacer las pausas 
			Thread.sleep(tiempoCliente * velocidad);
			//Convertios el tiempo generado a minutos y segundos
			tiempoTrabajoCajero = tiempoTrabajoCajero + tiempoCliente;
			minutos = tiempoCliente / 60;
			segundos = tiempoCliente % 60;
			//Imprimos el tiempo que tardo el cliente en cola
			System.out.println("Cliente numero " + i + " tardo: " + minutos + " minutos y " + segundos + " segundos en la fila");
		}
		//Imprimimos por consola los resulatdos de la simulacion
		System.out.println("Cajero trabajo: "+ ((int) tiempoTrabajoCajero/60)+" minutos");
		System.out.println("Tiempo Cajero Libre: "+ ((int) ((Float.parseFloat(horasCajero) * 3600) - tiempoTrabajoCajero)/60)+" minutos");
		tiempoOcupacion = ((tiempoTrabajoCajero / (Float.parseFloat(horasCajero) * 3600)) * 100);
		System.out.println("Porcentage de ocupacion del ATM: "+ (String.format("%.2f", tiempoOcupacion)) +"%");
	}
	//Funcion generar tiempo aleatorio en segundos
	public static int generateTime() {
		int range = (180 - 60) + 1;
		return (int)(Math.random() * range) + 60;
	}

}
