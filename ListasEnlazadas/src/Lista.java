
public class Lista {

	Nodo inicio,fin;
	int cont=0;
	
	public Lista() {
		inicio = null;
		fin=null;
	}
	public boolean estaVacia() {
		return inicio==null;
	}
	public void agregandoAlInicio(String d) {
		cont++;
		if (estaVacia()) {
			inicio = new Nodo(d,inicio);
			fin=inicio;
		}else{
			inicio = new Nodo(d,inicio);
		}
	}
	public void agregandoAlFinal(String d) {
		cont++;
		if(estaVacia()) {
			inicio=new Nodo(d);
			fin=inicio;
		}else{
			fin.siguiente = new Nodo(d);
			fin= fin.siguiente;
		}
	}
	public void mostrarLista() {
		Nodo aux=inicio;
		while (aux!=null) {
			System.out.print("["+aux.dato+"]-->");
			aux=aux.siguiente;
		}
	}
	public int cantidadNodos() {
		return cont;
	}
}
