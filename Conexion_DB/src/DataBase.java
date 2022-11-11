import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.SQLException;

public class DataBase {
    
    public static PuenteDB conexion = new PuenteDB();
	public static Connection cn = null;
	public static Statement stm = null;
	public static PreparedStatement pstm = null;
    
    public static void insertarUsuario(int newId,String newName, String newLasName, LocalDate newFecha,String newCity, int newCel){
        try {
			cn = conexion.conectar();	
			stm = cn.createStatement();
			stm.executeUpdate(""+
                "INSERT INTO usuarios"+
                "(Id,Nombre,Apellido,Fecha_N,Ciudad,Telefono) values"+
                "('"+newId+"','"+newName+"','"+newLasName+"','"+newFecha+"','"+newCity+"','"+newCel+"')"    
            );
            cn.close();
            System.out.println("Se registro el nuevo usuario");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }

}
