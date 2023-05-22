package service;

public interface IScheda {
	
	void setNome(String nome);
	void setIndirizzo(String indirizzo);
	void setNum_telefono(String num_telefono);

	String getNome();
	String getIndirizzo();
	String getNum_telefono();
	
	boolean contains(String s);
	boolean equals(Object s);

}
