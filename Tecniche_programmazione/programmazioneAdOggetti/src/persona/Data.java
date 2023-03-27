package persona;

public class Data {
	
	private int giorno, mese, anno;

	public Data(int giorno, int mese, int anno) {
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public String toString() {
		return giorno + "/" + mese + "/" + anno;
	}
	
	
	
	
	

}
