package connesione;

import java.sql.*;

public class TestConnesione {
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
			
			while(rs.next()) {
				System.out.println(rs.getInt("empno")+" ");
				System.out.println(rs.getString("ename")+" ");
				System.out.println(rs.getString("job")+" ");
				System.out.println(rs.getDouble("sal")+" ");
			}
			
			/*
			query = "insert into emp(empno,ename,job,sal,deptno)"
					+ " values (119,'mario','prog',2000,10)";
			st.executeUpdate(query);
			*/
			
			query = "create table if not exists esempio("
					+ "a varchar(30), "
					+ "b varchar(30), "
					+ "c int)";
			
			st.executeUpdate(query);
			
			st.close();
			c.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
}
