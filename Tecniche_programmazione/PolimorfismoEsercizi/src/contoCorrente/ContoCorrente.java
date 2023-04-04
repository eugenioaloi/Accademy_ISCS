package contoCorrente;

public class ContoCorrente {
	
	//params depositoIniziale, nomeCliente assegnati al momento dell'apertura del conto
	
	//metodi 1)preleva 2)versa 3)stampaSaldo 4)stampa nome e saldo del conto 
	//il numero del conto deve essere un numero progressivo diverso per ogni cliente e assegnato in automatico dal sistema
	
	//se il conto è in rosso impedire alla persona di prelevare
	
	
	/*
	 *@params depositoIniziale
	 *@params saldo
	 *@params nomeCliente
	 *@params codConto
	 * */
	private int depositoIniziale;
	private int saldo;
	private String nomeCliente;
	private int codConto;
	
	/*
	 * @params codice, serve per generare un numero di codice ogni volta che si crea un oggetto di tipo Contocorrente
	 * */
	static int codice=0;
	
	public ContoCorrente(int depositoIniziale, String nomeCliente) {
		setSaldo(depositoIniziale);
		setNomeCliente(nomeCliente);
		codice++;
		setCodConto(codice);
	}
	/*
	 * metodo in grado di controllare se il saldo non è a zero
	 * @return boolean
	 * */
	public boolean noPrelievo() {
		return saldo>0 ;
	}
	
	/*
	 * metodo preleva -> controlla lo stato del conto e impedisce la persona il prelievo se rischia di andare in rosso
	 * @params prelievo, int
	 * @return int
	 * */
	public int preleva(int prelievo) {
		if(noPrelievo() && prelievo<saldo) {
			saldo -= prelievo;
		}else {
			System.out.println("Mi dispiace " + nomeCliente +" non puoi prelevare " + prelievo + "€ perche rischi di ritrovarti il conto in rosso."
					+ " Puoi prelevare al massimo " + saldo + "€");
		}
		return prelievo;
	}

	/*
	 * metodo versa -> permette di aumentare il saldo rispetto al versamento effettuato
	 * @params versamento, int
	 * @return int
	 * */
	public int versa(int versamento) {
		saldo += versamento;
		return versamento;
	}
	
	/*
	 * metodo stampaSaldo -> Stampa in console lo stato del conto (ammontare del Saldo)
	 * */
	public void stampasaldo() {
		System.out.println("Sul conto ci sono: " + saldo + " €");
	}
	
	/*
	 * metodo stampaSaldoENome -> Stampa in console lo stato del conto (ammontare del Saldo e nome associato)
	 * */
	public void stampaSaldoENome() {
		System.out.println("Sul conto di " + nomeCliente + " ci sono:" + saldo + " €" );
	}
	
	public int getDepositoIniziale() {
		return depositoIniziale;
	}

	public void setDepositoIniziale(int depositoIniziale) {
		this.depositoIniziale = depositoIniziale;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCodConto() {
		return codConto;
	}

	public void setCodConto(int codConto) {
		this.codConto = codConto;
	}
	
}
