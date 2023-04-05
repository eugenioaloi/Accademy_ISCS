package bubbleSort;

public class BubbleSort {
	
	static void bubbleSortNum(int[] arr) {  
		int n = arr.length;  
		int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){  
				//scambio gli elementi  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
		         }  
		                  
		    }  
		 }  
    }  
	
	static void bubbleSortString(String[] arr) {  
		int n = arr.length;  
		String temp = " ";  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1].compareToIgnoreCase(arr[j])>0  ){  
					//scambio gli elementi  
					temp = arr[j-1];  
					arr[j-1] = arr[j];  
					arr[j] = temp;  
				}  
				
			}  
		}  
	}  
	
    public static void main(String[] args) {
    	int [] num = {3,60,35,2,45,320,5};
    	
    	bubbleSortNum(num);
    	
    	for(int n:num) {
    		System.out.print(n +" ");
    	}
    	
    	System.out.println("\n********************");
    	
    	String [] parole = {"mare","ciao","oro","java","amaca"};
    	
    	bubbleSortString(parole);
    	
    	for(String s:parole) {
    		System.out.print(s +" ");
    	}
    	
    }  
}
