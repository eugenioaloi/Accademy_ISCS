package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BattagliaNavale {
	
	public void leggiFile() throws FileNotFoundException {
		File filePath = new File("campoBattaglia.txt");
		String row = "";
		
		Scanner sc = new Scanner(filePath);
		Scanner scRow = null;
		
		while (sc.hasNext()) {
			
			row=sc.nextLine();
			
			System.out.println(row);
			
		}
		
		
		
		
		
	}

}
