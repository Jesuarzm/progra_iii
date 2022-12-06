
import javax.swing.*;

public class Main {
    public static int respuestaMenuSesion; 
    public static void main(String[] args) {
        Usuarios.DefaultUsers();
        
        respuestaMenuSesion = JOptionPane.showOptionDialog(
                null,
                "¿Tiene un usario creado?", 
                "Selector de opciones",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,    // null para icono por defecto.
                new Object[] { "Si, tengo usuario", "No, deseo crear uno" },   // null para YES, NO y CANCEL
                "Si, tengo usuario");

        switch(respuestaMenuSesion){
            case 0:
                Ventana.inicioSesionCuenta();
                break;
            case 1:
                Ventana.crearCuenta();
                break;

        }
    }
}
