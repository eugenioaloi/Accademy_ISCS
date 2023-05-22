package view;

import java.io.FileNotFoundException;

import model.BattagliaNavale;

public class MainBattagliaNavale {
	public static void main(String[] args) {
		run();
	}

	private static void run() {
		BattagliaNavale bn = new BattagliaNavale();
		try {
			bn.leggiFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
