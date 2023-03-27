package persona;

public class Persona {
	
	public String nome;
	public String cognome;
	public int eta;
	public boolean maggiorenne;
	public final int NUMERO_OCCHI=2;//le costanti sono dichiarati con final e con convenzione il nome in maiuscolo
	
	public Persona() {}
	
	public Persona(String n, String c, int e, boolean m) {
		nome =n;
		cognome = c;
		eta = e;
		maggiorenne = m;
	}
	
	public Persona(String n, String c ) {
		nome =n;
		cognome = c;
	}
	
	public void mangia(String cibo) {
		System.out.println("Sto mangiando " + cibo);
	}
	
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
	
	public boolean equals(Persona p) {
		return this.nome.equals(p.nome);
	}
	
}
