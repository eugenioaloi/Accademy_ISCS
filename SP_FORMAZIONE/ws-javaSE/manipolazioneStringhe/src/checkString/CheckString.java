package checkString;

import java.util.Scanner;

public class CheckString {
	
	public static void main(String[] args) {
		String s = "123 ciao 0.2";
		
		System.out.println(checkString(s));
	}

	public static boolean checkString(String s) {
		
		Scanner sc = new Scanner(s);
		
		while (sc.hasNext()) {
			if(!sc.hasNextInt()) {
				return false;
			}
			if(!sc.hasNext()) {
				return false;
			}
			if(!sc.hasNextDouble()) {
				return false;
			}
		}
		
		return true;
	}

}
