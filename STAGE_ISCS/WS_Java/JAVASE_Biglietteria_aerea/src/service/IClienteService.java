package service;

import java.util.List;

import model.Cliente;

public interface IClienteService {
	
	//getAll List
	public List<Cliente> getAllClienti();
	
	//existById boolean
	public boolean existById(String cod_cliente);
	
	//getById Cliente
	public Cliente getClienteById(String cod_cliente);

}
