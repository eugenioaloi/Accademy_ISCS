var btn = document.getElementById("btn");
var listVoti = document.getElementById("listaVoti");

var studenti = ["Anna Rossi","Pippo Bianchi","Laura Verdi","Gianni Arancione"];
var voti = [30,17,25,26];

var promossi = 0;
var bocciati = 0;

// non stampa controllare perchè

function stampaVoti(){
    console.log("ciao");
    for(var i= 0;studenti.length;i++){
        let valutazione ="";

        if(voti[i]>=18){
            valutazione = "promosso"
            promossi++;
        }else{
            valutazione = "esame non superato"
            bocciati++;
        }
    }

    listVoti.innerHTML = "<li>" + studenti[i] + " voto: " + voti[i] + ". Valutazione: " + valutazione +"</li>";
}

btn.onclick = stampaVoti;