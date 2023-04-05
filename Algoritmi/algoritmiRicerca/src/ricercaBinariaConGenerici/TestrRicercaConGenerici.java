package ricercaBinariaConGenerici;

public class TestrRicercaConGenerici {
	public static void main(String[] args) {
		
		//Parametri Integer
		RicercaConGenerici<Integer> ricercaInt = new RicercaConGenerici();
		
		Integer[] arrNum = {9,6,4,2,8,3,1};
		int x = 1;
		
		if(ricercaInt.ricerca(arrNum, x)) {
			System.out.println(x + " è presente");
		}else {
			System.out.println(x + " non è presente");
		}
		
		//Parametri String
		RicercaConGenerici<String> ricercaString = new RicercaConGenerici();
		
		String [] arrStr = {"Sebastiano","Enrico","Marco","Beatrice","Arturo","Cesare","Roberta","Simone"}; 
		String s = "Arturo";
		
		if(ricercaString.ricerca(arrStr, s)) {
			System.out.println(s + " è presente");
		}else {
			System.out.println(s + " non è presente");
		}
				
	}

}
