package service;

import java.util.List;

import model.Volo;

public interface IVoloService {
	
	//getAll List
	public List<Volo> getAllVoli();
	
	//existById boolean
	public boolean existById(String idVolo);
	
	//getById Cliente
	public Volo getVoloById(String idVolo);

}
