import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class Principal_CC {

    static String[][] Cinepolis =  new String[10][10];
    static Scanner datoIngresado = new Scanner(System.in);
    static ArrayList<Character> myAbc = new ArrayList<Character>();
    static String asientoSolicitado;
    
    //Instrccion que llena el cine con asientos "Vacios"
    public static void vaciarCine(){
    for (int i = 0; i < Cinepolis.length; i++) {
        for (int j = 0; j < Cinepolis[i].length; j++) {
            Cinepolis[i][j] = "✓";
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
    //Instruccion que permite ver los asientos
    public static void mostrarAsientos() {
        for (int i = 0; i < Cinepolis.length; i++) {
			//Ciclo Para Mostrar Filas
			System.out.print("\n[ "+ myAbc.get(i) +" ]");
			for (int j = 1; j <= Cinepolis.length; j++) {
				//Ciclo para mostar Columnas
				System.out.print("[ "+myAbc.get(i)+j+" "+Cinepolis[i][j-1]+" ]");
			}
		}
		System.out.println();
	}
    public static void validacionAsiento(String asientoIngresado){
        try{
            //Separar los datos ingresados entre letra y numero
            char letter = asientoIngresado.charAt(0);
            int number = Character.getNumericValue(asientoIngresado.charAt(1)) - 1;

            //Cilco que busca la posicion a verficar
            for(int i=0; i < Cinepolis.length ; i++){
                //Si dectecta que la posicion esta en uso retorna un "Error"
                if( letter == myAbc.get(i) && Cinepolis[i][number] == "x"){
                    System.out.println("Asiento ocupado, intente con otro.");
                    break;
                }
                //Si la posicion esta libre la toma
                if(letter == myAbc.get(i)){
                    Cinepolis[i][number]="x";
                }   
            }

        }catch (Exception exception){

        }
        
    }
    public static void main(String[] args){
        
        createAbc();
        vaciarCine();
        do{
        mostrarAsientos();
        System.out.println("Por favor indicar asiento a usar:");
        asientoSolicitado = datoIngresado.nextLine();
        validacionAsiento(asientoSolicitado);
        }while(true);
    }
    
}
