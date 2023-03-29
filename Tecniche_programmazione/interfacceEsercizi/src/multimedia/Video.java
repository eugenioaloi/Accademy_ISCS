package multimedia;

public class Video implements Riproducibile{

	@Override
	public void play(Multimedia[] m) {
		for(Multimedia multi:m) {
			if(multi instanceof Film) {//check per capire se l'oggetto è istanza di Canzone
				Film f = (Film)(multi);
				f.riproduci();
			}
		}
	}

}
