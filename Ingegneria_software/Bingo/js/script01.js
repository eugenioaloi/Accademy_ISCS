//elementi statici della pagina
var btn = document.getElementById("btn");

var numeri = [];


//TO DO: implementare la funzione

function estrai(){
    let quanteEstrazioni = document.getElementById("numDaEstrarre").value;
    for(let i=0;i<quanteEstrazioni;i++ ){
        var numeroCasuale = Math.ceil(Math.random()*5);
        console.log("num casuale: " + numeroCasuale)
        //se il numero casuale c'è nell'array, non inserirlo, altrimenti mettilo
        numeri[i]=numeroCasuale;
    }
   

    console.log(numeri);
}

btn.onclick = estrai;



// //Math.ceil arrotonda all'intero maggiore
// var numeroCasuale = Math.ceil(Math.random()*90);

// //Math.floor() arrotonda all'intero minore
// var numeroCasuale = Math.ceil((Math.random()*90)+1);

// console.log(numeroCasuale);

// //metodi utili per l'array
// var mioArr = ["Dario","Paola","Marco","Anna"];
// console.log(mioArr.indexOf("Dario"));//0

// console.log(mioArr.indexOf("Gloria"));//-1
// console.log(mioArr.includes("Gennaro"));//false
