package creaFileDB;

import java.io.File;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TestCreaFileDB {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/java_sql";
		String user="root";
		String psw="password";
		String query;
		
		try {
			
			Connection c = DriverManager.getConnection(url,user,psw);
			Statement st = c.createStatement();
			
			query = "select * from emp";
			
			ResultSet rs = st.executeQuery(query);
			
			FileWriter fw = new FileWriter("Impiegati.txt");
			
			
			while(rs.next()) {
				fw.write("Nome: " + rs.getString("ename")+ " ");
				fw.write("Lavoro: " + rs.getString("job")+ " ");
				fw.write("Salario: " + rs.getDouble("sal")+ " ");
			}
			
			fw.close();
			st.close();
			c.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//*******************************************
		try {
			Scanner sc = new Scanner(new File("Impiegati.txt"));
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//*** -> per trasformare il file in un json si può fare 2 cose
		// -1) formattarlo a mano
		// -2) utilizzare una libreria in grado di formattare in automarico il file
		
		
		
	}
}
