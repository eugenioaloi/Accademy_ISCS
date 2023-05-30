package service;

import java.util.Map;

import model.Biglietto;

public interface IGestisciBiglietti {
	
	public boolean esistePrenotazione(Map<String, Biglietto> mappaBiglietti, int cod_prenotazione);
	
	/*
	public void prenota(Connection conn,Cliente c,int qt, String query, 
			int n_prenotazione, int bilgiettiPrenotati);
	
	public boolean checkPrenotazione(Connection conn,int n_prenotazione,
			String queryPrenotazione);
	
	public void aggPrenotaBiglietti(String queryAggBiglietti);
	public void prenotaBiglietti(String queryBiglietti);
	*/

}
