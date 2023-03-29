package metodiDefault_codDAAGGIUNGERE;

public interface InterfacciaClassica {
	
	int numClas = 20;
	
	default void stampa() {
		System.out.println("Dentro l'interfaccia classica");
	}

}
