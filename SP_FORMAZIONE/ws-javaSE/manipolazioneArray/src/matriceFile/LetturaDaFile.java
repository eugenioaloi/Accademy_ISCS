package matriceFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetturaDaFile {
	
	public static void leggiFile(String path) throws Exception {
			File myFile = new File(path);
			Scanner sc = new Scanner(myFile);
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			System.out.println("An error occurred.");
	}

}
