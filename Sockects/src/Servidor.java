import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.*;
public class Servidor {
	public static void main(String[] args) {
		MarcoServidor miMarco = new MarcoServidor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoServidor<areatexto> extends JFrame implements Runnable{
	public MarcoServidor() {
		setBounds(1200,300,280,350);
		JPanel milamina = new JPanel();
		areatexto = new JTextArea();
		milamina.add(areatexto,BorderLayout.CENTER);
		add(milamina);
		setVisible(true);
		Thread mihilo = new Thread(this);
		mihilo.start();
	}
	
	private JTextArea areatexto;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("Estoy esperando datos...");
		try {
			ServerSocket servidor = new ServerSocket(9999);
			while(true) {
				Socket miSocket = servidor.accept();
				
				DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());
				String mensaje_texto = flujo_entrada.readUTF();
				areatexto.append("\n"+mensaje_texto);
				miSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
