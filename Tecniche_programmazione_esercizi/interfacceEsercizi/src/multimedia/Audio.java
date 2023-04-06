package multimedia;

public class Audio implements Riproducibile{
	
	@Override
	public void play(Multimedia[] m) {
		for(Multimedia multi:m) {
			if(multi instanceof Canzone) {//check per capire se l'oggetto è istanza di Canzone
				Canzone c = (Canzone)(multi);
				c.riproduci();
			}
		}
	}

}
