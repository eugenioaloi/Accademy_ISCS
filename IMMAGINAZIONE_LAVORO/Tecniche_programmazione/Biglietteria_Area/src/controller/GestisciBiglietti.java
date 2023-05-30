package controller;

import java.util.Map;

import model.Biglietto;
import service.IGestisciBiglietti;

public class GestisciBiglietti implements IGestisciBiglietti{

	@Override
	public boolean esistePrenotazione(Map<String, Biglietto> mappaBiglietto, int cod_operazione) {
		for(String s:mappaBiglietto.keySet()) {
			Biglietto b = mappaBiglietto.get(s);
			if (b.getCod_operazione()==cod_operazione){
				return true;
			}
		}
		return false;
	}

	
	
	
/*
	@Override
	public void prenota(Connection conn,Cliente c,int qt, String query, 
		int n_prenotazione, int bilgiettiPrenotati) {
		GestisciCliente gc = new GestisciCliente();
		//controllo se il cliente è presente
		boolean flagCliente = gc.isPresent(conn, c.getCod_cliente(), query);
		String queryPrenotazione = "select * from clienti c "
				+ "join biglietti b on c.cod_cliente=b.cod_cliente "
				+ "where cod_operazione = ?";
		//
		boolean flagPrenotazione = checkPrenotazione(conn, n_prenotazione, 
				queryPrenotazione);
		if(flagCliente) {
			if(flagPrenotazione) {
				//aggiungo i numeri dei biglietti al db
				String queryAggBiglietti = "";
				aggPrenotaBiglietti(queryAggBiglietti);
				
				System.out.println("aggiungo biglietti");
			}else {
				//creo una nuova prenotazione
				String queryAggBiglietti = "";
				prenotaBiglietti(queryAggBiglietti);
				
				System.out.println("prenoto biglietti");
			}
		}else {
			System.out.println("cliente non presente in anagrafica");
		}
	}
	
	@Override
	public boolean checkPrenotazione(Connection conn,int n_prenotazione,
			String queryPrenotazione) {
		try {
			PreparedStatement ps = conn.prepareStatement(queryPrenotazione);
			ps.setInt(1, n_prenotazione);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
 */

	
	
}
