package controller;

import errors.ArchiveException;
import errors.ArchiveFullException;
import errors.ElementAlreadyInArchiveException;
import errors.ElementNotInArchiveException;
import model.SchedaPersona;
import service.IArchivio;
import service.IScheda;

public class RubricaTelefonica implements IArchivio{
	
	private SchedaPersona [] schede;
	private int dimArray;
	
	public RubricaTelefonica(int dimArray) {
		this.schede = new SchedaPersona[dimArray];
		this.dimArray= dimArray;
	}
	
	public SchedaPersona[] getSchede() {
		return schede;
	}

	@Override
	public IScheda[] search(String s) {
		int occorrenze = 0;
		
		for(SchedaPersona sp:schede) {
			try {
				if(sp.contains(s)) {
					occorrenze++;
				}
			} catch (Exception e) {
				continue;
			}
		}
		
		IScheda [] schedePersona = new IScheda[occorrenze];
		
		for(int i=0;i<occorrenze;i++) {
			if(schede[i].contains(s)) {
				schedePersona[i]=(IScheda) schede[i];
			}
		}
		
		return schedePersona;
	}

	/*
	 * @L’eccezione dovrà essere generata qualora non sia possibile inserire una nuova scheda a causa dell’esaurimento
	delle posizioni libere disponibili nell’array oppure nel caso in cui la scheda che si sta inserendo sia già memorizzata.*/
	@Override
	public void insert(IScheda s) throws ArchiveException{
		if(schede.length>dimArray) {//l'array è pieno
			throw new ArchiveFullException();
		}else {
			for(int i=0;i<schede.length;i++) {
				if (schede[i]==s) {//l'elemento esiste già nell'array
					throw new ElementAlreadyInArchiveException();
				}else if(schede[i]== null){
					schede[i]=(SchedaPersona) s;
					break;
				}
			}
		}
	}

	/*@L’eccezione dovrà essere generata qualora la scheda che si vuole cancellare non sia presente nell’archivio.*/
	@Override
	public void delete(IScheda s) throws ArchiveException{
		SchedaPersona[] schedeTemp = new SchedaPersona[schede.length];
		
		for(int i=0;i<schede.length;i++) {
			try {
				if(!schede[i].equals(s)) {//cancella se la trovi
					throw new ElementNotInArchiveException();
				}else {
					schede[i] = null;
					continue;
				}
			}catch (NullPointerException e) {// l'array può presentare elementi null, quindi è utili poter intercettarare l'exc
				continue;
			}
		} 
		
		//compatto l'array
		for(int i=0;i<schede.length;i++) {
			if(schede[i]!=null) {
				schedeTemp[i] = schede[i];
			}
		}
		
		this.schede = schedeTemp;
		
		
	}


}
