package com.errors;

public class ExceptionResponse extends RuntimeException {

	private String qtArticoli;
	private boolean artDisponibile;
	
	public ExceptionResponse (String qtArticoli, boolean artDisponibile) {
		
		super();
		this.qtArticoli=qtArticoli;
		this.artDisponibile=artDisponibile;
	}

	public String getQtArticoli() {
		return qtArticoli;
	}

	public void setQtArticoli(String qtArticoli) {
		this.qtArticoli = qtArticoli;
	}

	public boolean isArtDisponibile() {
		return artDisponibile;
	}

	public void setArtDisponibile(boolean artDisponibile) {
		this.artDisponibile = artDisponibile;
	}
	
	
	
	
}
