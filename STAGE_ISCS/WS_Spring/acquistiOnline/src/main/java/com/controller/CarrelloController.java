package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.errors.ResourceNotFound;
import com.info.CarrelloInfo;
import com.info.MagazzinoInfo;
import com.model.Carrello;
import com.model.Magazzino;
import com.service.ICarrelloService;
import com.service.IMagazzinoService;

@RestController
@RequestMapping("acquistionline")
@CrossOrigin
public class CarrelloController {

	@Autowired
	private ICarrelloService serviceCarr;
	
	@Autowired
	private IMagazzinoService serviceMag;

	// GetAll
	@GetMapping(value = "carrelli", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<List<CarrelloInfo>> getAllCarrelli() {
		List<Carrello> listCS = new ArrayList<>();
		List<CarrelloInfo> listI = new ArrayList<>();
		listCS = serviceCarr.getAllCarrelli();
		for (int i = 0; i < listCS.size(); i++) {
			CarrelloInfo ob = new CarrelloInfo();
			BeanUtils.copyProperties(listCS.get(i), ob);
			listI.add(ob);
		}
		return new ResponseEntity<List<CarrelloInfo>>(listI, HttpStatus.OK);
	}

	//GetAllCarrelliByCodCliente
	@GetMapping(value="carrelli/{codCliente}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity <List<CarrelloInfo>> getAllCarrelliByCodCliente(@PathVariable ("codCliente") String codCliente){
		List<Carrello> listCS = new ArrayList<>();
		List<CarrelloInfo> listI = new ArrayList<>();
		listCS = serviceCarr.getAllCarrelliByCodCliente(codCliente);
		if(listCS.size()==0) {
			throw new ResourceNotFound("Non hai ancora effettutato gli ordini");
		}
		for (int i = 0; i < listCS.size(); i++) {
			CarrelloInfo ob = new CarrelloInfo();
			BeanUtils.copyProperties(listCS.get(i), ob);
			listI.add(ob);
		}
		return new ResponseEntity<List<CarrelloInfo>>(listI, HttpStatus.OK);
	}
	
	//add
	// si può aggiungere un biglietto, se non esiste già un biglietto con lo stesso id
	@PostMapping(value="carrello", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> addCarrello(@RequestBody CarrelloInfo info, UriComponentsBuilder builder){
		//posti disponibili per il volo
		Magazzino obj = serviceMag.getMagazzinoById(info.getCod_articolo());
		int qtDisp = obj.getQt_disponibile();
		//biglietti già comprati per il volo
		int artComprati = serviceCarr.get
		
		int bigliettiComprati = service.getQtBigliettiComprati(info.getIdVolo());
		int qtDaInserire = bigliettiComprati + info.getQtBiglietti();
		if(qtDaInserire > postiMax) {
			int bigliettiDisp = postiMax - bigliettiComprati;
			if(bigliettiDisp != 0) {
				throw new ExceptionResponse("Biglietti disponibili: "+bigliettiDisp, true);
			}else {
				throw new ExceptionResponse("Non sono disponibili " + info.getQtBiglietti()+" biglietti", false);
		}
			}
				
		Biglietto bl = new Biglietto();
		BeanUtils.copyProperties(info, bl);
		boolean flag = service.addBiglietto(bl);
		if(!flag) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("biglietto/{id}").buildAndExpand(bl.getCodOperazione()).toUri());
		return new ResponseEntity<Void>(headers,HttpStatus.CREATED);
	}
		
		//si può aggiornare un biglietto, se non esiste viene lanciato un 404
		@PutMapping(value = "biglietto", produces = { MediaType.APPLICATION_JSON_VALUE })
		public ResponseEntity<BigliettoInfo> updateCompany(@RequestBody BigliettoInfo info){
			Biglietto bl = new Biglietto();
			BeanUtils.copyProperties(info, bl);
			BigliettoInfo blInfo = new BigliettoInfo();
			BeanUtils.copyProperties(bl, blInfo);
			if(!service.existById(blInfo.getCodOperazione())) {
				return new ResponseEntity<BigliettoInfo>(blInfo,HttpStatus.NOT_FOUND);
			} 
			//posti disponibili per il volo
			int postiMax = voloService.getVoloById(info.getIdVolo()).getPostiDisp();
			//biglietti già comprati per il volo
			int bigliettiComprati = service.getQtBigliettiComprati(info.getIdVolo());
			
			int qtDaInserire = bigliettiComprati + info.getQtBiglietti();
			if(qtDaInserire > postiMax) {
				int bigliettiDisp = postiMax - bigliettiComprati;
				if(bigliettiDisp != 0) {
					throw new ExceptionResponse("Biglietti disponibili: "+bigliettiDisp, true);
				}else {
				throw new ExceptionResponse("Non sono disponibili " + info.getQtBiglietti()+" biglietti", false);
			}
				}
			
				//ottengo la quantità dei biglietti già segnata sul db per quel codiceOperazione
				int qtBigliettiDb = service.getBigliettoById(blInfo.getCodOperazione()).getQtBiglietti();
				//sommo il numero di biglietti aggiunti a qtBiglietti
				bl.setQtBiglietti(info.getQtBiglietti()+ qtBigliettiDb);
			
		
			service.updateBiglietto(bl);
			
			return new ResponseEntity<BigliettoInfo>(blInfo, HttpStatus.OK);
		}

	
	
	//update
	
	
	
}
