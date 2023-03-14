package input;

import java.util.Scanner;

public class Input3 {
	public static void main(String[] args) {
	
	/*numero con la virgola che rappresenta il tempo espresso in ore
	3.5 3 ore e mezza - 3.5*60=210
	-> stampare il risultato come numero intero*/
		
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Tell me the time by hour");
	double time = sc.nextDouble();
	
	int realTime = (int)(time*60);
	
	System.out.println("minutes: "+ realTime);
	
	sc.close();
	
	}

}
