package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import model.User;
import service.ErrFileNotFound;
import service.IAccount;

public class GestioneAccount implements IAccount<User>{
	
	public static int SORT_ASCENDING = 0;
    public static int SORT_DESCENDING = 1;
	private List<String> righeOK;
	private List<String> righeKO;
	private Map<String, User> mappaUtenti;
	
	public GestioneAccount(String pathFile) {
		init(pathFile);
	}
	
	private void init(String pathFile) {
		this.righeOK= new ArrayList<>();
		this.righeKO= new ArrayList<>();
		this.mappaUtenti = new HashMap<>();
		
		//Scanners
		Scanner sc = null; Scanner scRow = null;
		
		//Token per il controllo del file negli scanners
		String row = ""; String checkToken = "";
		
		//Variabili per processare un utente
		String idUser = "";
		String nome = "";
		String cognome = "";
		String email = "";
		String indirizzo = "";
		
		try {
			File file = new File(pathFile);
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			ErrFileNotFound fileNotFound = new ErrFileNotFound(pathFile);
			fileNotFound.printStackTrace();
		}
		
		while(sc.hasNextLine()) {
			
			row = sc.nextLine();//estraggo la riga del file
			
			if(row.isBlank()) {
				continue;
			}
			
			scRow = new Scanner(row);//SI CONTROLLA CON UNO SCANNER LA NUOVA RIGA
			
			idUser = scRow.next();//Ho sicuramente l'id pronto
			
			// se non c'è nulla dopo l'user, la riga non è giusta
			if(!scRow.hasNext()) {
				addRigakO(row);
				continue;
			}
			
			checkToken = scRow.next();//controllo se il TOKEN è una mail o il nome+cognome
			
			//se è una mail ed è corretta la passo, altrimenti aggiungo l'intera riga alla lista righeKO
			if(isMail(checkToken)) {
				if(checkMail(checkToken)) {
					email = checkToken;
					addMail(idUser, email);
					continue;
				}else {
					righeKO.add(row);
				}
			}
			
			nome = checkToken;// se non è una mail è sicuramente nome etc
			
			//se ho la mail la posso aggiungere se esiste l'utente
			
			//se non c'è il cognome la riga è sbagliata - controllo se ho la mail proseguo, altrimenti inserisco la riga
			// nelle righeKO
			if(!scRow.hasNext()) {
				righeKO.add(row);
				continue;
			}
			
			cognome = scRow.next();
			
			//se non c'è l'indirizzo la riga è sbagliata
			if(!scRow.hasNext()) {
				righeKO.add(row);
				continue;
			}
			
			//Prendo il resto della linea
			indirizzo = scRow.nextLine();
			
			//Ho una riga corretta, ora posso processare l'utente
			if(!existsUser(idUser)) {
				addUser(idUser, nome, cognome, indirizzo);
			}else {
				addMail(idUser, email);
			}
			
		}
		
		//chiusura scanner
		scRow.close();
		sc.close();
	}

	@Override
	public boolean addUser(String idUser, String nome, String cognome, String indirizzo) {
		if(!existsUser(idUser) ) {
			mappaUtenti.put(idUser, new User(nome,cognome,indirizzo));
			return true;
		}
		return false;
	}

	@Override
	public boolean addMail(String idUser, String mail) {
		if(existsUser(idUser)) {
			User utente = mappaUtenti.get(idUser);
			Set<String> listaEmail = utente.getEmail();
			if(userHasMail(idUser)) {
				listaEmail.add(mail);
				return true;
			}else {
				listaEmail = new LinkedHashSet<>();
				listaEmail.add(mail);
				utente.setEmail(listaEmail);
				mappaUtenti.put(idUser, utente);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean existsUser(String idUser) {
		if (mappaUtenti.containsKey(idUser)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean userHasMail(String idUser) {
		if(existsUser(idUser)) {
			User utente = mappaUtenti.get(idUser);
			Set<String> listaEmail = utente.getEmail();
				if(!listaEmail.isEmpty()) {
					return true;
				}
		}
		return false;
	}

	@Override
	public Optional<User> user(String idUser) {
		return Optional.ofNullable(mappaUtenti.get(idUser));
	}

	@Override
	public String[] idUsers(int sortType) {
		List<String> listaId = new ArrayList<>();
		for(String id:mappaUtenti.keySet()) {
			listaId.add(id);
		}
		if(sortType== SORT_ASCENDING) {//ascendente 
			Collections.sort(listaId);
		}else {//discendente
			Collections.sort(listaId, new Comparator<String>() {
				public int compare(String o1,String o2) {
					return o2.compareTo(o1);
				}
			});
		}
		return listaId.toArray(new String[listaId.size()]);
	}	

	@Override
	public String[] userMails(String idUser) {
		Set<String> listaEmail = null;
		if(existsUser(idUser)) {
			User utente = mappaUtenti.get(idUser);
			listaEmail = utente.getEmail();
		}
		return listaEmail.toArray(new String[listaEmail.size()]);
	}

	@Override
	public User[] users(int sortType) {
		List<User> listaUsers = new ArrayList<>();
		
		for(String id: mappaUtenti.keySet()) {
			listaUsers.add(mappaUtenti.get(id));
		}
		
		if(sortType==SORT_ASCENDING) {
			sortUsersASC(listaUsers);
		}else {
			sortUsersDESC(listaUsers);
		}
		return listaUsers.toArray(new User[listaUsers.size()]);
	}
	
	@Override
	public User firstUser() {
		List<User> listaUtenti = new ArrayList<>();
		Collection<User> setUser = mappaUtenti.values();
		listaUtenti.addAll(setUser);
		
		
		return listaUtenti.get(0);
	}

	@Override
	public User lastUser() {
		List<User> listaUtenti = new ArrayList<>();
		Collection<User> setUser = mappaUtenti.values();
		listaUtenti.addAll(setUser);
		
		return listaUtenti.get(listaUtenti.size()-1);
	}

	@Override
	public User[] firstUsers(int numUsers) {
		List<User> listaUtenti = new ArrayList<>();
		for(int i=0;i<numUsers;i++) {
			listaUtenti.add(mappaUtenti.get(i));
		}
		sortUsersASC(listaUtenti);
		
		return listaUtenti.toArray(new User[listaUtenti.size()]);
	}

	@Override
	public User[] lastUsers(int numUsers) {
		List<User> listaUtenti = new ArrayList<>();
		for(int i=numUsers;i<listaUtenti.size();i++) {
			listaUtenti.add(mappaUtenti.get(i));
		}
		sortUsersASC(listaUtenti);
		
		return listaUtenti.toArray(new User[listaUtenti.size()]);
	}

	@Override
	public String[] discardedRows() {
		return righeKO.toArray(new String[righeKO.size()]);
	}

	@Override
	/*@ Ordinate in ordine ascendente*/
	public String[] allMails() {//
		Set<String> emailSet = new TreeSet<>();
		for(String id: mappaUtenti.keySet()) {
			User user = mappaUtenti.get(id);
			for(String email:user.getEmail()) {
				emailSet.add(email);
			}
		}
		return emailSet.toArray(new String[emailSet.size()]);
	}
	
	//*********** Metodi aggiunti dopo l'interfaccia ***********
	

	//**** metodi aggiunti dopo l'interfaccia
	
	public boolean addRigakO(String riga) {
		if(!riga.isEmpty()) {
			this.righeKO.add(riga);
			return true;
		}
		return false;
	}
	
	
	public boolean addRigaOK(String riga) {
		if(!riga.isEmpty()) {
			this.righeOK.add(riga);
			return true;
		}
		return false;
	}
	
	
	public boolean checkMail(String s) {
		int at = s.indexOf("@");
		int dot = s.indexOf(".");
		return at>0&&dot>0?true:false;
	}
	
	
	public boolean isMail(String s) {
		return s.contains(".")|s.contains(".")?true:false;
	}
	
	
	public String[] allUsersArray() {
		String [] utenti = new String[mappaUtenti.size()];
		int i =0;
		for(String idUtente:mappaUtenti.keySet()) {
			utenti[i] = idUtente + mappaUtenti.get(idUtente).toString();
			i++;
		}
		return utenti;
	}
	


	private void sortUsersASC(List<User> listaUsers) {
		Collections.sort(listaUsers, new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				if (o1.getNome().compareTo(o2.getNome()) < 0) {return -1;}
				if (o1.getCognome().compareTo(o2.getCognome()) < 0) {return -1;}
				return 1;
			}
	    }
	  );		
	}
	
	private void sortUsersDESC(List<User> lstUserSorted) {
		lstUserSorted.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				if (o1.getNome().compareTo(o2.getNome()) > 0) {return -1;}
				if (o1.getCognome().compareTo(o2.getCognome()) > 0) {return -1;}
				return 1;
			}
		});
	}

	

}
