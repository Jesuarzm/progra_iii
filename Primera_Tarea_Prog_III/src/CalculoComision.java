import java.util.ArrayList;
import java.util.Scanner;

public class CalculoComision {
public static void main(String[] args) {
		
		ArrayList<String> ListaEmpleados = new ArrayList<String>();
		Scanner leer = new Scanner(System.in);
		
		boolean existe=false;
		String usuario = "";
		int lujo,estandar,oferta;
		int comision = 0;
		
		ListaEmpleados.add("Pedro");
		ListaEmpleados.add("Ana");
		ListaEmpleados.add("Teresa");
		ListaEmpleados.add("Pablo");
		ListaEmpleados.add("Mauricio");
		ListaEmpleados.add("Gerardo");
		ListaEmpleados.add("Paula");
		ListaEmpleados.add("Saul");
		ListaEmpleados.add("Jose");
		ListaEmpleados.add("Maria");
		ListaEmpleados.add("Abigail");
		ListaEmpleados.add("Ricardo");
		ListaEmpleados.add("Fabricio");
		ListaEmpleados.add("Pepe");
		ListaEmpleados.add("Lucia");

		System.out.println("Indique el nombre de usuario a usar:");
		System.out.println(ListaEmpleados);
		
		do {
			usuario = leer.nextLine();
			for (int i = 0; i < ListaEmpleados.size(); i++) {
				
				if (ListaEmpleados.get(i).equals(usuario)) {
					System.out.println("Bienvenido "+ usuario);
					existe=true;
					break;
				}
				if (i == ListaEmpleados.size()-1 && !ListaEmpleados.get(i).equals(usuario)) {
					System.out.println("Usuario no existe, intente otra vez.");
				}
				
			}
		} while (existe == false);
		System.out.println("Por favor indicar la cantidad de productos de Lujo vendidos");
		lujo = leer.nextInt();
		for (int i = 1; i <= lujo; i++) {
			System.out.println("Indicar el precio del prodcuto #" + i);
			comision += (leer.nextInt()*0.04);
		}
		System.out.println("Por favor indicar la cantidad de productos de Estandar vendidos");
		estandar = leer.nextInt();
		for (int i = 1; i <= estandar; i++) {
			System.out.println("Indicar el precio del prodcuto #" + i);
			comision += (leer.nextInt()*0.03);
		}
		System.out.println("Por favor indicar la cantidad de productos de Oferta vendidos");
		oferta = leer.nextInt();
		for (int i = 1; i <= oferta; i++) {
			System.out.println("Indicar el precio del prodcuto #" + i);
			comision += (leer.nextInt()*0.01);
		}
		System.out.println("La comision de ventas es de: " + comision + " para el usuario: " + usuario);
	}
}
