package cellulare;

public class Cellulare {
	
	private String marca,modello;
	private double credito;
	private int numeroChiamate;
	private final double PREZZO_AL_MINUTO = 0.20;
	
	
	/*
	 * @param marca
	 * @param modello
	 * @param credito
	 * @param numeroChiamate
	 * */
		public Cellulare(String marca, String modello, double credito, int numeroChiamate) {
			this.marca = marca;
			this.modello = modello;
			this.credito = credito;
			this.numeroChiamate = numeroChiamate;
		}
		
		
		/*
		 * metodo che ricarica il cellulare
		 * @param soldi Importo della ricarica -> double
		 * */
		public void ricarica(double soldi) {
			this.credito += soldi;
		}
		
		/*
		 * Metodo che consente di effettuare una chiamata e calcola il costo e il aumenta il param numeroChiamate
		 * @param minutiChiamata
		 * */
		public void chiama(double minutiChiamata) {
			credito -= (minutiChiamata*PREZZO_AL_MINUTO);
			numeroChiamate++;
		}
		
		/*
		 * Restituisce true/false se il credito è finito
		 * @return boolean
		 * */
		public boolean creditoEsaurito() {
			return credito<=0;
		}
		
		//GETTERS AND SETTERS
		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getModello() {
			return modello;
		}


		public void setModello(String modello) {
			this.modello = modello;
		}


		public double getCredito() {
			return credito;
		}


		public void setCredito(double credito) {
			this.credito = credito;
		}


		public int getNumeroChiamate() {
			return numeroChiamate;
		}


		public void setNumeroChiamate(int numeroChiamate) {
			this.numeroChiamate = numeroChiamate;
		}


		public double getPREZZO_AL_MINUTO() {
			return PREZZO_AL_MINUTO;
		}


		@Override
		public String toString() {
			return "Cellulare [marca=" + marca + ", modello=" + modello + ", credito=" + credito + ", numeroChiamate="
					+ numeroChiamate + ", PREZZO_AL_MINUTO=" + PREZZO_AL_MINUTO + "]";
		}
		
		
	
	
	

}
