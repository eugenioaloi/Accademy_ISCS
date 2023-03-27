package istitutoScolastico;

public class Voto {
	
	private String materia;//italiano, storia, geografia
	private int voto;
	
	public Voto(String materia, int voto) {
		this.materia = materia;
		this.voto = voto;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}
	
}
