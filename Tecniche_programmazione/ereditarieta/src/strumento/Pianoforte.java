package strumento;

public class Pianoforte extends Strumento{
	
	private int numeroTasti;

	public Pianoforte(String nome, int numeroTasti) {
		super(nome);
		this.numeroTasti = numeroTasti;
	}

	@Override
	public void suona() {
		System.out.println("il pianoforte si suona con i tasti");
	}
	
	public int getNumeroTasti() {
		return numeroTasti;
	}
	
	public void setNumeroTasti(int numeroTasti) {
		this.numeroTasti = numeroTasti;
	}
	
	
}
