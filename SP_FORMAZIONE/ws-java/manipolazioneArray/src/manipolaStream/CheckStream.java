package manipolaStream;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class CheckStream {
	
	/*
	 * Verifica la sequenza di nomi files passati in una Stringa. La stringa contiene tutti i nomi dei file
	 *  separati da spazi come segue 
	 *  -> String = "1994-12-01 845 very-long-filename.rar 1988-11-05 400 file1.txt , etc"
	 * 
	 * Il programma si stoppa in caso di un input non valido se nelle stringa vengono passati file con le seguenti condizioni
	 * -------------------------------------------------
	 * 
	 * 1) Se size > (240K) scartare il nome file
	 * 2) Se non c'è estensione (.) 
	 * 3) Se non c'è un suffisso dopo .  
	 * 4) Se il suffisso è diverso da rar zip tgz  
	 * 5) I files devono essere datati prima del 13 Ottobre 1995
	 *    - Usare LocalDate.of(yyy,mm,gg) per creare una data e LocalDate.iBefore()
	 *      per confrontare le date
	 *      
	 * --------------------------------------------
	 * Utilizzare il metodo checkFiles() che restituisce invalid input o il numero di file corretti passati
	 */
	
	List<ModelFile> listaFile;
	ModelFile modelFile;
	
	public static void main(String[] args) {
		CheckStream cs = new CheckStream();
		cs.run();
	}
	
	
	public void run() {
		String stream = 
		"1994-12-01 845 very-long-filename.rar ";
		/*
		+ "1988-11-05 400 file1.txt "
		+ "1995-10-12 245760 old-photos.tgz "
		+ "1989-11-05 245761 file2.rar "
		+ "A988-08-29 956 system.zip ";
		 * */
		
		System.out.println(soluzione(stream));
		
	}
	
	public String soluzione (String s) {
		
		//si dichiarano i parametri di data, dim, path(nomeFile.estension)
		String data = "";
		long dim = 0;
		String path = "";
		
		String estensione = "";//serve a recuperare l'estensione
		int indicePunto= 0;//indica l'indice in cui si trova l'indice nella stringa path
		
		int conto = 0;//conta il numero di file OK
		String msg = "";//ritorna il msg all'utente
		
		//le variabili yyyy,mm,dd servono a controllare anno, mese e giorno passato dalla Stringa
		int yyyy;
		int mm;
		int dd;
		
		Scanner sc = new Scanner(s);
		
		while (sc.hasNext()) {
			data = sc.next();
			if(!sc.hasNextLong()){
				return ("invalid input");
			}
			dim = sc.nextLong();
			/*
			if(sc.hasNext()) {
				return ("invalid input");
			}*/
			
			path = sc.next();
			
			//le colonne data,dim,path sono ora disponibili
			
			//si controlla la dimensione (240*1024)
			if(dim > (240*1024)) {
				continue;
			}
			
			//si controlla se esiste il punto e cosa c'è dopo
			indicePunto = path.indexOf(".");
			estensione = path.substring(++indicePunto);
			
			//si controlla il suffisso
			if(indicePunto<0) {//se non trova l'indice del punto vuol dire che non c'è il punto
				return ("invalid input");
			}
			
			//si controlla l'estensione
			if(!estensione.contentEquals("zip") && !estensione.contentEquals("rar") 
					&& !estensione.contentEquals("tgz")) {
				return ("invalid input");
			}
			
			//si controlla la data
			LocalDate dataLimite = LocalDate.of(1995, 10, 13);
			
			//con l'utilizzo di try/catch si controlla che le date siano corrette
			
			try {
				yyyy = Integer.parseInt(data.substring(0,4));
				mm = Integer.parseInt(data.substring(5,7));
				dd = Integer.parseInt(data.substring(8));
			} catch (Exception e) {
				return ("invalid input");
			}
			
			LocalDate dataDaControllare = LocalDate.of(yyyy, mm, dd);
			System.out.println(dataDaControllare);
			
			if(dataDaControllare.isBefore(dataLimite)) {
				conto++;
			}
			
		}
		
			if(conto==0) {
				msg = "invalid input";
			}else {
				msg = Integer.toString(conto) ;
			}
			
			return msg;
	}
	
	//classe inestata
	class ModelFile{
		String data;
		Long dim;
		String path;
	}

}
