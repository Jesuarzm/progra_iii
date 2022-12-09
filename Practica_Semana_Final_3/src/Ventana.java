import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Ventana extends JFrame{
    public static Font mainfont = new Font("Arial", Font.BOLD, 16);
    public static JTextField tfUsuario = new JTextField();
    public static JPasswordField tfpassword = new JPasswordField();

    public static void inicioSesionCuenta() {

        Ventana loginCuenta = new Ventana();
        //Configuracion Panel Superior
        JPanel panelCuenta = new JPanel();
        panelCuenta.setLayout(new GridLayout(3,1,0,5));
        panelCuenta.setFont(mainfont);
        panelCuenta.setOpaque(false);
        JLabel lblBienvenida = new JLabel("Bienvnido Al BAC");
        lblBienvenida.setFont(mainfont);
        panelCuenta.add(lblBienvenida);

        JLabel lblUsuario = new JLabel("Ingrese su numero de cuenta");
        lblUsuario.setFont(mainfont);
        panelCuenta.add(lblUsuario);

        
        tfUsuario.setFont(mainfont);
        panelCuenta.add(tfUsuario);
             
        //Configuracion Panel Inferiro
        JPanel panelTeclado = new JPanel();
        panelTeclado.setLayout(new GridLayout(4,4,5,5));
        panelTeclado.setOpaque(false);
        panelTeclado.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        JButton btnNum7 = new JButton("7");
        panelTeclado.add(btnNum7);
        JButton btnNum8 = new JButton("8");
        panelTeclado.add(btnNum8);
        JButton btnNum9 = new JButton("9");
        panelTeclado.add(btnNum9);
        JButton btncancelar = new JButton("CANCEL");
        btncancelar.setBackground(new Color(255,0,0));
        panelTeclado.add(btncancelar);
        JButton btnNum4 = new JButton("4");
        panelTeclado.add(btnNum4);
        JButton btnNum5 = new JButton("5");
        panelTeclado.add(btnNum5);
        JButton btnNum6 = new JButton("6");
        panelTeclado.add(btnNum6);
        JButton btnclear = new JButton("CLEAR");
        btnclear.setBackground(new Color(255,255,0));
        panelTeclado.add(btnclear);
        JButton btnNum1 = new JButton("1");
        panelTeclado.add(btnNum1);
        JButton btnNum2 = new JButton("2");
        panelTeclado.add(btnNum2);
        JButton btnNum3 = new JButton("3");
        panelTeclado.add(btnNum3);
        JButton btnacceder = new JButton("OK");
        btnacceder.setBackground(new Color(0,255,0));
        panelTeclado.add(btnacceder);
        JButton btnavacio1 = new JButton();
        btnavacio1.setEnabled(false);;
        panelTeclado.add(btnavacio1);
        JButton btnNum0 = new JButton("0");
        panelTeclado.add(btnNum0);
        JButton btnavacio2 = new JButton();
        btnavacio2.setEnabled(false);
        panelTeclado.add(btnavacio2);
        JButton btnavacio3 = new JButton();
        btnavacio3.setEnabled(false);
        panelTeclado.add(btnavacio3);

        //Configurarcion del Panel Principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(panelCuenta, BorderLayout.NORTH);
        mainPanel.add(panelTeclado, BorderLayout.CENTER);
        
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
         btncancelar.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }

         });
         btnclear.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               tfUsuario.setText(null);
               
            }

         });
         btnNum0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "0";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "1";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "2";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "3";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "4";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "5";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "6";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "7";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "8";
                    tfUsuario.setText(usrData);
                
            }
         });
         btnNum9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                    String usrData = tfUsuario.getText();
                    usrData= usrData + "9";
                    tfUsuario.setText(usrData);
                
            }
         });
    }
    
    public static void inicioSesionPin() {

        Ventana loginPin = new Ventana();
        //Configuracion Panel Superior
        JPanel panelPin = new JPanel();
        panelPin.setLayout(new GridLayout(3,1,0,5));
        panelPin.setFont(mainfont);
        panelPin.setOpaque(false);
        JLabel lblBienvenida = new JLabel("Bienvenido al BAC");
        lblBienvenida.setFont(mainfont);
        panelPin.add(lblBienvenida);

        JLabel lblPassword = new JLabel("Ingrese su PIN");
        lblPassword.setFont(mainfont);
        panelPin.add(lblPassword);

        tfpassword.setFont(mainfont);
        panelPin.add(tfpassword);
             
        //Configuracion Panel Inferiro
        JPanel panelTeclado = new JPanel();
        panelTeclado.setLayout(new GridLayout(4,4,5,5));
        panelTeclado.setOpaque(false);
        panelTeclado.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        JButton btnNum7 = new JButton("7");
        panelTeclado.add(btnNum7);
        JButton btnNum8 = new JButton("8");
        panelTeclado.add(btnNum8);
        JButton btnNum9 = new JButton("9");
        panelTeclado.add(btnNum9);
        JButton btncancelar = new JButton("CANCEL");
        btncancelar.setBackground(new Color(255,0,0));
        panelTeclado.add(btncancelar);
        JButton btnNum4 = new JButton("4");
        panelTeclado.add(btnNum4);
        JButton btnNum5 = new JButton("5");
        panelTeclado.add(btnNum5);
        JButton btnNum6 = new JButton("6");
        panelTeclado.add(btnNum6);
        JButton btnclear = new JButton("CLEAR");
        btnclear.setBackground(new Color(255,255,0));
        panelTeclado.add(btnclear);
        JButton btnNum1 = new JButton("1");
        panelTeclado.add(btnNum1);
        JButton btnNum2 = new JButton("2");
        panelTeclado.add(btnNum2);
        JButton btnNum3 = new JButton("3");
        panelTeclado.add(btnNum3);
        JButton btnacceder = new JButton("OK");
        btnacceder.setBackground(new Color(0,255,0));
        panelTeclado.add(btnacceder);
        JButton btnavacio1 = new JButton();
        btnavacio1.setEnabled(false);;
        panelTeclado.add(btnavacio1);
        JButton btnNum0 = new JButton("0");
        panelTeclado.add(btnNum0);
        JButton btnavacio2 = new JButton();
        btnavacio2.setEnabled(false);
        panelTeclado.add(btnavacio2);
        JButton btnavacio3 = new JButton();
        btnavacio3.setEnabled(false);
        panelTeclado.add(btnavacio3);

        //Configurarcion del Panel Principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(panelPin, BorderLayout.NORTH);
        mainPanel.add(panelTeclado, BorderLayout.CENTER);
        
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
                if(Usuarios.consultarUsuariosIndividual(tfUsuario.getText(), pswSimple) == true){
                    loginPin.dispose();
                    JOptionPane.showMessageDialog(mainPanel, "Inicio Correcto!");
                }
            }
         });
         btnNum0.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "0";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum1.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "1";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum2.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "2";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum3.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "3";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum4.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "4";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum5.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "5";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum6.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "6";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum7.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "7";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum8.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "8";
                tfpassword.setText(pswSimple);
            }
         });
         btnNum9.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char[] pswData = tfpassword.getPassword();
                String pswSimple = "";
                for(int i = 0; i< pswData.length;i++){
                     pswSimple+=pswData[i];
                }
                pswSimple+= "9";
                tfpassword.setText(pswSimple);
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
            
         JLabel lblPassword = new JLabel();  
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
         JButton btnOK = new JButton();
         southPane.add(btnOK);
         JButton btnCancel = new JButton();
         southPane.add(btnCancel);

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

         btnOK.addActionListener(new ActionListener(){
            
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
