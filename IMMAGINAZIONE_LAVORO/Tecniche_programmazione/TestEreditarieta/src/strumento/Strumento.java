package strumento;

public class Strumento {
		
	private String nome;
	
	public Strumento(String nome) {
		this.nome = nome;
	}
	
	public void suona() {
		System.out.println("Tutti gli strumenti suonano");
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
		
		
		

}
