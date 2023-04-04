package classiAnonime;

public class TestAnonima {
	public static void main(String[] args) {
		
		Anonima an = new Anonima();
		an.saluta();
		an.mangia();
		
		Anonima an2 = new Anonima();
		an2.saluta();
		an2.mangia();
		
		//se volessi far salutare in inglese senza toccare la classe Anonima, posso fare ovveride dell'oggetto istanziato dalla classe
		//e andare a ridefinire il metodo che mi interessa
		
		Anonima an3 = new Anonima() {
			public void saluta() {
				System.out.println("Hello world");
			}
			
		};
		
		an3.saluta();//Hello world  
		
		//Non si possono definire nuovi metodi nelle classi anonime, o meglio si possono definire ma non si possono chiamare se non
		//esistono nel modello originale della classe. 
		//Per essere richiamato il metodo può essere asserito all'interno di un metodo che già esiste nel modello
		
		Anonima an4 = new Anonima() {
			public void saluta() {
				System.out.println("Bonjuor monde");
				canta();
			}
			public void canta() {
				System.out.println("chanzon la, la");
			}
		};
		
		an4.saluta();//Bonjuor monde + canta() ;
		
		
		
	}
}
