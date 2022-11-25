package socket.jesuar;

import javax.swing.*;

import socket.jesuar.LaminaMarcoCliente.PaqueteEnvio;

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
			
			String nick, ip, mensaje;
			
			PaqueteEnvio paquete_recibido;
			
			while(true) {
				Socket miSocket = servidor.accept();
				ObjectInputStream paquete_datos = new ObjectInputStream(miSocket.getInputStream());
				paquete_recibido = (PaqueteEnvio) paquete_datos.readObject();
				/*DataInputStream flujo_entrada = new DataInputStream(miSocket.getInputStream());
				String mensaje_texto = flujo_entrada.readUTF();
				areatexto.append("\n"+mensaje_texto);*/
				miSocket.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
