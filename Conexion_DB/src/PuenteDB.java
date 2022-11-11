import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PuenteDB {
	
	private static final String Controlador = "com.mysql.cj.jdbc.Driver";
	private static final String host = "jdbc:mysql://sql9.freesqldatabase.com:3306/sql9556192";
	private static final String userDB = "sql9556192";
	private static final String passDB = "HZKGcpWkTq";
	
	static {
		try {
			Class.forName(Controlador);
		} catch (ClassNotFoundException e) {
			System.out.println("Error Cargar Controlador");
			e.printStackTrace();
		}
	}
	public Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(host,userDB,passDB);
			System.out.println("Conexion a Base de Datos Exitosa");

		} catch (SQLException e) {
			System.out.println("Error Conexion DB");
			e.printStackTrace();
		}
		return conexion;
	}

}