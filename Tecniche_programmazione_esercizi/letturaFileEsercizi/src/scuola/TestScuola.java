package scuola;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TestScuola {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Studente> studenti = new ArrayList<>();
		
		int limStud = 2;
		
		try {
			FileWriter fw = new FileWriter("Alunni.txt");
			for (int i=0;i<limStud;i++) {
				System.out.println("inserisci il nome dello studente");
				String nome = sc.nextLine();
				sc.nextLine();
				System.out.println("inserisci il cognome dello studente");
				String cognome = sc.nextLine();
				sc.nextLine();
				System.out.println("inserisci il voto da assegnare allo studente");
				int voto = sc.nextInt();
				sc.nextLine();
				studenti.add(new Studente(nome, cognome, voto));
				fw.write("Nome: " + nome + "\n");
				fw.write("Cognome: " + cognome+ "\n");
				fw.write("Voto: " + voto+ "\n");
			}
			fw.close();
		} catch (Exception e) {
			e.getMessage();
		}
		
		try(FileWriter promossi = new FileWriter("promossi.txt");
				FileWriter bocciati = new FileWriter("bocciati.txt")){
			for(Studente st: studenti) {
				String msg = st.promuovi();
				if(msg.contentEquals("promosso")) {
					promossi.write(st.getNome()+"\n");
					promossi.write(st.getCognome()+"\n");
				}else if(msg.contentEquals("bocciato")) {
					bocciati.write(st.getNome()+"\n");
					bocciati.write(st.getCognome()+"\n");
				}
				System.out.println(st);
			}
			promossi.close();
			bocciati.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
		
	}
}
