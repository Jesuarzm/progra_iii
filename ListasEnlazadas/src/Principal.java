
public class Principal {

	public static void main(String[] args) {
		
		Lista miLista = new Lista();
		
		miLista.agregandoAlInicio("Final");
		miLista.agregandoAlInicio("Ana");
		miLista.agregandoAlInicio("Tere");
		miLista.agregandoAlInicio("Pedro");
		miLista.agregandoAlInicio("Pedro");
		miLista.agregandoAlInicio("Inicio");
		miLista.agregandoAlInicio("Inicio2");
		miLista.agregandoAlInicio("Jose");
		miLista.agregandoAlInicio("Rosario");
		miLista.agregandoAlInicio("Tito");
		miLista.agregandoAlInicio("Lucy");
		miLista.agregandoAlInicio("Final2");
		
		miLista.mostrarLista();
		
		if(miLista.estaVacia()) {
			System.out.println("\nLa lista esta vacia");
		}else{
			System.out.println("\nLa lista contiena datos");
		}

		System.out.println("\nLa cantidad de datos en la lista es de: "+miLista.cantidadNodos());

	}

}
