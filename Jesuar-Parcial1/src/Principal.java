import java.util.Scanner;

public class Principal {

	//Inicializacion de Lista de Asientos
	static String[][] CineArray = new String[10][10];
	static char[] filas = {'A','B','C','D','E','F','G','H',
	'I','J','K','L','M','N','O','P','Q','R','S','T'};
			
	public static void main(String[] args) {
		
		String asiento;
		//Otorgar todos los asientos vacios
		for (int i = 0; i < CineArray.length; i++) {
			for (int j = 0; j < CineArray[i].length; j++) {
				CineArray[i][j] = "✓";
			}
		}
		
		try (Scanner datos = new Scanner(System.in)) {
			mostrarAsientos();
			do {
				System.out.println("Por favor indicar asiento a usar:");
				asiento = datos.nextLine();
				if (asiento.length() <= 2) {
					for (int i = 0; i < CineArray.length; i++) {
						if (asiento.charAt(0) == filas[i] && CineArray[i][Character.getNumericValue(asiento.charAt(1))-1] == "x" ) {
							System.out.println("Espacio ocupado ");
							break;
						}
						if (asiento.charAt(0) == filas[i] && CineArray[i][Character.getNumericValue(asiento.charAt(1))-1] == "✓" ) {
							CineArray[i][Character.getNumericValue(asiento.charAt(1))-1]= "x";
						}
					}
				}else {
					int suma2digitos = Character.getNumericValue(asiento.charAt(1)+asiento.charAt(2));
					for (int i = 0; i < filas.length; i++) {
						if (asiento.charAt(0) == filas[i] && CineArray[i][Character.getNumericValue(asiento.charAt(1))-1] == "x" ) {
							System.out.println("Espacio ocupado ");
							break;
						}
						if (asiento.charAt(0)== filas[i] && CineArray[i][Character.getNumericValue(asiento.charAt(1))-1] == "✓") {
							CineArray[i][suma2digitos-1]= "x";
						}
					}
				}
				mostrarAsientos();
				/*for (int i = 0; i < CineArray.length; i++) {
					for (int j = 0; j < CineArray[i].length; j++) {
						System.out.print("\n"+CineArray[i][j] +" "+ i +" "+ j );
					}
				}*/

			} while (true);
		}
	}
	public static void mostrarAsientos() {
		for (int i = 0; i < CineArray.length; i++) {
			//Ciclo Para Mostrar Filas
			System.out.print("\n[ "+ filas[i] +" ]");
			for (int j = 1; j <= CineArray.length; j++) {
				//Ciclo para mostar Columnas
				System.out.print("[ "+filas[i]+j+" "+CineArray[i][j-1]+" ]");
			}
		}
		System.out.println();
	}

}
