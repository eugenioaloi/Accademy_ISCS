package controller;

import java.util.Map;

import model.Cliente;
import service.IGestisciCliente;

public class GestisciCliente implements IGestisciCliente{

	@Override
	public boolean isPresent(Map<String, Cliente> mappaClienti, String cod_cliente) {
		for(String s:mappaClienti.keySet()) {
			if (s.equalsIgnoreCase(cod_cliente)){
				return true;
			}
		}
		return false;
	}

}
