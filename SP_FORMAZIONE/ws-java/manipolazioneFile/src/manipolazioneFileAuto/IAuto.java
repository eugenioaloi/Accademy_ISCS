package manipolazioneFileAuto;

public interface IAuto {
	
	String[] rowsWrong();     // Righe errate as-is
	String[] rowsGood();      // Righe corrette
	String[] autoProducers();  // ritorna i produttori inseriti nel file
	String[] definedProducers();//ritorna i produttori previsti dall'ENUM
	boolean existsProducer(String produttoreAuto);
	boolean existsModel(String produttoreAuto, String modelloAuto);

}
