package view;

import controller.GestioneAccount;
import model.User;

public class GestioneAccountMain {
	public static void main(String[] args) {
		
		String path = "UserAccount.txt";
		
		GestioneAccount ga = new GestioneAccount(path);
		
		User user = ga.firstUser();
		
		System.out.println(user);
		
		ga.firstUsers(2);
		
		
		/*
		System.out.println(Arrays.toString(ga.userMails("U020")));
		
		System.out.println(Arrays.toString(ga.idUsers(0)));
		
		System.out.println(Arrays.toString(ga.idUsers(0)));
		System.out.println(Arrays.toString(ga.idUsers(1)));
		
		System.out.println(ga.existsUser("U057"));//false
		System.out.println(ga.userHasMail("U057"));//false
		
		System.out.println(ga.existsUser("U056"));//true
		System.out.println(ga.userHasMail("U056"));//true
		
		System.out.println(ga.user("U056"));//restituisce l'oggetto che passa da quel id
		System.out.println(ga.user("U057"));//Optional.empty
		
		System.out.println(Arrays.toString(ga.userMails("U056")));//[carlo.navone@hotmail.com, carlo.navone@libero.it]
		
		System.out.println(Arrays.toString(ga.users(1)));
		 * */
		
		
		
		
	}

}
