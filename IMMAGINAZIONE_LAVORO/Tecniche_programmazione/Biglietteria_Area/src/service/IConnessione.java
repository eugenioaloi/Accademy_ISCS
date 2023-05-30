package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import model.Biglietto;
import model.Cliente;
import model.Volo;

public interface IConnessione {
	
	public Connection connettiDB(String url, String user, String psw )throws SQLException;
	public Map<String, Cliente> mappaClienti();
	public Map<String, Biglietto> mappaBiglietti();
	public Map<String, Volo> mappaVoli();
	
	
}
