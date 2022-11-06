import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		int indexlastItem = 0;
		ArrayList<String> miLista = new ArrayList<String>();
		
		miLista.add("Tere");
		miLista.add("Andre");
		miLista.add("3");
		miLista.add("4");
		miLista.add("Pablo");
		miLista.add("Uno");

		System.out.println("Lista Original");
		System.out.println(miLista);
		
		indexlastItem = miLista.size();
		String valuelastItem = miLista.get(indexlastItem-1);
		
		for (int i = miLista.size()-1; i >= 0; i--) {
			if(i==0) {
				miLista.set(i,valuelastItem);
			}else {
			miLista.set(i,miLista.get(i-1));
			}
		}
		System.out.println("Lista Con el Ultimo Valor al Inicio");
		System.out.println(miLista);
	}

}
