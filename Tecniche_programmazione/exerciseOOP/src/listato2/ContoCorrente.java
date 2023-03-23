package listato2;

public class ContoCorrente {
	
	//params depositoIniziale, nomeCliente assegnati al momento dell'apertura del conto
	
	//metodi 1)preleva 2)versa 3)stampaSaldo 4)stampa nome e saldo del conto 
	//il numero del conto deve essere un numero progressivo diverso per ogni cliente e assegnato in automatico dal sistema
	
	//se il conto è in rosso impedire alla persona di prelevare
	
	private int depositoIniziale,saldo;
	private String nomeCliente, codConto;
	
	public ContoCorrente(int depositoIniziale, String nomeCliente, String codConto) {
		setDepositoIniziale(depositoIniziale);
		setNomeCliente(nomeCliente);
		setCodConto(codConto);
	}

	//preleva
	public int preleva(int prelievo) {
		depositoIniziale = saldo>0 && prelievo<saldo ? saldo -= prelievo: saldo;
		return depositoIniziale;
	}

	//versa
	public int versa(int versamento) {
		saldo += versamento;
		return saldo;
	}
	
	//stampa Saldo
	public void stampasaldo() {
		System.out.println("Sul conto ci sono:" + saldo + " €");
	}
	
	//stampa Nome e Saldo del conto
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

	public String getCodConto() {
		return codConto;
	}

	public void setCodConto(String codConto) {
		this.codConto = codConto;
	}
	
	
	
	
}
