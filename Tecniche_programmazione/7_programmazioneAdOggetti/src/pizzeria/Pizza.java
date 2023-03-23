package pizzeria;

public class Pizza {
	
	private String farina;
	private String salsa;
	private String mozzarella;
	private String extra;
	
	
	//costruttore di default
	public Pizza() {
	}

	/*
	 *ingredienti per preparare tutti i tipi di pizza
	 *@params farina 
	 *@params salsa 
	 *@params mozzarella 
	 *@params extra 
	 * **/
	public Pizza(String farina, String salsa, String mozzarella, String extra) {
		this.farina = farina;
		this.salsa = salsa;
		this.mozzarella = mozzarella;
		this.extra = extra;
	}
	
	/*
	 *ingredienti per preparare la margherita
	 *@params farina 
	 *@params salsa 
	 *@params mozzarella 
	 * **/
	public Pizza(String farina, String salsa, String mozzarella) {
		this.farina = farina;
		this.salsa = salsa;
		this.mozzarella = mozzarella;
	}
	
	/*
	 *ingredienti per preparare la pizza rossa senza mozzarella
	 *@params farina 
	 *@params salsa 
	 * **/
	public Pizza(String farina, String salsa) {
		this.farina = farina;
		this.salsa = salsa;
	}

	/*
	 *ingredienti per preparare la focaccia
	 *@params farina 
	 * **/
	public Pizza(String farina) {
		this.farina = farina;
	}
	
	//GETTERS AND SETTERS
	public String getFarina() {
		return farina;
	}
	
	public void setFarina(String farina) {
		this.farina = farina;
	}
	
	public String getSalsa() {
		return salsa;
	}
	
	public void setSalsa(String salsa) {
		this.salsa = salsa;
	}
	
	public String getMozzarella() {
		return mozzarella;
	}
	
	public void setMozzarella(String mozzarella) {
		this.mozzarella = mozzarella;
	}
	
	public String getExtra() {
		return extra;
	}
	
	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	@Override
	public String toString() {
		return "Pizza, ingredienti: " + farina + salsa + mozzarella + extra ;
	}
	
	
	
	
	

}
