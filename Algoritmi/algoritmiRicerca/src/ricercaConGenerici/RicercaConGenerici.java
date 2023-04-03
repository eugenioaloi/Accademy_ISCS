package ricercaConGenerici;

public class RicercaConGenerici<T>{
	
	T x;
	
	<T> boolean ricerca(T[] arr, T elementoDaCercare) {
		for(T a:arr ) {
			if(a instanceof String ) {
				if(((String) a).contains((String) elementoDaCercare)) {
					return true;
				}
			}else {
				if(a==elementoDaCercare) {
					return true;
				}
			}
		}
		return false;
	}
	
}
