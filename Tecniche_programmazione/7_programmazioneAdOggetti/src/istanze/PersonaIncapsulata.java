package istanze;

public class PersonaIncapsulata {
	
	//I tre pilastri della programmazione ad oggetti:
	//1- incapsulamento
	//2- ereditarietà
	//1- polimorfismo

	//*********** Incapsulamento rendere private tutte le informazioni che io non voglio siano modificate ***********
	private String nome;
	private String cognome;
	private int eta;
	
	//con la parola chiave this si fa riferimento all'attributo della classe e non al parametro del metodo con lo stesso nome
	public PersonaIncapsulata(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	//Si possono creare dei metodi custom per i getters and setters, ma la convenzione ci dice che debbano essere chiamati
	//*** setNomeAtributo -> setta il valore all'attributo e non ritorna nulla (void)
	//*** getNomeAtributo -> ritorna il valore dell'attributo (tipo del dato)
	
	//******************** SETTERS -> servono a settare i valori degli attributi
	
	public void assegnaNome(String n) {
		nome = n;
	}
	
	public void assegnaCognome(String c) {
		cognome = c;
	}
	
	public void assegnaEta(int e) {
		eta = e;
	}
	
	//******************** GETTERS -> servono a ritornare i valori degli attributi
	
	public String leggiNome() {
		return nome;
	}
	
	public String leggiCognome() {
		return cognome;
	}
	public int leggiEta() {
		return eta;
	}

	
	//************ Sovrascrittura del metodo toString (Override)
	
	@Override
	public String toString() {
		return "La persona si chiama " + nome + 
				" cognome " + cognome + 
				" ed ha " + eta + " anni." ;
	}
	
	
	
	
}
