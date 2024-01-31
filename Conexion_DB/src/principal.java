
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class principal {

	public static Scanner datosIngresados = new Scanner(System.in);
    
    public static void main(String[] args) {
		
		try {
            while(true){

				System.out.println("Seleccione que desea hacer: "+"\n1. Consultar Todos Usuarios 2.Consultar Usuario Especifico 3. Nuevo Usuario 4. Modificar Usuario 5. Borrar Usuario");
				int opcionMenu = datosIngresados.nextInt();
                datosIngresados.nextLine();
				if (opcionMenu == 1) {
					Usuario.consultarUsuarios();
				}
				if (opcionMenu == 2){
					System.out.println("Ingrese el id de Usuario:");
					Usuario.consultarUsuariosIndividual(datosIngresados.nextInt());
				}
                if(opcionMenu ==3 ){
                    System.out.println("Ingrese el Id");
                    int id = datosIngresados.nextInt();

                    System.out.println("Ingrese el Nombre");
                    String nombre = datosIngresados.next();

                    System.out.println("Ingrese el Apellido");
                    String apellido = datosIngresados.next();

                    System.out.println("Ingrese la fecha nacimiento: Año/Mes/Dia"+ "\n Ejemplo: 2001/09/17");
                    String fecha = datosIngresados.next();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                    LocalDate dateN = LocalDate.parse(fecha, formatter);
                    

                    System.out.println("Ingrese la Ciudad");
                    String ciudad = datosIngresados.next();

                    System.out.println("Ingrese el numero de telefono");
                    int cel = datosIngresados.nextInt();

                    DataBase.insertarUsuario(id, nombre, apellido, dateN, ciudad, cel);
                }
                if(opcionMenu == 4){
                    System.out.println("Por ingrese el Id del usuario a modifcar:");
                    int true_id = datosIngresados.nextInt();

                    System.out.println("Ingrese el Id");
                    int id = datosIngresados.nextInt();

                    System.out.println("Ingrese el Nombre");
                    String nombre = datosIngresados.next();

                    System.out.println("Ingrese el Apellido");
                    String apellido = datosIngresados.next();

                    System.out.println("Ingrese la fecha nacimiento: Año/Mes/Dia"+ "\n Ejemplo: 2001/09/17");
                    String date = datosIngresados.next();
                    

                    System.out.println("Ingrese la Ciudad");
                    String ciudad = datosIngresados.next();

                    System.out.println("Ingrese el numero de telefono");
                    int cel = datosIngresados.nextInt();

                    Usuario.modificarUsuario(true_id, id, nombre, apellido, date, ciudad, cel);
                }
                if(opcionMenu == 5){
                    System.out.println("Porfavor ingrese el Id del usuario a borrar");
                    Usuario.borrarUsuario(datosIngresados.nextInt());
                }
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
