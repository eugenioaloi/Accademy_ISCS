package frutta;

public class Pesca  extends Frutta{

	Pesca(){
		peso = 0.3;
	}
	
	@Override
	public String toString() {
		return "Pesca: peso " + peso;
	}
	
}
