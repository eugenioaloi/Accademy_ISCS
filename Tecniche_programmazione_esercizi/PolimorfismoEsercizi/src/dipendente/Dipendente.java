package dipendente;

import persona.Persona;

public class Dipendente extends Persona {
	
	private double stipendio;
	
	public Dipendente(String nome, int eta, int stipendio) {
		super(nome, eta);
		this.stipendio = stipendio;
	}
	
	public void aumento(double percentuale) {
		double aumStip = 0;
		if(super.eta>50) {
			aumStip = stipendio +((stipendio*percentuale)/100);
			this.stipendio =aumStip;
		}
	}
	
	public String trovaPaperone(Dipendente[] dipendendti) {
		double maxStip = 0;
		String nomeDip ="";
		for(Dipendente dip: dipendendti) {
			if(dip.stipendio>maxStip) {
				maxStip=dip.stipendio;
				nomeDip = dip.nome;
			}
		}
		return nomeDip ;
	}
	
	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}
	
	public double getStipendio() {
		return stipendio;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Stipendio: " + stipendio;
	}

}
