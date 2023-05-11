package service;

import errors.ArchiveException;

public interface IArchivio {
	
	//L’eccezione dovrà essere generata qualora non sia possibile inserire una nuova scheda a causa dell’esaurimento
	//delle posizioni libere disponibili nell’array oppure nel caso in cui la scheda che si sta inserendo
	//sia già stata memorizzata.
	void insert(IScheda s)throws ArchiveException;
	
	//
	void delete(IScheda s)throws ArchiveException;
	
	IScheda[] search(String s);

}
