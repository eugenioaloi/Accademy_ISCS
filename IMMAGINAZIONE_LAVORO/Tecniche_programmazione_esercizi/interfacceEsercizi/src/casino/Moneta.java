package casino;

import java.util.Random;

public class Moneta implements Lanciabile {

	protected  int ris;//0 testa - 1 croce
	
	@Override
	public int lancia() {
		Random r = new Random();
		int num = r.nextInt(2);
		this.ris = num;
		return num;
	}

	@Override
	public String toString() {
		return "Moneta lanciata ris =" + ris;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}
	

}
