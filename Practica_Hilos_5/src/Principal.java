
public class Principal extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pares eje1 = new pares();
		eje1.start();
		impares eje2 = new impares();
		eje2.start();
	}

}
