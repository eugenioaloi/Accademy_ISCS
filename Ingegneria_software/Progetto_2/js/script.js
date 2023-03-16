//Definisco gli array
//Gli array sono contenitori di elementi simili tra loro  e sono 0-based
//Ogni elementi ha un indice numerico che parte da 0 e la loro dimensione dipende dal num degli el presenti

//in JS gli arr si definiscono con le []
var frutta = [
    "mela",//0
    "pera",//1
    "banana",//2
    "fragola",//3
];

//prendo gli elementi singolarmente
console.log(frutta[0]);
console.log(frutta[1]);
console.log(frutta[2]);
console.log(frutta[3]);


//voglio conoscere la lunghezza dell'arr con la proprietà length
var lungArr= frutta.length;
console.log("Nell'arr di frutta ci sono: " + lungArr + " el");

for(i = 0;i<lungArr;i++){
    console.log(frutta[i]);
}

frutta.push("arancia");//aggiungo un elemento al fondo dell'array
frutta.sort();//ordino alfabeticamente
frutta.reverse();//inverto l'ordine
frutta.pop()//elimino l'ultimo elemento

console.log(frutta)

var demo = document.getElementById("demo");

demo.innerHTML = "<p>"+ frutta[0] + "</p>";//demo.innerHTML è una varibile

//con il solo = si riassegna la variabile, per fare l'incrimento si utilizza l'op incremento +=
demo.innerHTML += "<p>"+ frutta[1] + "</p>";
demo.innerHTML += "<p>"+ frutta[2] + "</p>";
demo.innerHTML += "<p>"+ frutta[3] + "</p>";

//Se ho tanta frutta non utilizzo la stampa singola, ma utilizzo un ciclo for
//1. I cicli for si applicano su tutto ciò che Iterabile, ovvero gli oggetti che hanno un indice

//2. In JS esistono 4 tipi di ciclo for

//(inizializzazione;condizione;incremento)
for(let i=0;i<frutta.length;i++){
    demo.innerHTML +="<li>"+ frutta[i] + "</li>";
}

//ATTENZIONE: posso fare arr misti, ma non servono a una mazza
var arrMisto=["pippo",20,true];
console.log(arrMisto);//si può stampare ma non ha un caso d'uso nel codice in maniera concreta