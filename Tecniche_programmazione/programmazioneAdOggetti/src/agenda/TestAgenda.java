package agenda;

public class TestAgenda {
	public static void main(String[] args) {
		
		Impegno i1 = new Impegno("Java");
		Impegno i2 = new Impegno("Sql");
		Impegno i3 = new Impegno("Javascript");
		Impegno i4 = new Impegno("Algoritmi");
		
		Pagina pagLunedì = new Pagina("Lunedì", new Impegno[]{i1,i2});
		Pagina pagMartedì = new Pagina("Martedì", new Impegno[]{i1,i3});
		//... tutti i giorni della settimana
		Pagina pagVenerdì = new Pagina("Venerdì", new Impegno[]{i3,i4});
		
		Settimana s1 = new Settimana();
		
		s1.pagine[0] = pagLunedì; 
		s1.pagine[1] = pagMartedì; 
		//... tutte le pagine
		s1.pagine[2] = pagVenerdì;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(s1.pagine[i]);//to string dell'elemento iesimo dell'array pagine
		}
		
	}
}
