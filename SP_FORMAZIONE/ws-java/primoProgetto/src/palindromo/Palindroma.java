package palindromo;

public class Palindroma {
	
	public static void main(String[] args) {
		
		String s = "i topi non avevano nipoti";
		
		String sComparable = comparableString(s);
		
		boolean palindrom = checkPalindrom(s.replaceAll("\\s", ""),sComparable);
		
		System.out.println(palindrom ? "palindroma" : "non palindroma");
		
	}
	
	private static String comparableString(String s) {
		String sComparable = "";
		for(int i = s.length()-1;i>=0;i--) {
			sComparable += s.charAt(i);
		}
		sComparable = sComparable.replaceAll("\\s", "");
		return sComparable;
	}

	private static boolean checkPalindrom(String s, String invertiString) {
		boolean palindrom= false;
		if(s.contentEquals(invertiString)) {
			palindrom = true;
		}
		return palindrom;
	}
	
}
