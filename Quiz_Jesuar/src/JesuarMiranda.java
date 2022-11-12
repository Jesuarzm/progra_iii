import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JesuarMiranda {
	//Definimos las listas de 2 dimnesiones a usar
	public static List<List<String>> listaEstudiantes = new ArrayList<List<String>>();
	public static List<List<String>> listaLibros = new ArrayList<List<String>>();
	public static List<List<String>> listaPrestamos = new ArrayList<List<String>>();
	//Definimos la entrada de datos por parte del usario por consola
	public static Scanner datosIngresador = new Scanner(System.in);
	public static void main(String[] args) {
		//Agregamos un libro y un estudiante de ejemplo
		defautlItems();
		try {
			//Creamos el menu de inicion
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
				datosIngresador.nextLine();
				//Dependiento la opcion de usuario se ejecutra el submenu 
				//Agregar un libro
				if (opcionMenu == 1){
					System.out.println("Por favor ingrese el carnter del estudiante a mostrar:");
					verEstudiante(datosIngresador.next());
				}
				//Agregar un libro
				if (opcionMenu == 2){
					System.out.println("Por favor ingre el nombre del libro");
					String nombre = datosIngresador.nextLine();
					System.out.println("Por favor ingre la editorial del libro");
					String editorial = datosIngresador.nextLine();
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
		if(listaLibros.size() != 0){
			System.out.println("Libros en estanteria: "+ listaLibros.size());
			for(int i = 0; i < listaLibros.size(); i++){
				System.out.println(listaLibros.get(i).get(0)+": "+listaLibros.get(i).get(1)+" - "+listaLibros.get(i).get(3)); 
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
		if(listaLibros.size() != 0){
			System.out.println("Ingrese el ISBN del libro a busca");
			String buscarLibro = datosIngresador.next();
			for(int i = 0; i < listaLibros.size(); i++){
				if(!listaLibros.get(i).get(2).equals(buscarLibro) && listaLibros.size() == i+1){
					System.out.println("Libro no existe en sistema");
					esperarUsuario();
				}
				if(listaLibros.get(i).get(2).equals(buscarLibro)){
					System.out.println(listaLibros.get(i).get(1)+
					": "+listaLibros.get(i).get(2)+
					" - "+listaLibros.get(i).get(3)+
					" - "+ listaLibros.get(i).get(4)); 
					esperarUsuario();
				}
			}
		}
	}
	private static void verPrestamos() {
		if(listaPrestamos.size() != 0){
			System.out.println("Libros prestados: "+ listaPrestamos.size());
			for(int i = 0; i < listaPrestamos.size(); i++){
				System.out.println(listaPrestamos.get(i).get(0)+" = "
				+"Libro: "+listaPrestamos.get(i).get(1)
				+" - "+listaPrestamos.get(i).get(2)
				+"\n Carnet= "+listaPrestamos.get(i).get(5)
				+"\n Dueño= "+listaPrestamos.get(i).get(6)
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
		int indexPrestamos = listaPrestamos.size();
		System.out.println("¿Que libro van a prestar?");
		verEstanteria();
		System.out.println("Ingrese el numero de libro:");
		String libroPrestado = datosIngresador.next();
		for(int i = 0; i < listaLibros.size();i++){
			if(!listaLibros.get(i).get(0).equals(libroPrestado) && listaLibros.size() == i+1){
				System.out.println("El libro que deseas prestar no existe");
				esperarUsuario();
			}
			if(listaLibros.get(i).get(0).equals(libroPrestado)){
				System.out.println("¿A quien se le espresta el libro?");
				estudiantesRegistrados();
				System.out.println("Ingresa el carnet del estudiante");
				String id = datosIngresador.next();
				for(int j = 0; j < listaEstudiantes.size(); j++){
					if(!listaEstudiantes.get(j).get(0).equals(id) && listaEstudiantes.size() == j){
						System.out.println("El estudia que ingresaste no existe");
						esperarUsuario();
					}
					if(listaEstudiantes.get(j).get(0).equals(id)){
						//Trasladamos el libro a la lista de prestados
						listaPrestamos.add(new ArrayList<String>());
						listaPrestamos.get(indexPrestamos).add(String.valueOf(indexPrestamos));
						listaPrestamos.get(indexPrestamos).add(listaLibros.get(i).get(1));
						listaPrestamos.get(indexPrestamos).add(listaLibros.get(i).get(2));
						listaPrestamos.get(indexPrestamos).add(listaLibros.get(i).get(3));
						listaPrestamos.get(indexPrestamos).add(listaLibros.get(i).get(4));
						listaPrestamos.get(indexPrestamos).add(listaEstudiantes.get(j).get(0));
						listaPrestamos.get(indexPrestamos).add(listaEstudiantes.get(j).get(1));
						//Removemos el libro de la estanteria
						listaLibros.remove(i);
						ordenarLibros();
						System.out.println("Libro prestado! Vuelve pronto.");
						esperarUsuario();
					}
				}
				
			}

		}
	}
	private static void eliminarLibro(String isbn_libro) {
		if(listaLibros.size() != 0){
			for(int i = 0; i < listaLibros.size(); i++){
				if(!listaLibros.get(i).get(3).equals(isbn_libro) && listaLibros.size() == i+1){
					System.out.println("Libro que desea borrar no existe");
					esperarUsuario();				
				}
				if(listaLibros.get(i).get(3).equals(isbn_libro)){
					listaLibros.remove(i);
					ordenarLibros();
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
		int index = listaLibros.size();
		listaLibros.add(new ArrayList<String>());
		listaLibros.get(index).add(String.valueOf(listaLibros.size()));
		listaLibros.get(index).add(nombre);
		listaLibros.get(index).add(editorial);
		listaLibros.get(index).add(isbn);
		listaLibros.get(index).add(año);
		System.out.println("Libro Agregado con exito!");
		esperarUsuario();
	}
	private static void verEstudiante(String carnet) {
		for(int i = 0; i < listaEstudiantes.size(); i++){
			if(!listaEstudiantes.get(i).get(0).equals(carnet) && listaEstudiantes.size() == i+1){
				System.out.println("Estudiante no existe en sistema..");
				esperarUsuario();
			}
			if(listaEstudiantes.get(i).get(0).equals(carnet)){
				System.out.println("Estudiante Encontrado");
				System.out.println(
					"Carnet : "+listaEstudiantes.get(i).get(0)+
					"\nNombre : "+listaEstudiantes.get(i).get(1)+
					"\nTelefono : "+listaEstudiantes.get(i).get(2)
				);
				System.out.println(listaEstudiantes.get(i).size());
				esperarUsuario();
			}
		}
	}
	public static void estudiantesRegistrados(){
		if(listaEstudiantes.size() != 0){
			System.out.println("Estudiantes registrados: "+ listaEstudiantes.size());
			for(int i = 0; i < listaEstudiantes.size(); i++){
				System.out.println(listaEstudiantes.get(i).get(0)+" = "+listaEstudiantes.get(i).get(1)); 
			} 
			esperarUsuario();
		}else{
			System.out.println("No hay estudiantes registrados");
			esperarUsuario();
		}
	}
	public static void defautlItems(){
		//Creamos un nuevo estudiante
		listaEstudiantes.add(new ArrayList<String>());
		//Agremos el Carnet
		listaEstudiantes.get(0).add("155822558001");
		//Agremamos el nombre
		listaEstudiantes.get(0).add("Jesuar Miranda");
		//Agregamos el telegono
		listaEstudiantes.get(0).add("84092380");

		//Creamos un nuebo libro
		listaLibros.add(new ArrayList<String>());
		//Agregmos el index del libro
		listaLibros.get(0).add("1");
		//Agregamos el nombre del libro
		listaLibros.get(0).add("Clean Code");
		//Agregamos la editorial
		listaLibros.get(0).add("ANAYA MULTIMEDIA ");
		//Agregamos el ISBN
		listaLibros.get(0).add("9780132350884");
		//Agregamos el año de publicacion
		listaLibros.get(0).add("2012");
	}
	public static void ordenarLibros(){
		if(listaLibros.size() != 0){
			for(int i = 0; i < listaLibros.size(); i++){
				listaLibros.get(i).set(0, String.valueOf(i+1));
			}
		}else{
			System.out.println("No hay libros que acomodar");
			esperarUsuario();
		}

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
