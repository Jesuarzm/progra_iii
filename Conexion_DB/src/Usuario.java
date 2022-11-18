import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

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
		}finally{
			cerrarConexiones();
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
		}finally{
			cerrarConexiones();
		}

	}
	public static void modificarUsuario(int true_id, int mod_id, String mod_nombre, String mod_apellido, String mod_fecha, String mod_ciudad , int mod_cel){
		
		try {
			cn = conexion.conectar();	
			pstm = cn.prepareStatement("UPDATE usuarios SET Id=? , Nombre =?, Apellido=?, Fecha_N=?, Ciudad=?, Telefono=? WHERE Id =?");
			pstm.setInt(1, mod_id);
			pstm.setString(2, mod_nombre);
			pstm.setString(3, mod_apellido);
			pstm.setString(4, mod_fecha);
			pstm.setString(5, mod_ciudad);
			pstm.setInt(6, mod_cel);
			pstm.setInt(7, true_id);
			int res = pstm.executeUpdate();
			if (res > 0){
				System.out.println("Modificacion realizada correctamente!");
			}else{
				System.out.println("Error al guardar cambios!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			cerrarConexiones();
		}
		
	}
	public static void borrarUsuario(int id_borrar){
		try {
			cn = conexion.conectar();	
			pstm = cn.prepareStatement("DELETE FROM usuarios WHERE Id =?");
			pstm.setInt(1, id_borrar);
			int res = pstm.executeUpdate();
			if (res > 0){
				System.out.println("Usuario Borradao!");
			}else{
				System.out.println("Error al guardar cambios!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			cerrarConexiones();
		}
	}
	public static void cerrarConexiones(){
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
