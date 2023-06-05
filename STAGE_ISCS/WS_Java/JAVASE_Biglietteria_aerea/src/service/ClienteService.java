package service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import connessione.Connessione;
import error.IstanceNotFound;
import model.Cliente;
import model.Volo;

public class ClienteService implements IClienteService{

	@Override
	public List<Cliente> getAllClienti() {
		List<Cliente> clienti = new ArrayList<>();
		String query = "select * from clienti";
		try {
			ResultSet rs = Connessione.eseguiQuery(query);
			while(rs.next()) {
				
				String cod_cliente = rs.getString("cod_cliente");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				clienti.add(new Cliente(cod_cliente, nome, cognome));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clienti;
	}

	@Override
	public boolean existById(String cod_cliente) {
		List<Cliente> clienti = getAllClienti();
		for(Cliente c:clienti) {
			if(c.getCodCliente().equalsIgnoreCase(cod_cliente)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Cliente getClienteById(String cod_cliente) {
		List<Cliente> clienti = getAllClienti();
		boolean flag = existById(cod_cliente);
		for(Cliente c:clienti) {
			if(flag){
				return c;
			}
		}
		throw new IstanceNotFound("Cliente con id " + cod_cliente + " non disponibile");
	}

}
