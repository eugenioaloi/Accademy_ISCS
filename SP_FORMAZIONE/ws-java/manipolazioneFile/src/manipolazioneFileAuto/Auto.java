package manipolazioneFileAuto;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Auto implements IAuto{
	
	private List<String> autoOK;
	private List<String> autoKO;
	private List<String> produttoriFile;
	private List<String> modelliFile;
	
	/*
	 * Leggere un file con informazioni da decodificare. Il file, per ogni riga, contiene 2 valori, 
	 * tutti di lunghezza variabile, separati da space:
	 * 
	 * Esempio di file
	 * 
	 * FIAT PANDA
	 * FIAT TIPO
	 * AUDI QUATTRO
	 * 
	 * Si vuole analizzare il file, scartare le righe con fabbriche di auto non definite e/o di modelli non previsti.
	 * Si vogliono ottenere le informazioni del file in input.
	 * Il problema deve essere risolto a livello DICHIARATIVO senza specifiche IF nel programma, con una Enumeration
	 * 
	 * Elencare i fornitori di auto e per ogni auto i modelli.

	 * - Si definisca una Exception AutoFileInputEmpty da lanciare in caso di file vuoto o inesistente 

	 */
	
	public Auto() {
		init();
	}
	
	private void init() {
		this.autoOK = new ArrayList<>();
		this.autoKO = new ArrayList<>();
		this.produttoriFile = new ArrayList<>();
		this.modelliFile = new ArrayList<>();
		try {
			File myFile = new File("test.txt");
			Scanner sc = new Scanner(myFile);
			
			while (sc.hasNextLine()) {
				String data = sc.nextLine();
				String valori[] = data.split(" ");
				
				//aggiungere il controllo sulla riga
				if(valori.length!=2) {
					this.autoKO.add(valori[0]);
				}else {
					produttoriFile.add(valori[0]);
					modelliFile.add(valori[1]);
				}
				
			}
			for(int i=0;i<produttoriFile.size();i++) {
				String produttore = produttoriFile.get(i);
				String modello = modelliFile.get(i);
				if(existsModel(produttore, modello)) {
					this.autoOK.add(produttore+" " +modello);
				}else {
					this.autoKO.add(produttore+" " +modello);
				}
			}
			sc.close();
		} catch (Exception e) {
			//implementare la classe anonima per risolvere l'eccezione
			
			/*
			class ExceptionAutoFileInputEmpty extends Exception{
				public static void eccezione() throws Exception {
					throw new Exception("File non trovato");
				}
			}
			
			ExceptionAutoFileInputEmpty eccezione = new ExceptionAutoFileInputEmpty();
			eccezione.getMessage();
			 * */
			
		}
	}

	@Override
	public String[] rowsWrong() {
		return autoKO.toArray(new String[autoKO.size()]);
	}

	@Override
	public String[] rowsGood() {
		return autoOK.toArray(new String[autoOK.size()]);
	}

	@Override
	public String[] autoProducers() {
		return produttoriFile.toArray(new String[produttoriFile.size()]);
	}

	@Override
	public boolean existsProducer(String produttoreAuto) {
		for(String produttore:definedProducers()) {
			if(produttore.contentEquals(produttoreAuto)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean existsModel(String produttoreAuto, String modelloAuto) {
		boolean exists = false;
		try {
			EnumAuto enAuto = EnumAuto.valueOf(EnumAuto.class, produttoreAuto);
			for(String modello:enAuto.getModelli()) {
				if(existsProducer(produttoreAuto)&&modello.contentEquals(modelloAuto)) {
					return true;
				}
			}
		} catch (Exception e) {
		}
		return exists;
	}

	@Override
	public String[] definedProducers() {
		List<String> produttori = new ArrayList<>();
		for(EnumAuto auto: EnumAuto.values()) {
			produttori.add(auto.toString());
		}
		return produttori.toArray(new String[produttori.size()]);
	}
	
}
