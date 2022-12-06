import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Ventana extends JFrame{
    public static Font mainfont = new Font("Arial", Font.BOLD, 16);
    
    public static JLabel lblBienvenida = new JLabel("Bienvenido. Indicar numero de cuenta y pin");

    public static JLabel lblUsuario = new JLabel("Cuenta");
    public static JTextField tfUsuario =  new JTextField();

    public static JLabel lblPassword = new JLabel("Pin");
    public static JPasswordField tfpassword =  new JPasswordField();


    public static JButton btnNum0 = new JButton("0");
    public static JButton btnNum1 = new JButton("1");
    public static JButton btnNum2 = new JButton("2");
    public static JButton btnNum3 = new JButton("3");
    public static JButton btnNum4 = new JButton("4");
    public static JButton btnNum5 = new JButton("5");
    public static JButton btnNum6 = new JButton("6");
    public static JButton btnNum7 = new JButton("7");
    public static JButton btnNum8 = new JButton("8");
    public static JButton btnNum9 = new JButton("9");

    public static JButton btnacceder = new JButton("ENTER");
    public static JButton btnclear = new JButton("CLEAR");
    public static JButton btncancelar = new JButton("CANCEL");
    public static JButton btnavacio1 = new JButton(" ");
    public static JButton btnavacio2 = new JButton(" ");
    public static JButton btnavacio3 = new JButton(" ");
    
    public static void inicioSesionCuenta() {

        Ventana loginCuenta = new Ventana();
        //Configuracion Panel Superior
        JPanel northPane = new JPanel();
        northPane.setLayout(new GridLayout(3,1,0,5));
        northPane.setFont(mainfont);
        northPane.setOpaque(false);
        lblBienvenida.setFont(mainfont);
        northPane.add(lblBienvenida);

        lblUsuario.setFont(mainfont);
        northPane.add(lblUsuario);

        tfUsuario.setFont(mainfont);
        northPane.add(tfUsuario);
             
        //Configuracion Panel Inferiro
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4,4,5,5));
        centerPanel.setOpaque(false);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        centerPanel.add(btnNum7);
        centerPanel.add(btnNum8);
        centerPanel.add(btnNum9);
        btncancelar.setBackground(new Color(255,0,0));
        centerPanel.add(btncancelar);
        centerPanel.add(btnNum4);
        centerPanel.add(btnNum5);
        centerPanel.add(btnNum6);
        btnclear.setBackground(new Color(255,255,0));
        centerPanel.add(btnclear);
        centerPanel.add(btnNum1);
        centerPanel.add(btnNum2);
        centerPanel.add(btnNum3);
        btnacceder.setBackground(new Color(0,255,0));
        centerPanel.add(btnacceder);
        centerPanel.add(btnavacio1);
        centerPanel.add(btnNum0);
        centerPanel.add(btnavacio2);
        centerPanel.add(btnavacio3);

        //Configurarcion del Panel Principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(northPane, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        
        //Configuracion del JFrame
        loginCuenta.add(mainPanel);
        loginCuenta.setTitle("Inicio Sesion");
        loginCuenta.setSize(400,300);
        loginCuenta.setResizable(false);
        loginCuenta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginCuenta.setVisible(true);
       
        btnacceder.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                loginCuenta.dispose();
                inicioSesionPin();
            }
         });
         btnNum0.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "0";
                    tfUsuario.setText(usrData);
                
            }
         });
    }
    
    public static void inicioSesionPin() {

        Ventana loginPin = new Ventana();
        //Configuracion Panel Superior
        JPanel northPane = new JPanel();
        northPane.setLayout(new GridLayout(3,1,0,5));
        northPane.setFont(mainfont);
        northPane.setOpaque(false);
        lblBienvenida.setFont(mainfont);
        northPane.add(lblBienvenida);

        lblPassword.setFont(mainfont);
        northPane.add(lblPassword);

        tfpassword.setFont(mainfont);
        northPane.add(tfpassword);
             
        //Configuracion Panel Inferiro
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4,4,5,5));
        centerPanel.setOpaque(false);
        centerPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        centerPanel.add(btnNum7);
        centerPanel.add(btnNum8);
        centerPanel.add(btnNum9);
        btncancelar.setBackground(new Color(255,0,0));
        centerPanel.add(btncancelar);
        centerPanel.add(btnNum4);
        centerPanel.add(btnNum5);
        centerPanel.add(btnNum6);
        btnclear.setBackground(new Color(255,255,0));
        centerPanel.add(btnclear);
        centerPanel.add(btnNum1);
        centerPanel.add(btnNum2);
        centerPanel.add(btnNum3);
        btnacceder.setBackground(new Color(0,255,0));
        centerPanel.add(btnacceder);
        centerPanel.add(btnavacio1);
        centerPanel.add(btnNum0);
        centerPanel.add(btnavacio2);
        centerPanel.add(btnavacio3);

        //Configurarcion del Panel Principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(northPane, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        
        //Configuracion del JFrame
        loginPin.add(mainPanel);
        loginPin.setTitle("Inicio Sesion");
        loginPin.setSize(400,300);
        loginPin.setResizable(false);
        loginPin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        loginPin.setVisible(true);
       
        btnacceder.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswEncrip = tfpassword.getPassword();
                String pswSimple ="";
                for(int i = 0; i< pswEncrip.length; i++){
                    pswSimple += pswEncrip[i];
                }
                if(Usuarios.consultarUsuariosIndividual(lblUsuario.getText(), pswSimple) == true){
                    loginPin.dispose();
                    JOptionPane.showMessageDialog(mainPanel, "Inicio Correcot");
                }
            }
         });
         btnNum0.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "0";
                    tfUsuario.setText(usrData);
                
            }
         });
    }
    
    
    public static void crearCuenta() {

        Ventana crearUsuario = new Ventana();
        
        //Configuracion de panel Superior
        JPanel northPane = new JPanel();
        northPane.setLayout(new GridLayout(10,1,5,0));
        northPane.setFont(mainfont);
        northPane.setOpaque(false);
        
        JLabel lblnombre = new JLabel("Nombre:");
        lblnombre.setFont(mainfont);
        northPane.add(lblnombre);
        JTextField tfNombre = new JTextField();
        tfNombre.setFont(mainfont);
        northPane.add(tfNombre);

        JLabel lblapellido = new JLabel("Apellido:");
        lblapellido.setFont(mainfont);
        northPane.add(lblapellido);
        JTextField tfApellido = new JTextField();
        tfApellido.setFont(mainfont);
        northPane.add(tfApellido);

            JLabel llbfecha = new JLabel("Fecha Nacimento:");
            llbfecha.setFont(mainfont);
            northPane.add(llbfecha);

            JPanel fechaPane = new JPanel();
            fechaPane.setLayout(new GridLayout(2,3,5,0));
            JLabel lbldia = new JLabel("Dia");
            lbldia.setFont(mainfont);
            fechaPane.add(lbldia);

            JLabel lblmes = new JLabel("Mes");
            lblmes.setFont(mainfont);
            fechaPane.add(lblmes);
            
            JLabel lblaño = new JLabel("Año");
            lblaño.setFont(mainfont);
            fechaPane.add(lblaño);
            

            JTextField dia = new JTextField();
            dia.setFont(mainfont);
            fechaPane.add(dia);
            JTextField mes = new JTextField();
            mes.setFont(mainfont);
            fechaPane.add(mes);
            JTextField año = new JTextField();
            año.setFont(mainfont);
            fechaPane.add(año);

            northPane.add(fechaPane);
            
        lblPassword.setFont(mainfont);
        northPane.add(lblPassword);

        tfpassword.setFont(mainfont);
        northPane.add(tfpassword);

        JLabel lblPassConfirm = new JLabel("Confirmar Pin");
        lblPassConfirm.setFont(mainfont);
        northPane.add(lblPassConfirm);

        JPasswordField pfPassConfirm = new JPasswordField();
        pfPassConfirm.setFont(mainfont);
        northPane.add(pfPassConfirm);

        //Configurar Panel Inferior
        JPanel southPane = new JPanel();
        southPane.setLayout(new GridLayout(1,2,5,5));
        southPane.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        southPane.add(btnacceder);
        southPane.add(btncancelar);

        //Configurar Main Panel
        JPanel mainPane = new JPanel();
        mainPane.setLayout(new BorderLayout());
        mainPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPane.add(northPane, BorderLayout.NORTH);
        mainPane.add(southPane, BorderLayout.SOUTH);

        crearUsuario.add(mainPane);
        crearUsuario.setTitle("Crear Usuario");
        crearUsuario.setSize(400,550);
        crearUsuario.setResizable(false);
        crearUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        crearUsuario.setVisible(true);

        btnacceder.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char [] pswdEncriptada = tfpassword.getPassword();
                char [] pswdVerification = pfPassConfirm.getPassword();
                if(Arrays.equals(pswdEncriptada, pswdVerification)){
                    String pswPin= "";
                    for(int i = 0; i< pswdEncriptada.length; i++){
                        pswPin+=pswdEncriptada[i];
                    }
                    Usuarios.agregarUsuario(
                        lblnombre.getText(),
                        lblapellido.getText(),
                        lbldia.getText()+lblmes.getText()+lblaño.getText(),
                        pswPin
                    );
                }
                crearUsuario.dispose();
                inicioSesionCuenta();
            }
         });

    }
}
