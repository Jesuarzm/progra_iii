import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entradaDatos = new Scanner(System.in);
        String abcedario[] = {
            "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","0","1","2","3","4","5","6","7","8","9"
        };
        int num[] = {0,1,2,3,4,5,6,7,8,9};
        do{
            System.out.println("Ingrese opcion:"+ "\n1.Codificar palabra"+"\n 2. Salir");
            int opcion = entradaDatos.nextInt();
            if(opcion == 1){    
                System.out.println("Ingresa una palabra");
                String palabara = entradaDatos.next();
                int tamañoPalabra = palabara.length();
                String codificado = "";
                for(int i = 0; i < tamañoPalabra; i++){
                    for(int j = 0; j < abcedario.length; j++){
                        if(abcedario[j].equals(String.valueOf(palabara.charAt(i)))){
                            codificado+=j;
                        }
                    }
                } 
                System.out.println("Palabra codificada");
                System.out.println(codificado);
            }if(opcion != 1){
                System.exit(0);
            }
        }while(true);
    }
}
