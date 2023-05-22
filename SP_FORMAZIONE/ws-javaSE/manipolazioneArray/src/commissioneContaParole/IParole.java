package commissioneContaParole;

public interface IParole {
	
	void addParola(String parola);
	
	boolean existsParola(String parola);//restituisce se la parola esiste già 
	
	void deleteParola(String parola);
	
	int contaParole();
	
	int occorrenzaParola(String parola);
	
	String parolaConMaxOccorrenze();
	
	int maxOccorenzeNum();
	
	String [] paroleArray();//restituisce l'array di parole ordinate in base alle parole inserite 
	
}
