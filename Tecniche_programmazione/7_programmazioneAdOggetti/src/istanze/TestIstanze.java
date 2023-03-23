package istanze;

public class TestIstanze {
	public static void main(String[] args) {
		
		/****** INZIO RIGA
		 ****** FINE RIGA  */
		
		Persona p = new Persona();
		p.nome = "Pippo";
		p.cognome = "Franco";
		p.eta = 54;
		p.maggiorenne = true;
		
		
		System.out.println(p.nome);
		System.out.println(p.cognome);
		System.out.println(p.eta);
		System.out.println(p.maggiorenne);
		
		System.out.println(p.isMaggiorennE());
		p.mangia("Pizza");
		p.mangia("pasta", "carne");
		
		p.info();//println di tutti gli altri attributi ascritti nella classe persona
		
		
		Persona p1 = new Persona();
		p1.nome = "Mario";
		p1.cognome = "Rosso";
		p1.eta = 16;
		p1.maggiorenne = false;
		
		Persona p2 = new Persona("Gino", "Latino",16, false);
		p2.info();
		
		Persona p3= new Persona("Luca","Verdi");
		p3.nome="Marco";
		
		
		//*************** Persona con gli attributi incapsulati
		System.out.println("***************************");
		System.out.println("Persona incapsulata \n");
		//i parametri vengono passati direttamente al costrutttore
		PersonaIncapsulata pinc = new PersonaIncapsulata("Ned","Flanders",60);
		
		//poi possono essere rivalorizzati con altri parametri a piacimento, l'importante che si rispetti il tipo di dato
		pinc.assegnaNome("Homer");
		pinc.assegnaCognome("Simpson");
		pinc.assegnaEta(36);
		
		System.out.println("Nome: " + pinc.leggiNome());//Homer
		System.out.println("Cognome: " +pinc.leggiCognome());//Simpson
		System.out.println("Eta: " + pinc.leggiEta());//36
		
		System.out.println(pinc.toString());//sono in grado di richiamare l'override del metodo to string per farmi ritornare gli att
		
		//Check se un'istanza della classe Persona equivale ad un'altra istanza della stessa
		p2.equals(p3);
		
		
		//********* Call to class Cane
		System.out.println("**** Istanze classe Cane **** \n");
		Cane c = new Cane("Biscotto", "Labrador", 5);
		System.out.println(c); //chiamata al metodo toString
		
		c.abbaia();
		c.ringhia();
		c.mangia("Crocchette");
		
		// creazione di un nuovo ogg di tipo Cane
		Cane c1 = new Cane("Balù", "Golden ret", 8);
		
		//controllo se i due cani sono uguali
		String msg = c.equalsNome(c1)?"sì":"no";
		
		System.out.println("Nomi uguali? " + msg);//false
		
		System.out.println("**** Istanze classe Auto ****\n");
		Auto a = new Auto("Audi", "TT", 2010, 30000);
		System.out.println(a);
		
		
	}
}
