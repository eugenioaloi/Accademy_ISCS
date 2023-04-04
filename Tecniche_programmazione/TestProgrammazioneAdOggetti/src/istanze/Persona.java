package istanze;

public class Persona {//public è un modificatore di accesso
	//public visibilità in tutto il progetto
	//default visibilità solo nel package
	//private visibilità solo nella classe
	//protected visibilità estesa alle sotto classi
	
	//Attributi
	public String nome;
	public String cognome;
	public int eta;
	public boolean maggiorenne;
	public final int NUMERO_OCCHI=2;//le costanti sono dichiarati con final e con convenzione il nome in maiuscolo
	
	//*********************** Metodi
	
	//metodo costruttore. La classe in automatico ha il suo metodo costruttore se non viene specifcato Java lo specifica ugualmente
	public Persona() {}
	
	//I overload del metodo costruttore
	public Persona(String n, String c, int e, boolean m) {
		nome =n;
		cognome = c;
		eta = e;
		maggiorenne = m;
	}
	
	//II overload del metodo costruttore
	public Persona(String n, String c ) {
		nome =n;
		cognome = c;
	}
	
	public void mangia(String cibo) {
		System.out.println("Sto mangiando " + cibo);
	}
	
	//overload del metodo mangia
	public void mangia(String pranzo,String cena) {
		System.out.println("Sto mangiando " + pranzo + " e a cena mangio " + cena );
	}
	
	public void dorme() {
		System.out.println("zzzzzzzzzzzzzzzz");
	}
	
	public boolean isMaggiorennE() {
		return eta>=18;
	}
	
	public void info() {
		System.out.println("La persona si chiama: " + nome +
							". Ha " + eta + " anni, " + 
							"è maggiorenne (" + maggiorenne + 
							") e ha come tutti " + NUMERO_OCCHI + " occhi");
	}
	
	//OverRide del metodo equals della classe Object del package Java.lang
	public boolean equals(Object obj) {
		if(obj instanceof Persona) {
			return this.eta == ((Persona)obj).eta&&
					this.nome.equals(((Persona)obj).nome) &&
					this.cognome.equals(((Persona)obj).cognome);
		}
		return false;
	}
	
	
	public boolean equals(Persona p) {
		return this.nome.equals(p.nome);
	}
	
}
