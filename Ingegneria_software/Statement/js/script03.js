//Ciclo for
//3 statement
//var i=0; -> inizializzazione
//i<0; -> condizione, determina il numero di cicli
//i++ ; aggiornamento, operatore di post incrmenento

for(var i=0;i<10;i++){
    console.log("Ciao: " + (i+1));
}

var frutta =["mela","pera","pesca"];

for(var i=0;i<frutta.length;i++){
    console.log(frutta[i]);
}

//esiste un for each in JS
var index =0;
frutta.forEach(function(frutto){
    console.log(frutto
        );
    index++;
});

//forof
for(const frutto of frutta){
    console.log(frutto);
}

//operatori di incremento++
// i++ post incremento
// ++i pre incremento
// i-- post incremento
// --i pre incremento

var eta = 30;
console.log(eta++);
console.log(eta);

var tuaEta = 20;
console.log(++tuaEta);//la var viene subito incrementata
console.log(tuaEta);

