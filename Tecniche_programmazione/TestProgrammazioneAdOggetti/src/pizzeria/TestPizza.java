package pizzeria;

import java.util.Scanner;

public class TestPizza {
	public static void main(String[] args) {
		
		System.out.println("Che pizza vuoi?\n"
				+ "1 focaccia \n"
				+ "2 pizza rossa \n"
				+ "3 margherita \n"
				+ "4 farcita \n");
		
		Scanner sc = new Scanner(System.in);
		int scelta = sc.nextInt();
		sc.nextLine();
		
		Pizza p = new Pizza();
		
		switch(scelta) {
			case 1 -> {
					p=new Pizza("farina"); 
					break;
			}
			case 2 -> {
				p=new Pizza("farina","pomodoro"); 
				break;
			}
			case 3 -> {
				System.out.println("Mozzarella di bufala o normale?");
				p=new Pizza("farina","pomodoro",sc.nextLine()); 
				break;
			}
			case 4 -> {
				System.out.println("Scegli la mozzarella e l'extra");
				p=new Pizza("farina","pomodoro",sc.nextLine(),sc.nextLine()); 
				break;
			}
		}
		
		System.out.println(p);
		
	}
}
