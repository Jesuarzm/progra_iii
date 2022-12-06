import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame{
    
    public static JLabel lblBienvenida = new JLabel("Bienvenido. Inicia tu usuario y contraseña");

    public static JLabel lblUsuario = new JLabel("\nUsuario");
    public static JTextField tfUsuario =  new JTextField(20);

    public static JLabel lblPassword = new JLabel("Contraseña");
    public static JPasswordField tfpassword =  new JPasswordField(20);

    public static JButton btnacceder = new JButton("Acceder");
    public static JButton btncancelar = new JButton("Salir");
    
    public void inicioSesion() {

        //Configuracion Panel Superior
        JPanel northPane = new JPanel();
        northPane.setLayout(new GridLayout(5,1,5,5));
        northPane.setOpaque(false);
        northPane.add(lblBienvenida);
        northPane.add(lblUsuario);
        northPane.add(tfUsuario);
        northPane.add(lblPassword);
        northPane.add(tfpassword);
        
        //Configuracion Panel Inferiro
        JPanel sourthPanel = new JPanel();
        sourthPanel.setLayout(new GridLayout(1,2,5,5));
        sourthPanel.setOpaque(false);
        sourthPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        sourthPanel.add(btnacceder);
        sourthPanel.add(btncancelar);

        //Configurarcion del Panel Principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(northPane, BorderLayout.CENTER);
        mainPanel.add(sourthPanel, BorderLayout.SOUTH);
        
        //Configuracion del JFrame
        add(mainPanel);
        setTitle("Inicio Sesion");
        setSize(400,200);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
        btnacceder.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                 btnAceptarEvent(e);
            }
         }); 
         
    }

    public static void btnAceptarEvent(ActionEvent e) {

    }
}
