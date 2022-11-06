import java.util.ArrayList;
import java.util.Scanner;

public class ContarPalabrasArray {
		
	public void contarPalabras() {
		
		ArrayList<String> miLista = new ArrayList<String>();

		String oracion;
		String sumasChar = "";
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese una oracion");
		oracion = leer.nextLine();
		
		System.out.println(oracion.length());

		for (int i = 0; i < oracion.length(); i++) {
			if(oracion.charAt(i)!=' ') {
				sumasChar += oracion.charAt(i);
			}
			if (oracion.charAt(i) == ' ' || i == oracion.length()-1) {
				miLista.add(sumasChar);
				sumasChar="";	
			}
				
		}
		System.out.println(miLista);
		System.out.println("La cantidad de palabras es: " + miLista.size());
	}
	
}
