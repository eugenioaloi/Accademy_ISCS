package letturaFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) {
		
		//try {
			//FileWriter fw = new FileWriter("Esempio.txt");
		
		//scrittura del file
		try(FileWriter  fw = new FileWriter("Esempio.txt")){//<- try with resource
			fw.write("Prima riga del file\n");
			fw.write("Seconda riga del file\n");
			fw.write("Terza riga del file\n");
			fw.close();
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}
		
		File file = new File("Esempio.txt");
		
		//System.out.println("Il file esiste? " + file.exists());//true se esiste
		System.out.println("Dove è salvato il file? " + file.getAbsolutePath() );
		//System.out.println("E' una cartella? " + file.isDirectory());
		
		//aggiunta righe al file
		try {
			FileWriter fw = new FileWriter(file, true);//si accodano delle righe se il secondo param è settato a true
			fw.write("riga 1 aggiunta\n");
			fw.write("riga 2 aggiunta\n");
			fw.write("riga 3 aggiunta\n");
			fw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int lettere;
		
		//lettura
		try {
			FileReader fr = new FileReader(file);
			while(fr.ready()) {
				lettere = fr.read();
				System.out.print((char)lettere);
			}
			fr.close();
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
		
		
		
		
		
		
	}//main
}
