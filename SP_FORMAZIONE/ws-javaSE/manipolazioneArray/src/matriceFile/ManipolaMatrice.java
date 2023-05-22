package matriceFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ManipolaMatrice {
	
	public static void main(String[] args) {
		
		/*
		try {
			LetturaDaFile.leggiFile("matrice.txt");<- metodo che legge direttamente il file
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		Scanner sc = new Scanner(System.in);
		
		ManipolaMatrice mm = new ManipolaMatrice();
		
		System.out.println("Inserisci il numero di righe");
		int righe= sc.nextInt();
		System.out.println("Inserisci il numero di colonne");
		int colonne = sc.nextInt();
		
		mm.leggiDimensioni(righe, colonne);
		
		//Si passa il file che si vuole leggere
		File file = new File("matrice.txt");
		
		try {
			
			/*Chiama il metodo leggiDimensioni che restuisce la dim della matrice.
			 * restituisce una matrice in base alla dimensione dichiarata*/
			String [][] matriceNumerica = caricaMatrice(file, righe, colonne);
			
			//stampaMatrice(matriceNumerica, colonne); //<- Stampa la matrice in console
			
			// Crea un nuovo file leggendo la matrice dinamica in base al file originariamente passato
			creaNuovoFileMatrice(matriceNumerica, colonne);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//main
	
	//crea una matrice di dimensione dinamica
	public int[] leggiDimensioni(int righe, int colonne) {
		
		int [] dimMatrice = {righe, colonne};
		
		return dimMatrice;
	}
	
	//restituisce una matrice passata da un qualsiasi file e stampa il num di righe e colonne richieste
	public static String [][] caricaMatrice(File file, int nRighe, int nColonne) throws IOException {
		
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
	
	//legge qualsiasi matrice passata e ne stampa n colonne richieste
	public static void stampaMatrice(String [][] matriceNumerica, int nColonne) {
		for (int i = 0; i < matriceNumerica.length; i++) {
			System.out.println();
			for (int j = 0; j < nColonne; j++) {
				System.out.print(matriceNumerica[i][j]+" ");
			}
		}
	}

	//crea un nuovo file.txt con una matrice passata in input
	//crea un nuovo file passando una matrice
	public static void creaNuovoFileMatrice(String [][] matriceNumerica, int nColonne) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nInserisci il nome del file della nuova matrice");
		String path= sc.nextLine();
		
		FileWriter fw = new FileWriter(path+".txt");
		for (int i = 0; i < matriceNumerica.length; i++) {
			for (int j = 0; j < nColonne; j++) {
				fw.write(matriceNumerica[i][j]+" ");
			}
			fw.write("\n");
		}
		System.out.println("scrittura completata");
		fw.close();
	}
	

}
