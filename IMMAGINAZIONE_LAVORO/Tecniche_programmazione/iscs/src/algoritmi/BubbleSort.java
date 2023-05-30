package algoritmi;

public class BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {2,5,3,1,6};
		
		sort(arr);
		
		for(int n:arr) {
			System.out.print(n);
		}
		
	}
	
	private static int [] sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		return arr;
	}
	
}
