package palindromString;

public class PalindromString {
	
	private String s;
	
	//constructor
	public PalindromString(String s) {
		setS(s);
	}

	//1 STEP: clean the String of any special Char
	public String cleanSpecialCh() {
		String givenS = getS();
		String emptyString = "";
		String [] splitString = givenS.split("[ -*/@]");
		
		//clean all special char and spaces
		for (String str:splitString){
			emptyString += str;
		}
		return emptyString;
	}
	
	//2 STEP: revers the given String
	public String reversedString() {
		String s = cleanSpecialCh();
		String reverseString ="";
		
		//reverse the given string
		for(int i= s.length()-1;i>=0;i--) {
			reverseString += s.charAt(i);
		}
		return reverseString;
	}
	
	//3 STEP: check if the reversed String is equal to the String given, therfore is palindrom otherwise it aint
	public void isPalindrom() {
		String str = reversedString();
		String s= cleanSpecialCh();
		
		boolean check=str.toLowerCase().contains(s.toLowerCase());
		
		String msg = check?"The String "+getS()+" is palindrom":"The String "+getS()+" is NOT palindrom";
		System.out.println(msg);
	}
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

}
