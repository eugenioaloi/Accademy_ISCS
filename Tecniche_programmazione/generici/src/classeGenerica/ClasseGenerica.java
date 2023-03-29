package classeGenerica;

public class ClasseGenerica<Tipo, AltroTipo> {

	Tipo x;
	AltroTipo y;
	
	public ClasseGenerica(Tipo x, AltroTipo y) {
		this.x = x;
		this.y = y;
	}
	
	public Tipo getX() {
		return x;
	}
	
	public AltroTipo getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return getX() +" " + getY();
	}
	
	<T,A>boolean cerca(T tipo, A[] arr ) {
		for (int i = 0; i < arr.length; i++) {
			if(tipo==arr[i]) {
				return true;
			}
		}
		return false;
	}
	
}
