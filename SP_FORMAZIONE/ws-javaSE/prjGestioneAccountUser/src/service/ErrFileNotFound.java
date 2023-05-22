package service;

public class ErrFileNotFound extends Exception{
	
	private static final long serialVersionUID = 1L;

	public ErrFileNotFound(String pathFile) {
		super("Il file " + pathFile + " non esiste o non è stato trovato");
	}
	
}
