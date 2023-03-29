package casino;

import java.util.Random;

public class Dado implements Lanciabile{

	protected int ris;
	
	@Override
	public int lancia() {
		Random r = new Random();
		int num = r.nextInt(1,6);
		this.ris = num;
		return num;

	}

	@Override
	public String toString() {
		return "Dado lanciato ris= " + ris ;
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}

	
	
}
