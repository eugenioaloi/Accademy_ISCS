package manipolazioneFileAuto;

public enum EnumAuto {

	FIAT("TIPO", "PANDA", "500"),
    AUDI("A4"),
    TESLA("T1");

	// Instance variables
	String[] arModello;
	
	// Constructors
	EnumAuto(String ... modello) {
		this.arModello = modello;
	}
	
	/*
	@ Restituisce i modelli della casa automobilistica
 */
	public String[] getModelli() {
		return this.arModello;
	}

}
