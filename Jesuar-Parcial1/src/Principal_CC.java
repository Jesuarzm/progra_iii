import java.util.ArrayList;
import java.util.Scanner;

public class Principal_CC {

    static String[][] sizeCinema =  new String[10][10];
    static Scanner datoIngresado = new Scanner(System.in);
    static ArrayList<Character> myAbc = new ArrayList<Character>();
    static String asientoSolicitado;
    
    public static void vaciarCine(){
    for (int i = 0; i < sizeCinema.length; i++) {
        for (int j = 0; j < sizeCinema[i].length; j++) {
            sizeCinema[i][j] = "✓";
            }
        }
    }
    //Fucnion que creo un array con el abecedarion 
    public static ArrayList<Character> createAbc(){
        int letrasAbc= 26;
        for(int i = 0; i < letrasAbc; i++){
            //Agremamos las letras del abecedario
            myAbc.add((char)('A'+i));
        }
        return myAbc;
    }
    /*public static void mostrarAsientos() {
        for (int i = 0; i < sizeCinema.length; i++) {
			//Ciclo Para Mostrar Filas
			System.out.print("\n[ "+ myAbc.get(i) +" ]");
			for (int j = 1; j <= sizeCinema.length; j++) {
				//Ciclo para mostar Columnas
				System.out.print("[ "+myAbc.get(i)+j+" "+sizeCinema[i][j-1]+" ]");
			}
		}
		System.out.println();
	}*/
    public static void main(String[] args){
        
        vaciarCine();
        createAbc();
        for (int i = 0; i < sizeCinema.length; i++) {
			//Ciclo Para Mostrar Filas
			System.out.print("\n[ "+ myAbc.get(i) +" ]");
		}
    }
    
}
