package matrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetturaFile {
	
	public static void leggiFile() {
		try {
			File myFile = new File("nomeFile.txt");
			Scanner sc = new Scanner(myFile);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

}
