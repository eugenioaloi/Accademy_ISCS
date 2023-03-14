package input;

import java.util.Scanner;

public class Input2 {
	public static void main(String[] args) {
		
		//convertire una temp da gradi cent a kelvin secondo la formula k=c+273.15
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserisci la temp in gradi centrigradi");
		double temp = sc.nextDouble();
		
		double kelvin = temp+273.15;
		
		System.out.println("Gradi Kelvin: " + kelvin);
		
		sc.close();
	}

}
