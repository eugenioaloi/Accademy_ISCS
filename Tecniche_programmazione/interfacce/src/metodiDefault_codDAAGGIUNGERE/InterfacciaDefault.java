package metodiDefault_codDAAGGIUNGERE;

public interface InterfacciaDefault {
	
	int numDef = 10;//<-- implicitamente questi attributi sono public static final  
	
	default void stampa2() {
		System.out.println("Dentro l'interfaccia di default");
	}
	
}
