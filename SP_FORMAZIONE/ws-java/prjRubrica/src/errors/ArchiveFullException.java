package errors;

public class ArchiveFullException extends ArchiveException{
	
	public ArchiveFullException() {
		super();
	}

	@Override
	public String toString() {
		return "Array pieno";
	}
	
}
