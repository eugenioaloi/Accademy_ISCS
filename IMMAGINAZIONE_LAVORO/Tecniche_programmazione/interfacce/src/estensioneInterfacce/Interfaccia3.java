package estensioneInterfacce;

public interface Interfaccia3 {
	
	void scriviQualcosa();
	
	default void metodoDefault() {
		System.out.println("Sono un metodo di default");
	}
	
}
