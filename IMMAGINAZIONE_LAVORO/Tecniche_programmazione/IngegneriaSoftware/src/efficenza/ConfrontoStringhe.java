package efficenza;

public class ConfrontoStringhe {

// Confronto non efficiente
	public boolean confrontaStringhe(String s1, String s2) {			

		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray(); 
		// se lunghezza stringhe diversa abbiamo un'eccezione
		for (int i = 0; i < s2Chars.length; i++) {
			if (s1Chars[i] != s2Chars[i]) {
				return false;
			}
		}	        
		return true;
	}
// confronto efficiente
	public boolean confrontaStringheE(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		for (int i = 0; i < s1Chars.length; i++) {
			if (s1Chars[i] != s2Chars[i]) {
				return false;
			}
		}
		return true;
	}

}
