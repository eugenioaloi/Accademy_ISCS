package connesione;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import model.Biglietto;
import model.Cliente;
import model.Volo;
import service.IConnessione;

public class Connesione implements IConnessione{

	@Override
	public Connection connettiDB(String url, String user, String psw)  {
		Connection c=null;
		try {
			c= DriverManager.getConnection(url,user,psw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public Map<String, Cliente> mappaClienti() {
		Map<String, Cliente> mappaClienti = new TreeMap<>();
		Connection c = connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		
		Statement st;
		try {
			st = c.createStatement();
			String query = "select * from clienti";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				mappaClienti.put(rs.getString("cod_cliente"), 
						new Cliente(
								rs.getString("cod_cliente"),
								rs.getString("nome"),
								rs.getString("cognome")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mappaClienti;
	}

	@Override
	public Map<String, Biglietto> mappaBiglietti() {
		Map<String, Biglietto> mappaBiglietti = new TreeMap<>();
		Connection c = connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		
		Statement st;
		try {
			st = c.createStatement();
			String query = "select * from biglietti";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				mappaBiglietti.put(rs.getString("cod_operazione"), 
						new Biglietto(
								rs.getInt("cod_operazione"),
								rs.getString("cod_cliente"),
								rs.getString("tipo_pagamento"),
								rs.getInt("qt_biglietti"),
								rs.getString("id_volo")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mappaBiglietti;
	}
	
	@Override
	public Map<String, Volo> mappaVoli() {
		Map<String, Volo> mappaVoli = new TreeMap<>();
		Connection c = connettiDB("jdbc:mysql://localhost:3306/biglietteriaAerea",
				"root", "password");
		Statement st;
		try {
			st = c.createStatement();
			String query = "select * from voli";
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				mappaVoli.put(rs.getString("id_volo"), 
						new Volo(
								rs.getString("id_volo"),
								rs.getString("partenza"),
								rs.getString("destinazione"),
								rs.getDate("data_volo"),
								rs.getString("orario_volo"),
								rs.getInt("posti_disp"),
								rs.getString("nome_volo")
								));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mappaVoli;
	}
	
}
