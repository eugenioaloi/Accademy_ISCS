package listato3;

import java.util.Random;

public class Listato3_altro {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int [] numArr = new int[10];
		
		for(int i= 0;i<numArr.length;i++) {
			numArr[i] = r.nextInt(1,11);
			System.out.println(numArr[i] + " ");
		}
		
		System.out.println("Array without dupl: ");
		
		for (int i = 0; i < numArr.length; i++) {
			boolean duplicate = false;
			for (int j = 0; j < i; j++) {
				if(numArr[i]==numArr[j]) {
					duplicate = true;
					break;
				}
			}
			if(!duplicate) {
				//to do implements
			}
		}
		
		
	}

}
