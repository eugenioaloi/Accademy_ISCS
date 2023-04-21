package bubbleSort;

public class BubleSort {
	public static void main(String[] args) {
		
		int [] arr = {9,1,8,2,7,3,6,4,5};
		
		System.out.println("****** Prima del bubbleSort ******");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
		bubbleSort(arr);
		
		System.out.println("\n****** Dopo il bubbleSort ******");
		
		for(int n:arr) {
			System.out.print(n);
		}
		
	}

	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {//-1 perchè alla prima iter l'ultimo elemento è già maggiore
			for(int j=0;j<arr.length-i-1;j++) {//-1-i per rimanere un elemento prima della fine
				if(arr[j]>arr[j+1]) {
		//se a questa posizione trovi un elemento > dell'elemento sucessivo, scambia i valori - deve essere dopo
					int temp = arr[j];//-> temp serve solo a scambiare i valori
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}

}
