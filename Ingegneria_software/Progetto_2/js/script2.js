//stamp un saluto all'utente nel p #benvenuto
var nomeUt= "paperino";
var benvenuto = document.getElementById("benvenuto");
benvenuto.innerHTML = "ciao " + nomeUt;

//voglio creare un elenco di film con relativa durata e mostrarli nella pagina nel div #elenco
var film= ["Fight club","Eternal sunshine of spotless mind","The godfather"];
var durata = [150,180,200,230];

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



