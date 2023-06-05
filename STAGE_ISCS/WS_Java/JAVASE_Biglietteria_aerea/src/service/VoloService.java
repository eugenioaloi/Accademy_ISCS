package service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import connessione.Connessione;
import error.IstanceNotFound;
import model.Volo;

public class VoloService implements IVoloService{

	@Override
	public List<Volo> getAllVoli() {
		List<Volo> voli = new ArrayList<>();
		String query = "select * from voli";
		try {
			ResultSet rs = Connessione.eseguiQuery(query);
			while(rs.next()) {
				String id_volo = rs.getString("id_volo");
				String partenza = rs.getString("partenza");
				String destinazione = rs.getString("destinazione");
				Date data_volo = rs.getDate("data_volo");
				String orario_volo = rs.getString("orario_volo");
				int posti_disp = rs.getInt("posti_disp");
				String nome_volo = rs.getString("nome_volo");
				voli.add(new Volo(id_volo, partenza, destinazione, data_volo,
						orario_volo,posti_disp, nome_volo));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return voli;
	}

	@Override
	public boolean existById(String idVolo) {
		List<Volo> voli = getAllVoli();
		for(Volo v: voli) {
			if(v.getIdVolo().contentEquals(idVolo)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Volo getVoloById(String idVolo) {
		List<Volo> voli = getAllVoli();
		boolean flag = existById(idVolo);
		for(Volo v:voli) {
			if(flag) {
				return v;			
			}
		}
		throw new IstanceNotFound("Volo con id " + idVolo + " non disponibile");
	}

}
