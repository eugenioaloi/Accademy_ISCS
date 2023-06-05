package service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

import connessione.Connessione;
import error.IstanceNotFound;
import model.Biglietto;
import model.Volo;

public class BigliettoService implements IBigliettoService{

	@Override
	public List<Biglietto> getAllBiglietti() {
		List<Biglietto> biglietti = new ArrayList<>();
		String query = "select * from biglietti";
		
		try {
			ResultSet rs = Connessione.eseguiQuery(query);
			while(rs.next()) {
				int cod_operazione = rs.getInt("cod_operazione");
				String cod_cliente = rs.getString("cod_cliente");
				String tipo_pagamento = rs.getString("tipo_pagamento");
				int qt_biglietti = rs.getInt("qt_biglietti");
				String id_volo = rs.getString("id_volo");
				biglietti.add(new Biglietto(cod_operazione, cod_cliente, tipo_pagamento, 
						qt_biglietti,id_volo));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return biglietti;
	}

	@Override
	public List<Biglietto> getAllBigliettiByCliente(String id_cliente) {
		List<Biglietto> biglietti = getAllBiglietti();
		List<Biglietto> bigliettiByIDCliente = new ArrayList<>();
		for(Biglietto b: biglietti) {
			if(b.getCodCliente().contentEquals(id_cliente)) {
				bigliettiByIDCliente.add(b);
			}
		}
		return bigliettiByIDCliente;
	}

	@Override
	public boolean existById(int idBiglietto) {
		List<Biglietto> biglietti = getAllBiglietti();
		for(Biglietto b:biglietti) {
			if(b.getCodOperazione()==idBiglietto) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Biglietto getBigliettoById(int idBiglietto) {
		List<Biglietto> biglietti = getAllBiglietti();
		boolean flag = existById(idBiglietto);
		for(Biglietto b:biglietti) {
			if(flag) {
				return b;			
			}
		}
		throw new IstanceNotFound("Biglietto con id " + idBiglietto + " non disponibile");
	}

	@Override
	public boolean addBiglietto(String cod_cliente, String tipo_pagamento,
			int qt_biglietti, String id_volo) {
		String query = "insert into biglietti "
				+ "		(cod_cliente,tipo_pagamento,qt_biglietti,id_volo)"
				+ "		values (?,?,?,?)";
		try {
			Connection con = Connessione.connettiDB();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, cod_cliente);
			ps.setString(2, tipo_pagamento);
			ps.setInt(3, qt_biglietti);
			ps.setString(4, id_volo);
			int n = ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateBiglietto(String cod_cliente, String tipo_pagamento,
			int qt_biglietti, String id_volo, int cod_operazione) {
		String query = "UPDATE biglietti "
				+ "SET cod_cliente = ?, tipo_pagamento= ?, qt_biglietti =?, id_volo=? "
				+ "WHERE cod_operazione = ?";
		
		try {
			Connection con = Connessione.connettiDB();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, cod_cliente);
			ps.setString(2, tipo_pagamento);
			ps.setInt(3, qt_biglietti);
			ps.setString(4, id_volo);
			ps.setInt(5, cod_operazione);
			int n = ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int getQtBigliettiComprati(String idVolo) {
		int count = 0;
		BigliettoService bs = new BigliettoService();
		List<Biglietto> biglietti = bs.getAllBiglietti();
		for(Biglietto bl: biglietti) {
			if(bl.getIdVolo().contentEquals(idVolo)) {
				count += bl.getQtBiglietti();
			}
		}
		return count;
	}

}
