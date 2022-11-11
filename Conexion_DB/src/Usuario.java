import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario {

	public static PuenteDB conexion = new PuenteDB();
	public static Connection cn = null;
	public static Statement stm = null;
	public static ResultSet rset = null;
	public static PreparedStatement pstm = null;

	public static void consultarUsuarios(){
		try {
			cn = conexion.conectar();	
			stm = cn.createStatement();
			rset = stm.executeQuery("Select * from usuarios");
			
			while (rset.next()) {
				int id = rset.getInt(1);
				String nombre = rset.getString(2);
				String apellido = rset.getString(3);
				Date fecha = rset.getDate(4);
				String ciudad = rset.getString(5);
				int cel = rset.getInt(6);
				
				System.out.println(id +"-"+ nombre +"-"+ apellido +"-"+ fecha +"-"+ ciudad +"-"+ cel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static void consultarUsuariosIndividual(int idUsuario){
		
		try {
			cn = conexion.conectar();	
			pstm = cn.prepareStatement("Select * from usuarios where Id=?");
			pstm.setInt(1, idUsuario);
			rset = pstm.executeQuery();
			
			
			while (rset.next()) {
				int id = rset.getInt(1);
				String nombre = rset.getString(2);
				String apellido = rset.getString(3);
				Date fecha = rset.getDate(4);
				String ciudad = rset.getString(5);
				int cel = rset.getInt(6);
				
				System.out.println(id +"-"+ nombre +"-"+ apellido +"-"+ fecha +"-"+ ciudad +"-"+ cel);
			}
		} catch (SQLException e) {
			e.printStackTrace();
            try {
                if(rset!= null) {
                    rset.close();
                }
                
                if(stm!= null) {
                    stm.close();
                }
                
                if(cn!= null) {
                    cn.close();
                }
				if(pstm!= null) {
                    pstm.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
		}
	}
}
