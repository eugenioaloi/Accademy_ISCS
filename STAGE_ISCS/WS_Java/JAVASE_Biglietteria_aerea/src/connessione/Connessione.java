package connessione;

import java.sql.*;

public class Connessione {
	
	public static ResultSet eseguiQuery(String query) throws Exception{
		
		Connection con = connettiDB();
		
		Statement st = con.createStatement();
			
		ResultSet rs = st.executeQuery(query);
		
		return rs;
	}
	
	public static Connection connettiDB() {
		String url = "jdbc:mysql://localhost:3306/BiglietteriaaereaJavaSE";
		String user = "root";
		String psw = "password";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,psw);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
		

}
