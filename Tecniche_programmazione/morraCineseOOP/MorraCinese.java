package morraCineseOOP;

public class MorraCinese {
	
	private String choiceUt, choicePc;

	//metodo di controllo del gioco - ritorna il risultato del gioco
	public String checkGame(int numUt, int numPc) {
		String mess="";
		
		String [] choices = {"sasso","carta","forbice"};
		
		setChoiceUt(choices[numUt]);
		setChoicePc(choices[numPc]);
		
		System.out.println("ut: "+getChoiceUt());
		System.out.println("pc: "+getChoicePc());
		
		if(getChoicePc().equals(getChoiceUt())) {
			mess="pareggio";
		}
		//sasso batte forbice
			else if(getChoicePc().equals("sasso")&&getChoiceUt().equals("forbice")){
				mess="mi dispiace ha vinto il pc";
			}
		//carta batte sasso
			else if(getChoicePc().equals("carta")&&getChoiceUt().equals("sasso")){
				mess="mi dispiace ha vinto il pc";
			}
		//forbice batte carta
			else if(getChoicePc().equals("forbice")&&getChoiceUt().equals("carta")){
				mess="mi dispiace ha vinto il pc";
			}
		//se il pc non riesce a battere l'utente, ha vinto l'utente
			else {
				mess="Complimenti, hai vinto!";
			}
		return mess;
	}

	//GETTERS AND SETTERS
	
	public String getChoiceUt() {
		return choiceUt;
	}

	public void setChoiceUt(String choiceUt) {
		this.choiceUt = choiceUt;
	}

	public String getChoicePc() {
		return choicePc;
	}

	public void setChoicePc(String choicePc) {
		this.choicePc = choicePc;
	}

}
