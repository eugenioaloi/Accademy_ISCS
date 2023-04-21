package impiegatiDB;

public class Impiegato extends Persona{

	int matricola;
	String lavoro;
	double salario;
	
	public Impiegato(String nome, String cognome, int eta, int matricola, String lavoro, double salario) {
		super(nome, cognome, eta);
		this.matricola = matricola;
		this.lavoro = lavoro;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Impiegato [matricola=" + matricola + ", lavoro=" + lavoro + ", salario=" + salario + super.toString();
	}
	
	
	
	
	
}
