package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import model.User;
import service.ErrFileNotFound;
import service.IAccount;

public class GestioneAccount implements IAccount<User>{
	
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
				}else {
					righeKO.add(row);
				}
			}
			
			nome = checkToken;// se non è una mail è sicuramente nome etc
			
			//se la mail non è vuota l'aggiungo
			if(!email.isEmpty()) {
				addMail(idUser, email);
			}
			
			//se non c'è il cognome la riga è sbagliata
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
			}else {//da implementare questa parte
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
			Set<String> listaEmail = null;
			if(userHasMail(idUser)) {
				listaEmail =utente.getEmail();
				listaEmail.add(mail);
			}else {
				listaEmail = new LinkedHashSet<>();
				listaEmail.add(mail);
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
			try {
				if(listaEmail.isEmpty()) {
					return false;
				}
			} catch (NullPointerException e) {
				return false;
			}
		}
		return true;
	}

	@Override
	public Optional<User> user(String idUser) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public String[] idUsers(int sortType) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User firstUser() {
		return mappaUtenti.get(0);
	}

	@Override
	public User lastUser() {
		return mappaUtenti.get(mappaUtenti.size()-1);
	}

	@Override
	public User[] firstUsers(int numUsers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User[] lastUsers(int numUsers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] discardedRows() {
		return righeKO.toArray(new String[righeKO.size()]);
	}

	@Override
	public String[] allMails() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addRigakO(String riga) {
		this.righeKO.add(riga);
	}
	public void addRigaOK(String riga) {
		this.righeOK.add(riga);
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
	
}
