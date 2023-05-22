package errors;

public class ElementNotInArchiveException extends ArchiveException{
	
	public ElementNotInArchiveException() {
		super();
	}

	@Override
	public String toString() {
		return "Elemento non presente nell'array";
	}
	
	

}
