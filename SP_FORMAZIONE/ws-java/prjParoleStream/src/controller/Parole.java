package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


import service.IParole;

public class Parole implements IParole{
	
	List<String> listaParole;
	
	public Parole(String filePath) {
		init(filePath);
	}

	public void init(String filePath) {
		listaParole = new ArrayList<>();
		File file = new File(filePath);
		try {
			Scanner sc = new Scanner(file);
			Scanner scRow = null;
			
			String row;
			
			while(sc.hasNextLine()) {
				row = sc.nextLine();
				
				if(row.isEmpty()) {
					continue;
				}
				
				String [] s = row.split(" ");
				
				for(String str:s) {
					listaParole.add(str);
				}
			}
			
			sc.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int countAll() {
		return (int) listaParole.stream().count();
		//.filter(s->!s.isEmpty())
	}

	@Override
	public String[] parole() {
		return listaParole.toArray(new String[listaParole.size()]);
	}

	@Override
	public long count(String parola) {
		return listaParole.stream().
				filter(el->el.equals(parola))
				.count();
	}

	@Override
	public String parolaMax() {
		
		return listaParole.stream()
				.sorted()
				.max(Comparator.
				comparingInt(String::length)).get();
	}

	@Override
	public String[] parolaPiuPiccola(int numChar) {
		
		
		return null;
	}

}
