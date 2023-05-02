package matrice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Matrice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci il numero di righe");
		int nRighe = sc.nextInt();
		System.out.println("Inserisci il numero di colonne");
		int nColonne = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Inserisci il nome del file della nuova matrice");
		String path = sc.nextLine();
		
		//Si prende il path del file
		File file = new File("matrice.txt");
		
		try {
			String [][] matriceNumerica = creaMatriceDaFile(nRighe, nColonne, file);
			//leggiMatrice(matriceNumerica, nColonne); <- stampa la matrice in console
			creaNuovoFileMatrice(path,matriceNumerica,nColonne);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
		
	}//main
	
	
	//restituisce una matrice passata da un qualsiasi file
	public static String [][] creaMatriceDaFile(int nRighe, int nColonne, File file) throws IOException {
		
		String [][] matriceNumerica = new String [nRighe][nColonne];
		
		for(int i= 0;i<nRighe;i++) {
			String line = Files.readAllLines(Paths.get(file.getAbsolutePath())).get(i);
			for (int j = 0; j < nColonne; j++) {
				String [] tokens = line.split(" ");
				matriceNumerica[i] = tokens;
			}
		}
		return matriceNumerica;
	}
	
	//crea un nuovo file passando una matrice
	public static void creaNuovoFileMatrice(String path, String [][] matriceNumerica, int nColonne ) throws IOException {
		FileWriter fw = new FileWriter(path+".txt");
		for (int i = 0; i < matriceNumerica.length; i++) {
			for (int j = 0; j < nColonne; j++) {
				fw.write(matriceNumerica[i][j]+" ");
			}
			fw.write("\n");
		}
		fw.close();
	}
	
	//legge qualsiasi matrice passata
	public static void leggiMatrice(String [][] matriceNumerica, int nColonne ) {
		for (int i = 0; i < matriceNumerica.length; i++) {
			System.out.println();
			for (int j = 0; j < nColonne; j++) {
				System.out.print(matriceNumerica[i][j]+" ");
			}
		}
	}

}
