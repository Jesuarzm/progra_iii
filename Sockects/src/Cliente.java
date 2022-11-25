import javax.swing.*;
import javax.xml.crypto.Data;

import java.awt.event.*;
import java.io.IOException;
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
		JLabel texto= new JLabel("Cliente");
		add(texto);
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
				DataOutputStream flujo_salida = new DataOutputStream(miSocket.getOutputStream());
				flujo_salida.writeUTF(campo1.getText());
				flujo_salida.close();
				miSocket.close();
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	}
	private JTextField campo1;
	private JButton miboton;
	
}