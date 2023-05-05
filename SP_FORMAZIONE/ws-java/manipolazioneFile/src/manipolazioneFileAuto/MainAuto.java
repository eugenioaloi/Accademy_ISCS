package manipolazioneFileAuto;

import java.util.Arrays;

public class MainAuto {
	public static void main(String[] args) {
		
		run();
		
	}
	
	private static void run() {
		Auto auto = new Auto();
		
		System.out.println("RIGA BUONA: " + Arrays.toString(auto.rowsGood()));
		System.out.println("RIGA CATTIVA :" +Arrays.toString(auto.rowsWrong()));
		
		System.out.println("Produttori estratti dal file: " + Arrays.toString(auto.autoProducers()));
		System.out.println("Produttori previsti dall'Enum: " + Arrays.toString(auto.definedProducers()));
		
		System.out.println(auto.existsProducer("ASFFSA"));//false
		System.out.println(auto.existsProducer("FIAT"));//true
		
		System.out.println(auto.existsModel("ASFFSA", "PANDA"));//false
		System.out.println(auto.existsModel("FIAT", "PANDA"));//true
	}
	
}
