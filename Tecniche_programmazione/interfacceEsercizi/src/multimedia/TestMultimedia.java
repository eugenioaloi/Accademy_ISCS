package multimedia;

public class TestMultimedia {
	public static void main(String[] args) {
		
		Riproducibile[] riproduzioni = {new Audio(), new Video()};
		
		Multimedia [] multim = {new Canzone("ciao mare", 10, "pippo"),new Film("Java è bello", 50, 100)};
		
		/*Riproduzioni ha oggetti sia di tipo Audio e Video, che di Canzone e Film - si deve poter distinguere su quale ogg
		 viene chiamato play grazie alla distinzione di istance implementata nel metodo Play delle classi Video e Audio;
		 mi passi un istanza di questa classe allora chiamo il metodo altrimenti no*/
		
		for(Riproducibile rip:riproduzioni) {
			rip.play(multim);
		}
		
		//il metodo riproduci chiamato sull'oggetto Multimedia fa distinzione su quale oggetto chiamare il metodo
		for(Multimedia rip:multim) {
			rip.riproduci();
		}
		
	}
}
