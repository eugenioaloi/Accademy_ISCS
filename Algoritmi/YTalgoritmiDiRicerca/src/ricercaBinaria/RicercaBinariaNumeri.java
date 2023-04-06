package ricercaBinaria;

import java.util.Arrays;

public class RicercaBinariaNumeri {
	
	//la collezione deve essere ordinata per romperla in metà fino a quando non rimane un solo elemento
	
	// poco efficente con dataset piccole, molto efficente con dataset grandi
	
	//Complessità -> O(log(n))
	
	public static void main(String[] args) {
		
		int arr [] = new int[1_000_000];
		
		//20 step per trovare questo numero, contro i 777_777 che sarebbero serviti si fosse usata la ricerca lineare
		int target = 777_777;
		
		for(int i= 0;i<arr.length;i++) {
			arr[i] = i;
		}
		
		//si può usare la libreria di Java con la classe Arrays
		int index = Arrays.binarySearch(arr, target);
		
		String msg = index==-(arr.length+1) ?"elemento non trovato":"elemento trovato all'indice: " + index;
		System.out.println(msg+"\n");
		
		//oppure si crea l'algoritmo direttamente
		
		System.out.println("***** Implementazione algoritmo *****\n");
		int indice = ricercaBinaria(arr,target);
		
		if(indice!=-1) {
			System.out.println("\n elemento trovato all'indice: " + indice);
		}else {
			System.out.println("\n elemento non trovato");
		}
		
	}

	private static int ricercaBinaria(int[] arr, int target) {
		int basso= 0;
		int alto = arr.length-1;
		
		int conto = 1;
		
		while(basso<=alto) {//fino a quando cioè non c'è un solo elemento, quello che si sta cercando
			int meta = basso + (alto-basso)/2;//lung arr =10 -> meta = 0 + ((10-1)-0)/2 -> meta = 0+4.5 = 4
			int elemento = arr[meta];//-> trova l'elemento a metà
			
			System.out.println("step per trovare l'elemento " + conto);
			
			if(elemento<target) {//l'elemento trovato a metà è più piccolo del target
			//il valore che stiamo cercando è nella metà più grande l'estremo piccolo diventa la metà +1	
				basso = meta+1; 
			}else if(elemento>target) {//l'elemento trovato a metà è più piccolo del target
			//il valore che stiamo cercando è nella metà più piccol l'estremo grande diventa la metà -1
				alto = meta-1;
			}else {//ovvero elemento uguale al target. Elemento trovato
				return meta;
			}
			
			conto ++;
		}
		
		return -1;//elemento non trovato in nessun indice
	}

}
