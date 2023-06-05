package error;

public class IstanceNotFound extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public IstanceNotFound(String message) {
		super(message);
	}

}
