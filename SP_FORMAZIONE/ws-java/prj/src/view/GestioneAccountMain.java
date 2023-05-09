package view;

import java.util.Arrays;

import controller.GestioneAccount;

public class GestioneAccountMain {
	public static void main(String[] args) {
		
		String path = "UserAccount.txt";
		
		GestioneAccount ga = new GestioneAccount(path);
		
		System.out.println("**** righe scartate ****");
		
		System.out.println(Arrays.toString(ga.discardedRows()));
		
		System.out.println("**** Utenti generati ****");
		
		System.out.println(Arrays.toString(ga.allUsersArray()));
		
		
	}

}
