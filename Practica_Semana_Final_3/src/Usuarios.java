import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
public class Usuarios {

    public static List<List<String>> db_usuarios = new ArrayList<List<String>>();

    public static void agregarUsuario(String nombre, String apellido, String fecha, String pincode) {
        int ultimoIndex = db_usuarios.size();
        String numCuenta ="";
        boolean estado = false;
        while(estado == false){
            int rand = (int)(Math.random() * 500) + 1;
            for(int i = 0; i < db_usuarios.size(); i++){
                if(db_usuarios.get(i).get(0).equals(String.valueOf(rand))){
                    estado = false;
                }
                if(db_usuarios.size()-1 == i){
                    estado = true;
                    numCuenta = String.valueOf(rand);
                }
            }
        }
        db_usuarios.add(new ArrayList<>());
        db_usuarios.get(ultimoIndex).add(numCuenta);
        db_usuarios.get(ultimoIndex).add(nombre);
        db_usuarios.get(ultimoIndex).add(apellido);
        db_usuarios.get(ultimoIndex).add(fecha);
        db_usuarios.get(ultimoIndex).add(pincode);
        db_usuarios.get(ultimoIndex).add("1000");

        JOptionPane.showMessageDialog(null, "Usuario creado exitosamente."+"\nSu numero de cuenta es: " + numCuenta);
        
    }
    public static boolean consultarUsuariosIndividual(String numCuenta, String pincode) {
        for(int i = 0; i< db_usuarios.size(); i++){
            if (db_usuarios.get(i).get(0).equals(numCuenta) && db_usuarios.get(i).get(4).equals(pincode)) {
                return true;
            }
            if(db_usuarios.size()-1 == 1){
                return false;
            }
        }
        return false;
        
    }
    public static void DefaultUsers() {
        db_usuarios.add(new ArrayList<>());
        db_usuarios.get(0).add("243");
        db_usuarios.get(0).add("Jesuar");
        db_usuarios.get(0).add("Miranda");
        db_usuarios.get(0).add("17/Sep/2001");
        db_usuarios.get(0).add("1234");
        db_usuarios.get(0).add("100000");
    }

}
