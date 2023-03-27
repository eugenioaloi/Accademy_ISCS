package strumenti;

public class TestStrumento {
	public static void main(String[] args) {
		
		Strumento st = new Strumento("generico");
		
		Chitarra c = new Chitarra("XX", 6);
		Pianoforte p = new Pianoforte("yy", 25);
		Tromba t = new Tromba("zz", 10);
		
		st.suona();
		c.suona();
		p.suona();
		t.suona();
		
		Strumento[] strumenti= {c,p,t};
		
		//polimorfismo- chiamare un metodo definito in diverse classi e chiamare la stessa istruzione per richiamare il metodo 
		// associato all'istanza. es. Chitarra.suona() diverso da Tromba.suona etc
		for (Strumento strum: strumenti) {
			strum.suona();
		}
		
	}
}
