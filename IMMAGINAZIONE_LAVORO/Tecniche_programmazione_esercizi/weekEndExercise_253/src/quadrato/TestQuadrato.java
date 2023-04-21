package quadrato;

import java.util.Scanner;

public class TestQuadrato {
	public static void main(String[] args) {
		
		Quadrato q1 = new Quadrato(5);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti quadrati vuoi inserire? - Ricorda è già presente un quadrato di dimensione lato: " + q1.getLato());
		int dim = sc.nextInt()+1;
		
		Quadrato [] quadrati = new Quadrato[dim];
		
		quadrati[0] = q1;
		
		for (int i = 1; i < quadrati.length; i++) {
			System.out.println("Quanto è lungo il lato del quadrato " + i);
			int lato = sc.nextInt();
			quadrati[i] = new Quadrato(lato);
		}
		
		stampaDettagli(quadrati);
		
		sc.close();
		
	}//main
	
	private static void stampaDettagli(Quadrato[] q) {
		int perimetroTot = 0;
		int indice = 0;
		int perMax = q[0].perimetro();
		for (int i = 0; i < q.length; i++) {
			if(perMax<q[i].perimetro()) {
				perMax = q[i].perimetro();
				indice = i;
			}else if (perMax==q[i].perimetro()) {
				continue;
			}
			System.out.println("Quadrato " +(i+1) + "\n- lato: " + q[i].getLato() + "\n- area: " + q[i].area() +
					"\n- perimetro: " + q[i].perimetro());
			perimetroTot += q[i].perimetro();
		}
		System.out.println("Perimetro tot: " + perimetroTot +
				". Il quadrato con il perimetro più grande si trova in posizione: " + indice);
	}
	
}//classe
