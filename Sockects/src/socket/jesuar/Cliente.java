package socket.jesuar;

import javax.swing.*;
import javax.xml.crypto.Data;

import java.awt.event.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;
import java.io.DataOutputStream;

public class Cliente {

	public static void main(String[] args) {
		MarcoCliente mimarco = new MarcoCliente();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
class MarcoCliente extends JFrame{
	
	public MarcoCliente() {
		setBounds(600,300,280,350);
		LaminaMarcoCliente miLamina = new LaminaMarcoCliente();
		add(miLamina);
		setVisible(true);
	}
}
class LaminaMarcoCliente extends JPanel{
	public LaminaMarcoCliente() {
		nick = new JTextField(5);
		add(nick);
		
		JLabel texto= new JLabel("- CHAT -");
		add(texto);
		campochat = new JTextArea();
		add(campochat);
		
		ip = new JTextField(8);
		add(ip);
		
		campo1 = new JTextField(20);
		add(campo1);
		miboton = new JButton("Enviar");
		EnviaTexto mievento = new EnviaTexto();
		miboton.addActionListener(mievento);
		add(miboton);
	}
	private class EnviaTexto implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//System.out.println("Funciona");
			//System.out.println(campo1.getText());
			try {
				Socket miSocket = new Socket("10.23.0.208", 9999);
				
				PaqueteEnvio datos = new PaqueteEnvio();
				datos.setNick(nick.getText());
				datos.setIp(ip.getText());
				datos.setMensaje(campo1.getText());
				
				ObjectOutputStream paquete_datos = new ObjectOutputStream(miSocket.getOutputStream());
				paquete_datos.writeObject(datos);
				miSocket.close();
				/*DataOutputStream flujo_salida = new DataOutputStream(miSocket.getOutputStream());
				flujo_salida.writeUTF(campo1.getText());
				flujo_salida.close();*/
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	private JTextField campo1, nick,ip;
	private JButton miboton;
	private JTextArea campochat;
	
	public class PaqueteEnvio implements Serializable{
		private String nick, ip, mensaje;

		public String getNick() {
			return nick;
		}

		public void setNick(String nick) {
			this.nick = nick;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getMensaje() {
			return mensaje;
		}

		public void setMensaje(String mensaje) {
			this.mensaje = mensaje;
		}
		
	}
}