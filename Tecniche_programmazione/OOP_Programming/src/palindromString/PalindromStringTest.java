package palindromString;

import java.util.Scanner;

public class PalindromStringTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean exit = true; 
				
		while(exit) {
			System.out.println("Do you want to check a word or a statment? \n"
					+ "- press \"out\" to exit \n"
					+ "- any other button to continue");
			String choose = sc.nextLine();
			if(choose.toLowerCase().equals("out")) {
				exit = false;
				System.out.println("Program closed");
				sc.close();
			}else {
				System.out.println("Choose a statment or a word ");
				String s = sc.nextLine();
				PalindromString ps = new PalindromString(s);
				ps.isPalindrom();
				System.out.println();
			}
		}
		
	}
}
