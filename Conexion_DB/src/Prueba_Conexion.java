import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Prueba_Conexion {

	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn = null;
		Statement stm = null;
		ResultSet rset = null;
		
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
}
