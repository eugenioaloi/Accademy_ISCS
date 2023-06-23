function Biglietti(idSpettacolo, codCliente, tipoPagamento, qtBiglietti) {

    this.idSpettacolo = idSpettacolo;
    this.codCliente = codCliente;
    this.tipoPagamento = tipoPagamento;
    this.qtBiglietti = qtBiglietti;
    
    

}

const btn = document.getElementById('btnBook');

btn.addEventListener('click', createBooking);

function createBooking() {

    //recupero i dati dalla session storage
    let utConnessoJSON = localStorage.getItem("data");
    let utConnesso = JSON.parse(utConnessoJSON)
    console.log(utConnesso)
    //prendo i dati che mi mancano dal form
    let codCliente = utConnesso.codCliente;
    let idSpettacolo = document.getElementById('inputIdSpettacolo').value;
    let inputPagamento = document.getElementById('inputPagamento').value;
    let inputNumBiglietti= document.getElementById('inputNumBiglietti').value;

    // Biglietti(idSpettacolo, codCliente, tipoPagamento, qtBiglietti, prezzo) {

    let biglietti = new Biglietti(idSpettacolo, codCliente, inputPagamento, inputNumBiglietti);

    const dataSend = JSON.stringify(biglietti);

    fetch('http://localhost:8080/biglietteriaspettacoli/biglietto', {
        method: 'POST', headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, body: dataSend
    })
    .then(response => {
        if(response.status == 201) {
            alert('hai prenotato un biglietto!')
        }else if(response.status == 403){
            alert("Numero sbagliato!")
        } else {
              response.json()
              .then(data => {
                
                  alert(data.message)})
           
        }
    });

}
//PUT

function BigliettiPut(codOperazione, idSpettacolo, codCliente, tipoPagamento, qtBiglietti) {

    this.codOperazione = codOperazione;
    this.idSpettacolo = idSpettacolo;
    this.codCliente = codCliente;
    this.tipoPagamento = tipoPagamento;
    this.qtBiglietti = qtBiglietti;
    
    

}



const btnChange = document.getElementById('btnChange');

btnChange.addEventListener('click', changeBooking);

function changeBooking() {

    //recupero i dati dalla session storage
    let BigliettiJSON = localStorage.getItem("Biglietti");
    let utBiglietti = JSON.parse(BigliettiJSON)
      //utente
    let utConnessoJSON = localStorage.getItem("data");
    let utConnesso = JSON.parse(utConnessoJSON)
    
    //prendo i dati che mi mancano dal form
    let inputModNumBiglietti = document.getElementById('inputModNumBiglietti').value;
    let codCliente = utConnesso.codCliente;
    let codOperazione = document.getElementById('codBiglietto').value;

    console.log(utBiglietti);
   

    for(let i=0;i<utBiglietti.length;i++){
        //se nelle prenotazioni dell'utente registrate nel local storage 
        //c'è un coOperazione che corrisponde a quello inserito
        if(utBiglietti[i].codOperazione == codOperazione){
idSpettacolo = utBiglietti[i].idSpettacolo;
tipoPagamento = utBiglietti[i].tipoPagamento;
        }
    }
    
    
    

    let bigliettoPut = new BigliettiPut(codOperazione,idSpettacolo,codCliente, tipoPagamento, inputModNumBiglietti);
   console.log(bigliettoPut);
    const dataSend = JSON.stringify(bigliettoPut);

    fetch('http://localhost:8080/biglietteriaspettacoli/biglietto', {
        method: 'PUT', headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, body: dataSend
    })
    .then(response => {
        
        if(response.status == 200) {
            alert('Modifica effettuata!')
        }else if(response.status == 403){
            alert("Numero sbagliato!")}
            else{
            response.json()
            .then(data => {
                
                alert(data.message)})
           
        }
    });

}