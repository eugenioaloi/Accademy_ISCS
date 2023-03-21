//queste sotto sono variabili globali
var benvenuto = document.getElementById("benvenuto");
var btn = document.getElementById("btn");
var elenco = document.getElementById("elenco");

function saluta(){
    //nomeUt, variabile locale - scope limitato alla funzione
    var nomeUt = document.getElementById("nomeUtente").value;
    if(nomeUt == "" ){
        benvenuto.innerHTML ="Mi dispiace non hai scritto niente"
    }
    else{
        benvenuto.innerHTML = "Ciao " + nomeUt + " benvenuto sulla pagina";
        stampaFilm();
    }
}

function stampaFilm(){
    let films = "Dune, Avatar, Stranger Things";
    elenco.innerHTML ="Film del momento: " + films;
}

//on click è l'evento collegato al pulsante btn - la funzione saluta è collegata grazie all'evento
btn.onclick = saluta;