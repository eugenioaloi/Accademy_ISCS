package package1;

import package2.Classe2;

public class TestPackage {
	public static void main(String[] args) {
		
		Classe1 c1 = new Classe1(10);
		System.out.println(c1);
		
		//per accedere a classi fuori dal package si devono importare con la dicitura import nomePackage.nomeClasse
		Classe2 c2 = new Classe2("oggetto");
		System.out.println(c2);
		
		
		
	}

}
