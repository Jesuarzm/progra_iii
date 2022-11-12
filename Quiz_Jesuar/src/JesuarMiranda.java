import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JesuarMiranda {
	
	public static List<List<String>> Estudiantes = new ArrayList<List<String>>();
	public static List<List<String>> Libros = new ArrayList<List<String>>();
	public static List<List<String>> Prestamos = new ArrayList<List<String>>();
	public static Scanner datosIngresador = new Scanner(System.in);
	public static void main(String[] args) {
		defautlItems();
		try {
			while(true){
				System.out.println("Bienvenido a la biblioteca");
				System.out.println("Que deseas hacer?");
				System.out.println("1. Ver estudiante"+
				"\n2. Agregar un libro"+
				"\n3. Eliminar un Libro"+
				"\n4. Prestar un Libro"+
				"\n5. Ver libros prestados"+
				"\n6. Ver informacion de un libro"+
				"\n7. Ver estanteria completa");

				int opcionMenu = datosIngresador.nextInt();

				if (opcionMenu == 1){
					System.out.println("Por favor ingrese el carnter del estudiante a mostrar:");
					verEstudiante(datosIngresador.next());
				}
				if (opcionMenu == 2){
					System.out.println("Por favor ingre el nombre del libro");
					String nombre = datosIngresador.next();
					System.out.println("Por favor ingre la editorial del libro");
					String editorial = datosIngresador.next();
					System.out.println("Por favor ingre el ISBN del libro");
					String isbn = datosIngresador.next();
					System.out.println("Por favor ingre el año del libro");
					String año = datosIngresador.next();
					agregarLibro(nombre, editorial, isbn, año);
				}
				if (opcionMenu == 3){
					System.out.println("Por favor ingrese el ISBN del libro a borrar:");
					eliminarLibro(datosIngresador.next());
				}
				if (opcionMenu == 4){
					prestarLibro();
				}
				if (opcionMenu == 5){
					verPrestamos();
				}
				if (opcionMenu == 6){
					verLibro();
				}
				if (opcionMenu == 7){
					verEstanteria();
				}
			}
		} catch (Exception e) {
			
		}
		
	}
	private static void verEstanteria() {
		if(Libros.size() != 0){
			System.out.println("Libros en estanteria: "+ Libros.size());
			for(int i = 0; i < Libros.size(); i++){
				System.out.println(Libros.get(i).get(0)+": "+Libros.get(i).get(1)+" - "+Libros.get(i).get(3)); 
			} 
			esperarUsuario();
		}else{
			System.out.println("No hay libros");
			esperarUsuario();
		}
	}
	/**
	 * 
	 */
	private static void verLibro() {
		if(Libros.size() != 0){
			System.out.println("Ingrese el ISBN del libro a busca");
			String buscarLibro = datosIngresador.next();
			for(int i = 0; i < Libros.size(); i++){
				if(!Libros.get(i).get(2).equals(buscarLibro) && Libros.size() == i+1){
					System.out.println("Libro no existe en sistema");
					esperarUsuario();
				}
				if(Libros.get(i).get(2).equals(buscarLibro)){
					System.out.println(Libros.get(i).get(1)+
					": "+Libros.get(i).get(2)+
					" - "+Libros.get(i).get(3)+
					" - "+ Libros.get(i).get(4)); 
					esperarUsuario();
				}
			}
		}
	}
	private static void verPrestamos() {
		if(Prestamos.size() != 0){
			System.out.println("Libros prestados: "+ Prestamos.size());
			for(int i = 0; i < Prestamos.size(); i++){
				System.out.println(Prestamos.get(i).get(0)+" = "
				+"Libro: "+Prestamos.get(i).get(1)
				+" - "+Prestamos.get(i).get(2)
				+"\n Carnet= "+Prestamos.get(i).get(5)
				+"\n Dueño= "+Prestamos.get(i).get(6)
				); 
				System.out.println();
			} 
			esperarUsuario();
		}else{
			System.out.println("No hay libros prestados");
			esperarUsuario();
		}
	}
	private static void prestarLibro() {
		int indexPrestamos = Prestamos.size();
		System.out.println("¿Que libro van a prestar?");
		verEstanteria();
		System.out.println("Ingrese el numero de libro:");
		String libroPrestado = datosIngresador.next();
		for(int i = 0; i < Libros.size();i++){
			if(!Libros.get(i).get(0).equals(libroPrestado) && Libros.size() == i+1){
				System.out.println("El libro que deseas prestar no existe");
				esperarUsuario();
			}
			if(Libros.get(i).get(0).equals(libroPrestado)){
				System.out.println("¿A quien se le espresta el libro?");
				estudiantesRegistrados();
				System.out.println("Ingresa el carnet del estudiante");
				String id = datosIngresador.next();
				for(int j = 0; j < Estudiantes.size(); j++){
					if(!Estudiantes.get(j).get(0).equals(id) && Estudiantes.size() == j){
						System.out.println("El estudia que ingresaste no existe");
						esperarUsuario();
					}
					if(Estudiantes.get(j).get(0).equals(id)){
						//Trasladamos el libro a la lista de prestados
						Prestamos.add(new ArrayList<String>());
						Prestamos.get(indexPrestamos).add(String.valueOf(indexPrestamos));
						Prestamos.get(indexPrestamos).add(Libros.get(i).get(1));
						Prestamos.get(indexPrestamos).add(Libros.get(i).get(2));
						Prestamos.get(indexPrestamos).add(Libros.get(i).get(3));
						Prestamos.get(indexPrestamos).add(Libros.get(i).get(4));
						Prestamos.get(indexPrestamos).add(Estudiantes.get(j).get(0));
						Prestamos.get(indexPrestamos).add(Estudiantes.get(j).get(1));
						//Removemos el libro de la estanteria
						Libros.remove(i);
						System.out.println("Libro prestado! Vuelve pronto.");
					}
				}
				
			}

		}
	}
	private static void eliminarLibro(String isbn_libro) {
		if(Libros.size() != 0){
			for(int i = 0; i < Libros.size(); i++){
				if(!Libros.get(i).get(3).equals(isbn_libro) && Libros.size() == i+1){
					System.out.println("Libro que desea borrar no existe");
					esperarUsuario();
					break;
				}
				if(Libros.get(i).get(3).equals(isbn_libro)){
					Libros.remove(i);
					System.out.println("Libro borrado con exito");
					esperarUsuario();
				}
			} 
		}else{
			System.out.println("No hay libros para borrar");
			esperarUsuario();
		}
	}
	private static void agregarLibro(String nombre, String editorial, String isbn, String año) {
		int index = Libros.size();
		Libros.add(new ArrayList<String>());
		Libros.get(index).add(String.valueOf(Libros.size()));
		Libros.get(index).add(nombre);
		Libros.get(index).add(editorial);
		Libros.get(index).add(isbn);
		Libros.get(index).add(año);
		System.out.println("Libro Agregado con exito!");
		esperarUsuario();
	}
	private static void verEstudiante(String carnet) {
		for(int i = 0; i < Estudiantes.size(); i++){
			if(!Estudiantes.get(i).get(0).equals(carnet) && Estudiantes.size() == i+1){
				System.out.println("Estudiante no existe en sistema..");
				esperarUsuario();
			}
			if(Estudiantes.get(i).get(0).equals(carnet)){
				System.out.println("Estudiante Encontrado");
				System.out.println(
					"Carnet : "+Estudiantes.get(i).get(0)+
					"\nNombre : "+Estudiantes.get(i).get(1)+
					"\nTelefono : "+Estudiantes.get(i).get(2)
				);
				System.out.println(Estudiantes.get(i).size());
				esperarUsuario();
			}
		}
	}
	public static void estudiantesRegistrados(){
		if(Estudiantes.size() != 0){
			System.out.println("Estudiantes registrados: "+ Estudiantes.size());
			for(int i = 0; i < Estudiantes.size(); i++){
				System.out.println(Estudiantes.get(i).get(0)+" = "+Estudiantes.get(i).get(1)); 
			} 
			esperarUsuario();
		}else{
			System.out.println("No hay estudiantes registrados");
			esperarUsuario();
		}
	}
	public static void defautlItems(){
		//Creamos un nuevo estudiante
		Estudiantes.add(new ArrayList<String>());
		//Agremos el Carnet
		Estudiantes.get(0).add("155822558001");
		//Agremamos el nombre
		Estudiantes.get(0).add("Jesuar Miranda");
		//Agregamos el telegono
		Estudiantes.get(0).add("84092380");

		//Creamos un nuebo libro
		Libros.add(new ArrayList<String>());
		//Agregmos el index del libro
		Libros.get(0).add("1");
		//Agregamos el nombre del libro
		Libros.get(0).add("Clean Code");
		//Agregamos la editorial
		Libros.get(0).add("ANAYA MULTIMEDIA ");
		//Agregamos el ISBN
		Libros.get(0).add("9780132350884");
		//Agregamos el año de publicacion
		Libros.get(0).add("2012");
	}
	public static void esperarUsuario(){
		Scanner scanner = new Scanner(System.in);
		String entrada  ="";
		System.out.println("Presiones Enter para continuar...");
		do{
			entrada  = scanner.nextLine();
			System.out.println(entrada);
		}
		while(!entrada.equals("")); 
	}
}
