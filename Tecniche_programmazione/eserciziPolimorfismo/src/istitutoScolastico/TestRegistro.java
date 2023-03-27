package istitutoScolastico;

public class TestRegistro {
	public static void main(String[] args) {
		
		Voto v1 = new Voto("Italiano", 5);
		Voto v2 = new Voto("Storia", 6);
		Voto v3 = new Voto("Geografia", 8);
		Voto v4 = new Voto("Storia", 6);
		
		Studente s1 = new Studente("pinco", "pallo", "m", 20, 110);
		Studente s2 = new Studente("pinco", "palla", "f", 20, 111);
		
		s1.ottieniVoto(s1, v1);
		s1.ottieniVoto(s1, v2);
		s1.ottieniVoto(s2, v3);
		s1.ottieniVoto(s2, v4);
		
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
