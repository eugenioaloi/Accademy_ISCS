function Biglietto(idCliente, tipoPagamento, numeroBiglietti, idVolo) {
    this.codCliente = idCliente;
    this.tipoPagamento = tipoPagamento;
    this.qtBiglietti = numeroBiglietti;
    this.idVolo = idVolo;
}

const btn = document.getElementById('btnBook');

btn.addEventListener('click', createBooking);

function createBooking() {

    //recupero i dati dalla session storage
    let utConnessoJSON = localStorage.getItem("data");
    let utConnesso = JSON.parse(utConnessoJSON)

    console.log(utConnesso);

    //prendo i dati che mi mancano dal form
    let idCliente = utConnesso.codcliente;
    let idVolo = document.getElementById('inputIdVolo').value;
    let inputPagamento = document.getElementById('inputPagamento').value;
    let inputNumBiglietti = document.getElementById('inputNumBiglietti').value;

    let biglietto = new Biglietto(idCliente, inputPagamento, inputNumBiglietti, idVolo);

    const dataSend = JSON.stringify(biglietto);

    fetch('http://localhost:8080/gestionebiglietteria/biglietto', {
        method: 'POST', headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, body: dataSend
    })
    .then(response => {
        if(response.status == 201) {
            alert('hai prenotato il biglietto!')
        }else if(response.status==500){
            alert('posti richiesti non disponibili')
        }
    });

}
