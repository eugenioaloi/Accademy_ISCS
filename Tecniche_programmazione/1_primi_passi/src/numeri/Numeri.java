package numeri;

import java.text.DecimalFormat;
import java.util.Random;

public class Numeri {
	
	public static void main(String[] args) {
		
		//utilizzo della classe Math
		
		int massimo = Math.max(5, 10);
		int minimo = Math.max(5, 10);
		double radice = Math.sqrt(8);
		double potenza = Math.pow(2, 3);
		
		System.out.println(Math.round(5.4)); //5.5->6
		
		double numero = 3.56432;
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println(df.format(numero));
		
		System.out.println(Math.ceil(5.4));//->6
		
		System.out.println(Math.floor(5.8));//->5
		
		//per il random si utilizza anche la classe Random
		Random random = new Random();
		
		int casualeInt = random.nextInt(0,11);//numeri da un estremo all'altro
		System.out.println("casualeInt: "+ casualeInt);
		
		double casualeDouble = random.nextDouble(0,11.0);//numeri da un estremo all'altro
		System.out.println("casualeDouble: "+casualeDouble);
		
		boolean casualeBool = random.nextBoolean();
		System.out.println("casualeBool: " + casualeBool);
		
		
	}

}
