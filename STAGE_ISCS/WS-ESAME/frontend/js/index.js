// vai alla pagina prenotazioni
let btnPrenotaVolo = document.getElementById('btnPrenotaVolo');

function goToPaginaPrenotazione(){
  window.location.replace('./bookForm.html');
}

btnPrenotaVolo.addEventListener('click',goToPaginaPrenotazione)

//mostra elenco dei voli
let btnElencoVoli = document.getElementById('btnElencoVoli');

function mostraTabellaVoli(){
    fetch('http://localhost:8080/gestionevoli/voli')
    .then(response => response.json())
    .then(data => {
       
        let table = `
            <tr>
                <th>ID volo</th>
                <th>Nome volo</th>
                <th>Partenza</th>
                <th>Destinazione</th>
                <th>Data volo</th>
                <th>Orario volo</th>
            </tr>`;
            
        for(let i = 0; i < data.length; i++) {

            table +=`
            <tr>
                <td>${data[i].id}</td>
                <td>${data[i].nomevolo}</td>
                <td>${data[i].partenza}</td>
                <td>${data[i].destinazione}</td>
                <td>${data[i].datavolo}</td>
                <td>${data[i].orapartenza}</td>
            </tr>`;
        }
      
    let tabella = document.getElementById('tableVoli')
    tabella.classList.add('nascondi');
    tabella.innerHTML = table;
    })
}
  
btnElencoVoli.addEventListener('click',mostraTabellaVoli)

//mostra elenco biglietti
let btnElencoPrenotazioni = document.getElementById('btnElencoPrenotazioni');

function mostraTabellaBiglietti(){
//recupero i dati dalla session storage
let utConnessoJSON = localStorage.getItem("data");
let utConnesso = JSON.parse(utConnessoJSON)

//prendo i dati che mi mancano dal form
let cliente_id = utConnesso.id;
let nome = utConnesso.nome;
let cognome = utConnesso.cognome;

fetch('http://localhost:8080/gestionevoli/biglietti/'+cliente_id)
.then(response => response.json())
.then(data => {
    
    console.log(data);

    let table = `
        <tr>
            <th>Codice operazione</th>
            <th>Nome</th>
            <th>Cogome</th>
            <th>Id volo</th>
            <th>Tipo pagamento</th>
            <th>Numero biglietti</th>
        </tr> `;
  
    for(let i = 0; i < data.length; i++) {
  
    table += `
    <tr>
        <td>${data[i].id}</td>
        <td>${nome}</td>
        <td>${cognome}</td>
        <td>${data[i].voloid}</td>
        <td>${data[i].tipopagamento}</td>
        <td>${data[i].qtrichiesta}</td>
    </tr>`;
    }
  
    document.getElementById('tableBiglietti').innerHTML = table;
  })
}

btnElencoPrenotazioni.addEventListener('click',mostraTabellaBiglietti)

let btnLogin = document.getElementById('btnLogin');

function goToLogin(){
  window.location.replace('./login.html');
}

btnLogin.addEventListener('click',goToLogin)

