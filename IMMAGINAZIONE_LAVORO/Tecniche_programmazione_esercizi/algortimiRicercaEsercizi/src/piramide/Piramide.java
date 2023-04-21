package piramide;

public class Piramide {
	
	private static void stampaPiramide(int n) {
		if(n>0) {
			stampaPiramide(n-1);//6
			
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		int n=6;
		
		stampaPiramide(n);
		
	}//main
}//classe
