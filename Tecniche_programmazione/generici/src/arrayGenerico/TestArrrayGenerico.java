package arrayGenerico;

public class TestArrrayGenerico {
	public static void main(String[] args) {
		
		ArrayGenerico ag = new ArrayGenerico();
		ag.add("ciao");
		ag.add(1);
		ag.add(true);
		
		System.out.println(ag);
		
		ag.remove(0);
		
		System.out.println(ag.size());
		
		ArrayGenerico<Integer> ag2 = new ArrayGenerico();
		ag2.add(1);
		ag2.add(2);
		ag2.add(3);
		
		System.out.println(ag2);
		
	}
}
