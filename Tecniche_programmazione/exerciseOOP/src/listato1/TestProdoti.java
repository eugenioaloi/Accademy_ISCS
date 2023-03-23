package listato1;

public class TestProdoti {
	public static void main(String[] args) {
		
		Prodotto p = new Prodotto("UC23456", "Spagheti Gragniano", 1.10);
		
		//prodotto prima della promozione
		System.out.println(p);
		
		//si applica lo sconto sul prodotto in promozione
		p.applicaSconto(20);
		
		//prodotto dopo la promozione
		System.out.println(p);
		
	}

}
