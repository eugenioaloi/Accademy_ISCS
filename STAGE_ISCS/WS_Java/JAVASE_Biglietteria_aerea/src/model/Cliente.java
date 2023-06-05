package model;

public class Cliente {
	
	private String codCliente;

	private String nome;

	private String cognome;

	public Cliente(String codCliente, String nome, String cognome) {
		this.codCliente = codCliente;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Cliente [codCliente=" + codCliente + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
}
