package errors;

public class ElementAlreadyInArchiveException extends ArchiveException{
	
	public ElementAlreadyInArchiveException() {
		super();
	}

	@Override
	public String toString() {
		return "Elemento già presente nell'archivio";
	}

}
