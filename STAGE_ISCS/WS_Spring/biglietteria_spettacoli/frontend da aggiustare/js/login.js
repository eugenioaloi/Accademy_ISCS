
const btnLogin = document.getElementById('btnLogin');
window.addEventListener("load", Loggato);
function Loggato(){

    //recupero i dati dalla session storage
  let utConnessoJSON = localStorage.getItem("data");
  let utConnesso = JSON.parse(utConnessoJSON);

  if(utConnesso){
    Login.style.display="none" ;
    Logout.style.display ="block";
saluto.innerHTML = "Ciao "+ utConnesso.nome +"!";
console.log(utConnesso)
mostraTabellaBiglietti()
  
  } else{
    Login.style.display= "block";
    Logout.style.display ="none";
  }
}

function checkCodCliente() {

    const cod_cliente = document.getElementById('inputUserCode').value;
    console.log(cod_cliente);
    fetch('http://localhost:8080/biglietteriaspettacoli/cliente/' + cod_cliente)
    .then(response =>{
        if(response.status == 200){
            response.json()

            .then(data => {
                let utLoggato = JSON.stringify(data);
                localStorage.setItem("data",utLoggato);
                Loggato();
                mostraTabellaBiglietti();
            })
        }else{
            alert('Mi dispiace, utente non registrato!');
        }
    })
}

btnLogin.addEventListener('click', checkCodCliente);

let btnPrenota = document.getElementById('btnPrenota');

//mostra elenco biglietti

let btnModificaBiglietto = document.getElementById('btnModificaBiglietto');

function mostraTabellaBiglietti(){
  //recupero i dati dalla session storage
  let utConnessoJSON = localStorage.getItem("data");
  let utConnesso = JSON.parse(utConnessoJSON)

  //prendo i dati che mi mancano dal form
  let codCliente = utConnesso.codCliente;
  let nome = utConnesso.nome;
  let cognome = utConnesso.cognome;

  fetch('http://localhost:8080/biglietteriaspettacoli/biglietto/'+codCliente)
  .then(response => response.json())
  .then(data => {
    //salvo le prenotazioni effettuate dall'utente nel local storage
    let BigliettiUtente = JSON.stringify(data);
    localStorage.setItem("Biglietti",BigliettiUtente);

      let table = `
      <tr>
        <th>Codice biglietto</th>
        <th>Nome</th>
        <th>Cognome</th>
        <th>Tipo pagamento</th>
        <th>Quantità biglietti</th>
        <th>Data dello spettacolo</th>
        <th>Artista</th>
        <th>Città</th>
        <th>Luogo evento</th>
        <th>Prezzo singolo</th>
        <th>Prezzo totale</th>
      </tr>
      `;
  
    for(let i = 0; i < data.length; i++) {
  
    table += `
      <tr>
        <td>${data[i].codOperazione}</td>
        <td>${nome}</td>
        <td>${cognome}</td>
        <td>${data[i].tipoPagamento}</td>
        <td>${data[i].qtBiglietti}</td>
        <td>${data[i].data}</td>
        <td>${data[i].artista}</td>
        <td>${data[i].citta}</td>
        <td>${data[i].luogo}</td>
        <td>${data[i].prezzo}€</td>
        <td>${data[i].prezzo * data[i].qtBiglietti}€</td>
      </tr>
        `;
    }
  let ticketsTitle = document.getElementById("ticketsTitle");
  ticketsTitle.style.display = "block";
  let btnPagamenti = document.getElementById("btnPagamenti");
  btnPagamenti.style.display= "block";
  btnModificaBiglietto.style.display = "block";
    document.getElementById('tableBiglietti').innerHTML = table;
 
  })
}

function goToPaginaPrenotazione(){
    window.location.replace('./bookForm.html');
  }


btnPrenota.addEventListener('click',goToPaginaPrenotazione)
btnModificaBiglietto.addEventListener('click',goToPaginaPrenotazione)

let saluto = document.getElementById("saluto");
let Login = document.getElementById("Login");
let Logout = document.getElementById("Logout");



Logout.addEventListener("click",()=>{
    localStorage.removeItem("data");
    window.location.replace('./home.html');
   
   
})