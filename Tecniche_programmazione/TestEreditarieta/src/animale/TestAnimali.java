package animale;

public class TestAnimali {
	public static void main(String[] args) {
		
		Animale [] animali= {new Cane("briciola", 4),new Gatto("Milù", 7)};
		
		for(Animale anim:animali) {
			System.out.println(anim);
			anim.parla();
			anim.parla();
		}
		
		
	}

}
