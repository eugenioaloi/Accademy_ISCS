package istScolastico;

import java.util.Scanner;

public class TestRegistro {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Studente[] studenti = {new Studente("Paolino", "Paperino", "m", 20),
								new Studente("Paolino", "Paperino", "m", 20),
								new Studente("Paolino", "Paperino", "m", 20),
		};
		
		for(Studente s: studenti) {
			System.out.println("Inserisci il voto di italiano per lo studente " + s.getNome());
			s.ottieniVoto(new Voto("italiano",sc.nextInt()));
			sc.nextLine();
			System.out.println("Inserisci il voto di storia per lo studente " + s.getNome());
			s.ottieniVoto(new Voto("storia",sc.nextInt()));
			sc.nextLine();
			System.out.println("Inserisci il voto di italiano per lo studente " + s.getNome());
			s.ottieniVoto(new Voto("storia",sc.nextInt()));
			sc.nextLine();
		
			if(s.mediaVoti()>=6) {
				System.out.println(s + " media: " + s.mediaVoti() + "-> promosso");
			}else {
				System.out.println(s + " media: " + s.mediaVoti() + "-> promosso");
			}
		}
		
		sc.close();
		
	}
}
