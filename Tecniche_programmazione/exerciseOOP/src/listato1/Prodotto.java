package listato1;

public class Prodotto {
	//il negozio associa tutti i suoi prodotti
	//params codice univo, una descrizione del prodotto e il suo prezzo
	
	//realizzare classe con metodi get/set e un metodo applicaSconto che modifica il prezzo diminuendolo di una % a scelta
	
	private String codiceUnivoco;
	private String descrizione;
	private double prezzo;
	
	
	/*
	 * @params codiceUnivoco
	 * @params descrizione
	 * @params prezzo
	 * */
	public Prodotto(String codiceUnivoco, String descrizione, double prezzo) {
		setCodiceUnivoco(codiceUnivoco);
		setDescrizione(descrizione);
		setPrezzo(prezzo);
	}
	
	/*
	 * metodo in grado di ritornare il prezzo già in promozione con una percentuale passata
	 * @params perSconto -> int
	 * @return double
	 * */
	public double applicaSconto(int percSconto) {
		double promozione = prezzo-(prezzo*percSconto)/100;
		prezzo = promozione;
		return prezzo;
	}
	
	public String getCodiceUnivoco() {
		return codiceUnivoco;
	}
	public void setCodiceUnivoco(String codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		return "Prodotto con codiceUnivoco: " + codiceUnivoco + ", descrizione: " + descrizione + ", prezzo attuale: " + prezzo + "]";
	}
	
}
