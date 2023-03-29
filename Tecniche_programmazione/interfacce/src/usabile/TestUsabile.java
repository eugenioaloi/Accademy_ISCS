package usabile;

public class TestUsabile {
	public static void main(String[] args) {
		
		
		
		Usabile[] oggUsabili = {new Computer(), new Martello(),new Macchina()};
		
		for(Usabile ogg:oggUsabili) {
			ogg.usa();
		}
		
		Computer c = new Computer();
		utilizza(c);
		
	}
	
	//posso creare dei metodi in grado di prendere classi che estendono delle interfacce
	public static void utilizza(Usabile u) {
		u.usa();
	}
	
}
