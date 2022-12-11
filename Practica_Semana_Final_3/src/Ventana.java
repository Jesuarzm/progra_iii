import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class Ventana extends JFrame{
    public static Font mainfont = new Font("Arial", Font.BOLD, 16);
    public static JTextField tfUsuario = new JTextField();
    public static JPasswordField tfpassword = new JPasswordField();
   public static JComboBox<String> dia, mes;

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
        loginCuenta.setLocationRelativeTo(null);
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
        loginPin.setLocationRelativeTo(null);
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
                    cajero();
                }else{
                  JOptionPane.showMessageDialog(null, "Usuario o Pin Incorrecto");
                     tfUsuario.setText("");
                     tfUsuario.setText("");
                     loginPin.dispose();
                     inicioSesionCuenta();
                     
                }
            }
         });
         btncancelar.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
         });
         btnclear.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                tfpassword.setText("");
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
        JPanel panelRegisto = new JPanel();
        panelRegisto.setLayout(new GridLayout(10,1,5,0));
        panelRegisto.setFont(mainfont);
        panelRegisto.setOpaque(false);
        
        JLabel lblnombre = new JLabel("Nombre:");
        lblnombre.setFont(mainfont);
        panelRegisto.add(lblnombre);
        JTextField tfNombre = new JTextField();
        tfNombre.setFont(mainfont);
        panelRegisto.add(tfNombre);

        JLabel lblapellido = new JLabel("Apellido:");
        lblapellido.setFont(mainfont);
        panelRegisto.add(lblapellido);
        JTextField tfApellido = new JTextField();
        tfApellido.setFont(mainfont);
        panelRegisto.add(tfApellido);

            JLabel llbfecha = new JLabel("Fecha Nacimento:");
            llbfecha.setFont(mainfont);
            panelRegisto.add(llbfecha);

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
            

            dia = new JComboBox<String>();
            dia.addItem("1");
            dia.addItem("2");
            dia.addItem("3");
            dia.addItem("4");
            dia.addItem("5");
            dia.addItem("6");
            dia.addItem("7");
            dia.addItem("8");
            dia.addItem("9");
            dia.addItem("10");
            dia.addItem("11");
            dia.addItem("12");
            dia.addItem("13");
            dia.addItem("14");
            dia.addItem("15");
            dia.addItem("16");
            dia.addItem("17");
            dia.addItem("18");
            dia.addItem("19");
            dia.addItem("20");
            dia.addItem("21");
            dia.addItem("22");
            dia.addItem("23");
            dia.addItem("24");
            dia.addItem("25");
            dia.addItem("26");
            dia.addItem("27");
            dia.addItem("28");
            dia.addItem("29");
            dia.addItem("30");
            dia.addItem("31");
            dia.setFont(mainfont);
            fechaPane.add(dia);
            mes = new JComboBox<String>();
            mes.addItem("Enero");
            mes.addItem("Febrero");
            mes.addItem("Marzo");
            mes.addItem("Abril");
            mes.addItem("Mayo");
            mes.addItem("Junio");
            mes.addItem("Julio");
            mes.addItem("Agosto");
            mes.addItem("Septiembre");
            mes.addItem("Octubre");
            mes.addItem("Noviembre");
            mes.addItem("Diciembre");

            mes.setFont(mainfont);
            fechaPane.add(mes);
            JTextField año = new JTextField();
            año.setFont(mainfont);
            fechaPane.add(año);

            panelRegisto.add(fechaPane);
            
         JLabel lblPassword = new JLabel("Definir Pin");  
         lblPassword.setFont(mainfont);
         panelRegisto.add(lblPassword);

         JPasswordField pswUser = new JPasswordField();
         pswUser.setFont(mainfont);
         panelRegisto.add(pswUser);

         JLabel lblPassConfirm = new JLabel("Confirmar Pin");
         lblPassConfirm.setFont(mainfont);
         panelRegisto.add(lblPassConfirm);

         JPasswordField pfPassConfirm = new JPasswordField();
         pfPassConfirm.setFont(mainfont);
         panelRegisto.add(pfPassConfirm);

         //Configurar Panel Inferior
         JPanel panelBotones = new JPanel();
         panelBotones.setLayout(new GridLayout(1,2,5,5));
         panelBotones.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 10));
         JButton btnOK = new JButton("Registrase");
         panelBotones.add(btnOK);
         JButton btnCancel = new JButton("Cancelar");
         panelBotones.add(btnCancel);

         //Configurar Main Panel
         JPanel mainPane = new JPanel();
         mainPane.setLayout(new BorderLayout());
         mainPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
         mainPane.add(panelRegisto, BorderLayout.CENTER);
         mainPane.add(panelBotones, BorderLayout.SOUTH);

         crearUsuario.add(mainPane);
         crearUsuario.setTitle("Crear Usuario");
         crearUsuario.setSize(400,500);
         crearUsuario.setResizable(false);
         crearUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         crearUsuario.setLocationRelativeTo(null);
         crearUsuario.setVisible(true);

         btnOK.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e) {
                char [] pswdEncriptada = pswUser.getPassword();
                char [] pswdVerification = pfPassConfirm.getPassword();
                if(Arrays.equals(pswdEncriptada, pswdVerification)){
                    String pswPin= "";
                    for(int i = 0; i< pswdEncriptada.length; i++){
                        pswPin+=pswdEncriptada[i];
                    }
                    Usuarios.agregarUsuario(
                        tfNombre.getText(),
                        tfApellido.getText(),
                        ""+dia.getSelectedItem()+"/"+mes.getSelectedItem()+"/"+año.getText(),
                        pswPin
                    );
                }
                System.out.println(Usuarios.db_usuarios);
                crearUsuario.dispose();
                inicioSesionCuenta();
            }
         });

    }
    public static void cajero() {
      JFrame cajero = new JFrame();


      //Configuracion menu Principal
      JPanel menuInicio = new JPanel();
      menuInicio.setVisible(true);
      menuInicio.setLayout(new GridLayout(3,2,0,0));
      menuInicio.setBounds(0,0,340,500);
      menuInicio.setOpaque(false);
      JLabel opcMenu1 = new JLabel("Balance");
      menuInicio.add(opcMenu1);
      JLabel opcMenu2 = new JLabel("Retiros", SwingConstants.RIGHT);
      menuInicio.add(opcMenu2);
      JLabel opcMenu3 = new JLabel("Depositos");
      menuInicio.add(opcMenu3);
      JLabel opcMenu4 = new JLabel("Transferecnias", SwingConstants.RIGHT);
      menuInicio.add(opcMenu4);

      //Configuracion menu Balance
      JPanel menuBalance = new JPanel();
      menuBalance.setVisible(false);
      menuBalance.setLayout(new GridLayout(3,2, 5,0));
      menuBalance.setBounds(0,0,340,500);
      menuBalance.setOpaque(false);
      JLabel lblSalir = new JLabel("Salir");
      menuBalance.add(lblSalir);
      JLabel lblVacias1 = new JLabel();
      menuBalance.add(lblVacias1);
      JLabel lblBalance = new JLabel("Fondos: ");
      menuBalance.add(lblBalance);
      JLabel lblBalanceTotal = new JLabel();
      menuBalance.add(lblBalanceTotal);

      //Configuracion menu Retiro
      JPanel menuRetiro = new JPanel();
      menuRetiro.setVisible(false);
      menuRetiro.setLayout(new GridLayout(3,2, 5,0));
      JLabel lblSalir2 = new JLabel("Salir");
      menuBalance.add(lblSalir2);
      JLabel lblVacias2 = new JLabel();
      menuBalance.add(lblVacias2);
      JLabel lbLRetiro = new JLabel("Monto a retirar: ");
      menuBalance.add(lbLRetiro);
      JTextField tfRetiro = new JTextField();
      menuBalance.add(tfRetiro);
      
      //Configuracion panel Pantalla
      JPanel panelPantalla = new JPanel();
      panelPantalla.setLayout(null);
      panelPantalla.setBackground(new Color(31,167,194));
      panelPantalla.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      panelPantalla.add(menuInicio);
      panelPantalla.add(menuBalance);
      panelPantalla.add(menuRetiro);

      //Configuracion de panel BOtones Izquierdos
      JPanel panelBtnIzq = new JPanel();
      panelBtnIzq.setLayout(new GridLayout(3,1,0,10));
      panelBtnIzq.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      JButton btnOpc1 = new JButton("Opcion 1");
      panelBtnIzq.add(btnOpc1);
      JButton btnOpc3 = new JButton("Opcion 3");
      panelBtnIzq.add(btnOpc3);
      JButton btnVacio1 = new JButton();
      btnVacio1.setEnabled(false);
      panelBtnIzq.add(btnVacio1);

      //Configuracion de panel Botones Derechos
      JPanel panelBtnDer = new JPanel();
      panelBtnDer.setLayout(new GridLayout(3,1,0,10));
      panelBtnDer.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      JButton btnOpc2 = new JButton("Opcion 2");
      panelBtnDer.add(btnOpc2);
      JButton btnOpc4 = new JButton("Opcion 4");
      panelBtnDer.add(btnOpc4);
      JButton btnVacio2 = new JButton();
      btnVacio2.setEnabled(false);
      panelBtnDer.add(btnVacio2);

      //Configuracion Panel Numerico
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
      
      //Configuracion panel Izq
      JPanel panelIzq = new JPanel();
      panelIzq.setLayout(new BorderLayout());
      panelIzq.add(panelPantalla, BorderLayout.CENTER);
      panelIzq.add(panelTeclado, BorderLayout.SOUTH);
      panelIzq.add(panelBtnDer, BorderLayout.EAST);
      panelIzq.add(panelBtnIzq, BorderLayout.WEST);

      //Configuracion panel Izq
      JPanel panelDer = new JPanel();
      panelDer.setLayout(new BorderLayout());
      JButton buttonPrueba = new JButton("Prueba");
      panelDer.add(buttonPrueba);

      //Configuracion panel prinicipal
      JPanel mainPanel = new JPanel();
      mainPanel.setLayout(new GridLayout(1,2));
      mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
      mainPanel.add(panelIzq);
      //mainPanel.add(panelDer);

      //Configuracion del JFrame
      cajero.add(mainPanel);
      cajero.setTitle("Cajero Automatico BAC");
      cajero.setSize(600,600);
      cajero.setResizable(false);
      cajero.setLocationRelativeTo(null);
      cajero.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cajero.setVisible(true);
      cajero.setAlwaysOnTop(true);

      btnOpc1.addActionListener(new ActionListener(){
            
         public void actionPerformed(ActionEvent e) {
             if(menuInicio.isVisible() == true){
               menuInicio.setVisible(false);
               menuBalance.setVisible(true);
               for(int i = 0; i < Usuarios.db_usuarios.size();i++){
                  if(Usuarios.db_usuarios.get(i).get(0).equals(tfUsuario.getText())){
                     lblBalanceTotal.setText(Usuarios.db_usuarios.get(i).get(5));
                  }
               }
             }
         }
      });
      
    }
}
