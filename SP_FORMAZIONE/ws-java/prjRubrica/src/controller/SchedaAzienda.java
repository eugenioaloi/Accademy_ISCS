package controller;

import model.SchedaPersona;
import service.IScheda;

public class SchedaAzienda extends SchedaPersona implements IScheda{

	private String num_fax;
	
	public SchedaAzienda(String nome,String indirizzo,String num_telefono, String num_fax) {
		super(nome,indirizzo,num_telefono);
		this.num_fax = num_fax;
	}
	
	public SchedaAzienda(String nome,String indirizzo,String num_telefono) {
		super(nome,indirizzo,num_telefono);
	}

	public String getNum_fax() {
		return num_fax;
	}

	public void setNum_fax(String num_fax) {
		this.num_fax = num_fax;
	}

	
}
