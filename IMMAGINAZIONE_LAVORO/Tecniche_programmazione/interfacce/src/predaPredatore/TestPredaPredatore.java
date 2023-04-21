package predaPredatore;

public class TestPredaPredatore {
	public static void main(String[] args) {
		
		Preda[] prede = {new Coniglio(), new Pesce()};
		Predatore[] predatori = {new Avvoltoio(), new Pesce()};
		
		//Coniglio c = new Preda();//<-- non si può istanziare un interfaccia così come una classe astratta
		
		for(Preda preda:prede) {
			preda.scappa();
		}
		for(Predatore predatore:predatori) {
			predatore.caccia();
		}
		
		
	}
}
