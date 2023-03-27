package istanze;

public class Cane {
	
	private String nome,razza;
	private int eta;
	
	public Cane(String nome,String razza,int eta) {
		setNome(nome);
		setRazza(razza);
		setEta(eta);
	}
	
	public void abbaia() {
		System.out.println("Bau bau");
	}
	
	public void ringhia() {
		System.out.println("Grr grr");
	}
	
	public void mangia(String cibo) {
		System.out.println("Mangia: " + cibo);
	}
	
	public String toString() {
		return getNome()+ " " + getRazza()+" " + getEta();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Cane) {
			return this.eta == ((Cane)obj).eta&&
					this.razza.equals(((Cane)obj).razza) &&
					this.razza.equals(((Cane)obj).nome);
		}
		return false;
	}
	
	public boolean equalsNome(Cane c) {
		return this.nome == c.nome;
	}
	
	
	//**** GETTERS AND SETTERS ****

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRazza() {
		return razza;
	}

	public void setRazza(String razza) {
		this.razza = razza;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	
}
