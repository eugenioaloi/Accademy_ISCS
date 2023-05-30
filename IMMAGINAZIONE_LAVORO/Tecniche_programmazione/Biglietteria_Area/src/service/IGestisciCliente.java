package service;

import java.util.Map;

import model.Cliente;

public interface IGestisciCliente {
	
	public boolean isPresent(Map<String, Cliente> mappaClienti, String cod_cliente);
	
}
