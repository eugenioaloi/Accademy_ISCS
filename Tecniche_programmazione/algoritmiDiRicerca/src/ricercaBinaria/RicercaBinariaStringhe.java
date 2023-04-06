package ricercaBinaria;

public class RicercaBinariaStringhe {
	public static void main(String[] args) {
		
		String [] paroleACasaccio = {"anello", "bracciale", "collana", "diamante", "elicottero",
				"faraone", "gioeiello", "hotel", "i", "j", "k", "lampada", "mobile", "nave", 
				"orbita", "piatto", "quadro", "radio", "sedia", "tavolo", "uscita", "vaso","yogurt"};
		
		String s = "anello";
		
		int index = ricercaBinaria(paroleACasaccio, s);
		
		System.out.println("Stringa trovata all'indice: " +index);
		
		
	}

	private static int ricercaBinaria(String[] alfaphet, String s) {
		int basso = 0;
		int alto = alfaphet.length-1;
		
		while(basso<alto) {
			int meta = basso + (alto-basso)/2;
			String StrTrovata = alfaphet[meta];
			if(StrTrovata.compareTo(s)>0) {//la stringa trovata è più grande della stringa s
				//la stringa che cerco si trova a sx
				alto = meta -1;
			}else if(StrTrovata.compareTo(s)<0) {//la stringa trovata è più piccola della stringa s
				//la stringa che cerco si trova a dx
				basso = meta+1;
			}else {
				return meta;
			}
		}
		return -1;
	}
	
	
}
