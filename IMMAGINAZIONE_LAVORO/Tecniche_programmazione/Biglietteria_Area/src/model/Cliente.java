package model;

public class Cliente {
	
	private String cod_cliente;
	private String nome;
	private String cognome;
	
	public Cliente() {};
	
	public Cliente(String cod_cliente,String nome, String cognome) {
		this.cod_cliente = cod_cliente;
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(String cod_cliente) {
		this.cod_cliente = cod_cliente;
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
		return "Cliente [cod_cliente=" + cod_cliente + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	
	
	

}
