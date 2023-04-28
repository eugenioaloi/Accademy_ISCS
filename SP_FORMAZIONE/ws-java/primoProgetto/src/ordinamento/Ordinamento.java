package ordinamento;

import java.util.Arrays;

public class Ordinamento {
	public static void main(String[] args) {
		
		int arr []= {8,7,9,2,3,1,5,4};
		
		ordinaArray(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	
	private static void ordinaArray(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
	}

}
