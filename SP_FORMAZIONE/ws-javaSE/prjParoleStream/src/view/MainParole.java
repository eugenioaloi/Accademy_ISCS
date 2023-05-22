package view;

import java.util.Arrays;

import controller.Parole;

public class MainParole {
	public static void main(String[] args) {
		MainParole mp = new MainParole();
		mp.run();
	}
	
	public void run() {
		Parole p = new Parole("parole.txt");
		p.parolaPiuPiccola(3);
		
	}

}
