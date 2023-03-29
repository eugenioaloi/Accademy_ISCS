package strumento;

public class Tromba extends Strumento{
	
	private int manopole;
	
	public Tromba(String nome, int manopole) {
		super(nome);
		this.manopole= manopole;
	}
	
	@Override
	public void suona() {
		System.out.println("la tromba si suona con le manopole");
	}
	
	public void setManopole(int manopole) {
		this.manopole = manopole;
	}
	
	public int getManopole() {
		return manopole;
	}

}
