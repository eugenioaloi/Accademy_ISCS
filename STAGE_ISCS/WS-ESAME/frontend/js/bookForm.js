function Biglietto(clienteid, tipopagamento, qtrichiesta, voloid) {
    this.clienteid = clienteid;
    this.tipopagamento = tipopagamento;
    this.qtrichiesta = qtrichiesta;
    this.voloid = voloid;
}

const btnBooking = document.getElementById('btnBook');

function createBooking() {

    //recupero i dati dalla session storage
    let utConnessoJSON = localStorage.getItem("data");
    let utConnesso = JSON.parse(utConnessoJSON)
    
    //prendo i dati che mi mancano dal form
    let clienteid = utConnesso.id;
    let voloid = document.getElementById('inputIdVolo').value;
    let tipopagamento = document.getElementById('inputPagamento').value;
    let qtrichiesta = document.getElementById('inputNumBiglietti').value;

    let biglietto = new Biglietto(clienteid, tipopagamento, qtrichiesta, voloid);
    
    const dataSend = JSON.stringify(biglietto);
    
    fetch('http://localhost:8080/gestionevoli/biglietto', {
        method: 'POST', headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, body: dataSend
    })
    .then(response => {
        if(response.status == 201) {
            alert("Hai prenotato " + qtrichiesta + " biglietti per il volo con id " + voloid);
        }else if(response.status==409){
            alert("Posti richiesti non disponibili")
        }else if(response.status==400){
            alert("Non è stato possibile aggiornare il biglietto")            
        }
    });
    
}
btnBooking.addEventListener('click', createBooking);

//*********** GESTIONE UPDATE ******************* */

function BigliettoUpd(id,clienteid, tipopagamento, qtrichiesta, voloid) {
    this.id = id;
    this.clienteid = clienteid;
    this.tipopagamento = tipopagamento;
    this.qtrichiesta = qtrichiesta;
    this.voloid = voloid;
}

let btnUpdate = document.getElementById("btnUpdate");

function updateBooking() {

    //recupero i dati dalla session storage
    let utConnessoJSON = localStorage.getItem("data");
    let utConnesso = JSON.parse(utConnessoJSON)
    
    //prendo i dati che mi mancano dal form
    let id = document.getElementById("IdOperazione").value;
    let clienteid = utConnesso.id;
    let tipopagamento = document.getElementById('tipopagamento').value;
    let qtrichiesta = document.getElementById('inputModNumBiglietti').value;
    let voloid = document.getElementById('voloid').value;

    let bigliettoUpd = new BigliettoUpd(id,clienteid,tipopagamento, qtrichiesta, voloid );
    
    const dataSend = JSON.stringify(bigliettoUpd);

    console.log(dataSend);
    
    fetch('http://localhost:8080/gestionevoli/biglietto', {
        method: 'PUT', headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, body: dataSend
    })
    .then(response => {
        if(response.status == 200) {
            alert("Biglietto con  id " + id + " è stato aggiornato correttamente");
        }else if(response.status==409){
            alert("Non è possibile aggiornare con i posti richiesti")
        }else if(response.status == 404){
            alert("Non è possibile aggiornare il biglietto richiesto")
        }
    });
    
}

btnUpdate.addEventListener("click",updateBooking);

let btnPagamento = document.getElementById("btnPagamento");

function goToCart(){
    window.location.replace('./shopCart.html');
}

btnPagamento.addEventListener("click",goToCart)
