
public class Nodo {
	
	String dato;
	Nodo siguiente;
	
	public Nodo(String d, Nodo sig) {
		dato = d;
		siguiente = sig;
	}
	public Nodo(String d) {
		dato = d;
		siguiente=null;
	}
}
