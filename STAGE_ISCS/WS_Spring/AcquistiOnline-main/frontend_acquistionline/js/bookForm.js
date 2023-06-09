function Carrello(cod_cliente, tipo_pagamento, qt_articoli, cod_articolo) {

    this.cod_cliente = cod_cliente;
    this.tipo_pagamento = tipo_pagamento;
    this.qt_articoli = qt_articoli;
    this.cod_articolo = cod_articolo;
    

}

const btn = document.getElementById('btnBook');

btn.addEventListener('click', createBooking);

function createBooking() {

    //recupero i dati dalla session storage
    let utConnessoJSON = localStorage.getItem("data");
    let utConnesso = JSON.parse(utConnessoJSON)
    console.log(utConnesso)
    //prendo i dati che mi mancano dal form
    let cod_cliente = utConnesso.codCliente;
    let cod_articolo = document.getElementById('inputIdArticoli').value;
    let inputPagamento = document.getElementById('inputPagamento').value;
    let inputNumArticoli= document.getElementById('inputNumArticoli').value;

    let carrello = new Carrello(cod_cliente, inputPagamento, inputNumArticoli, cod_articolo);

    const dataSend = JSON.stringify(carrello);

    fetch('http://localhost:8080/acquistionline/carrello', {
        method: 'POST', headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, body: dataSend
    })
    .then(response => {
        if(response.status == 201) {
            alert('hai acquistato un articolo!')
        }else if(response.status==500){
            alert('articolo non disponibile')
        }
    });

}


//PUT

function CarrelloPut(id,cod_cliente, tipo_pagamento, qt_articoli, cod_articolo) {
    this.id = id;
    this.cod_cliente = cod_cliente;
    this.tipo_pagamento = tipo_pagamento;
    this.qt_articoli = qt_articoli;
    this.cod_articolo = cod_articolo;
    

}


const btnChange = document.getElementById('btnChange');

btnChange.addEventListener('click', changeBooking);

function changeBooking() {

    //recupero i dati dalla session storage
    let OrdiniJSON = localStorage.getItem("Ordini");
    let utOrdini = JSON.parse(OrdiniJSON)
    let utConnessoJSON = localStorage.getItem("data");
    let utConnesso = JSON.parse(utConnessoJSON)
    
    //prendo i dati che mi mancano dal form
    let idOrdine = document.getElementById('idOrdine').value;
    let cod_cliente = utConnesso.codCliente;
    let cod_articolo; 
    for(let i=0;i<utOrdini.length;i++){
        if(utOrdini[i].id == idOrdine){
cod_articolo = utOrdini[i].cod_articolo;
        }
    }
    
    let inputPagamento = utOrdini.tipo_pagamento;
    let inputModNumArticoli= document.getElementById('inputModNumArticoli').value;

    let carrello = new CarrelloPut(idOrdine,cod_cliente, inputPagamento, inputModNumArticoli, cod_articolo);

    const dataSend = JSON.stringify(carrello);

    fetch('http://localhost:8080/acquistionline/carrello', {
        method: 'PUT', headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        }, body: dataSend
    })
    .then(response => {
        console.log(response.status)
        if(response.status == 200) {
            alert('Modifica effettuata!')
        }else if(response.status==500){
            alert('articolo non disponibile')
        }
    });

}