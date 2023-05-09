package view;

import model.SchedaPersona;

public class MainSchedaPersona {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		SchedaPersona sp = new SchedaPersona("Mario Rossi", "via da qui", "+123");
		SchedaPersona sp1 = new SchedaPersona(" x", " via da qui", "-456");
		
		boolean bul = sp.equals(sp1);
		
		//implementare il metodo per equals/contain
		
		System.out.println(bul);
		
	}

}
