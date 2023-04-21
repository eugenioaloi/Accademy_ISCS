package classeGenerica;

public class TestClasseGenerica {
	public static void main(String[] args) {
		
		ClasseGenerica<Integer, Integer> oggInteger = new ClasseGenerica(1, 9);
		ClasseGenerica<Double, Double> oggDouble = new ClasseGenerica(1.1, 3.14);
		ClasseGenerica<String, Character> StringChar = new ClasseGenerica("Hello",'!');
		ClasseGenerica<Integer, String> intString = new ClasseGenerica(10,"Cane");
		
		ClasseGenerica misto = new ClasseGenerica('#',99);
		
		System.out.println(oggInteger);
		System.out.println(oggDouble);
		System.out.println(StringChar);
		System.out.println(intString);
		
		System.out.println(misto);
		
		Integer [] numeri = {1,2,3,4,5,6};
		
		if(oggInteger.cerca(3, numeri)) {
			System.out.println("3 è presente");
		}
		
		String[] stringhe = {"java","C++","Sql","Python"};
		if(StringChar.cerca("java", stringhe)) {
			System.out.println("java c'è");
		}
		
		
		
	}
}
