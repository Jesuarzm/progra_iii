import java.util.Scanner;

public class principal {

	public static Scanner datosIngresados = new Scanner(System.in);
    
    public static void main(String[] args) {
		
		try {
			while(true){

				System.out.println("Seleccione que desea hacer: "+"\n1. Consultar Todos Usuarios 2.Consultar Usuario Especifico");
				int opcionMenu = datosIngresados.nextInt();
				if (opcionMenu == 1) {
					Consultores.consultarUsuarios();
				}
				if (opcionMenu == 2){
					System.out.println("Ingrese el id de Usuario:");
					Consultores.consultarUsuariosIndividual(datosIngresados.nextInt());
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
