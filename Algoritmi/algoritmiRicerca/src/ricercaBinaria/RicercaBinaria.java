package ricercaBinaria;

public class RicercaBinaria {
	
	public static boolean cerca(int[] arr,int elDaTrovare) {
		int sx=0;
		int dx= arr.length-1;
		int midle = 0;
				
		while(sx!=dx) {
			midle = (sx+dx)/2;
			if(arr[midle]==elDaTrovare) {
				return true;
			}else {
				if(arr[midle]<elDaTrovare) {
					sx=midle+1;
				}else {
					sx=midle-1;
				}
			}
		}
		System.out.println("Singolo elem: " + arr[sx] + " alla posizione " + dx);
		
		return arr[sx] == elDaTrovare;
	}

	
}
