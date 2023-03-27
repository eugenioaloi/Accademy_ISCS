package strumenti;

public class Chitarra extends Strumento {
	
	private int numCorde;
	
	public Chitarra(String nome, int numeroCorde) {
		super(nome);
		this.numCorde = numeroCorde;
	}
	
	@Override
	public void suona() {
		System.out.println("La chitarra si suona con le corde");
	}
	
	public int getNumCorde() {
		return numCorde;
	}
	
	public void setNumCorde(int numCorde) {
		this.numCorde = numCorde;
	}
	

}
