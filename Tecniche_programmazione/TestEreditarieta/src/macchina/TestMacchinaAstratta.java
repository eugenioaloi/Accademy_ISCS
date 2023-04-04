package macchina;

public class TestMacchinaAstratta {
	public static void main(String[] args) {
		
		MacchinaAstratta au = new Audi();
		MacchinaAstratta te = new Tesla();
		
		//field hiding
		//non è possibile fare l'override delle var di classee
		
		System.out.println(au.prezzo);
		System.out.println(au.prezzo);
		
		au.descrizione();
		te.descrizione();
		
		//non è possibile nemmeno fare l'override di un metodo statico
		au.alimentazione();
		
		System.out.println("inserimento oggetto anonimo\n");
		
		MacchinaAstratta mastr = new Audi() {
			int prezzo = 999;
			
			@Override
			void prezzo() {
				System.out.println("Il prezzo della mastr è " + prezzo);
			}

			@Override
			void descrizione() {
				System.out.println("Descrizione di mastr");
			}
		};
		
		mastr.prezzo();
		mastr.descrizione();
		
		
		MacchinaAstratta[] macchineAsmr = {au,te,mastr};
		
		for (MacchinaAstratta m : macchineAsmr) {
			m.prezzo();
			m.descrizione();
		}
		
		
	}

}
