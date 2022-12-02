public class App extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numerosPar eje1 = new numerosPar();
        Thread h1 = new Thread(eje1);
        
		h1.start();
		numerosImpares eje2 = new numerosImpares();
        Thread h2 = new Thread(eje2);
		h2.start();
	}

}

