/*
var nomeUt= "paperino";
var benvenuto = document.getElementById("benvenuto");
benvenuto.innerHTML = "ciao " + nomeUt;

//stamp un saluto all'utente nel p #benvenuto

var elenco = document.getElementById("elenco");
for(i = 0;i<film.length;i++ ){
    elenco.innerHTML += "<li>"+  film[i] + "</li>" ;
}

//stampa il totale dei min nel div #sommaminuti
var somma = document.getElementById("sommaminuti");
var sommaMinuti = 0;
for(i = 0;i<durata.length;i++ ){
    sommaMinuti += durata[i];
}

somma.innerHTML = "<p>"+  sommaMinuti + "</p>" ;
*/

//Acquisizione nome utente
var username = prompt('Ciao utente, digita il tuo username');

var benvenuto = document.getElementById("benvenuto");
benvenuto.innerHTML="Ciao " + username + " ecco i film in sala";

//Mostra elenco film con relativa durata
var film= ["Fight club","Eternal sunshine of spotless mind","The godfather"];
var durata = [150,180,200,230];

var elenco = document.getElementById("elenco");
var sommaMinuti = document.getElementById("sommaMinuti")

var minutiTot = 0;

for(let i=0;i<film.length;i++){
    elenco.innerHTML += "<li>" + film[i] + "-" + durata[i] + " min </li";
    minutiTot += durata[i] ;
}

sommaMinuti.innerHTML = "<p> Minuti totali: "+  minutiTot + "</p>";


