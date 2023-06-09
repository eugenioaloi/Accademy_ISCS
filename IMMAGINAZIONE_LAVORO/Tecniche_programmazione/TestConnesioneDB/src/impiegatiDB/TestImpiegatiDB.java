package impiegatiDB;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class TestImpiegatiDB {
	public static void main(String[] args) {
		
		ArrayList<Persona> impiegati = new ArrayList<>();
		
		String url = "jdbc:mysql://localhost:3306/java_sql";
		String user="root";
		String psw="password";
		String query;
		
		try {
			
			Connection c = DriverManager.getConnection(url,user,psw);
			Statement st = c.createStatement();
			
			query = "select * from employees";
			
			ResultSet rs = st.executeQuery(query);
			
			FileWriter fw = new FileWriter("FetchImpiegatiDB.txt");
			
			while(rs.next()) {
				int matricola = rs.getInt("employee_id");
				String nome = rs.getString("first_name");
				String cognome = rs.getString("last_name");
				String lavoro =rs.getString("job_id");
				double salario = rs.getDouble("salary");
				
				
				fw.write("Matricola: " + matricola + "\n ");
				fw.write("Nome: " + nome + "\n ");
				fw.write("Cognome: " + cognome + "\n ");
				fw.write("Lavoro: " + lavoro + "\n ");
				fw.write("Salario: " + salario + "\n ");
				
				impiegati.add(new Impiegato(nome, cognome, matricola, matricola, lavoro, salario));
			}
			
			fw.close();
			st.close();
			c.close();
			
		} catch (Exception e) {
			System.out.println("Errore db "+e.getMessage());
		}
		
		System.out.println("Tutto ok, controlla il file ");
		//System.out.println(impiegati +"\n");
		
	}
}
